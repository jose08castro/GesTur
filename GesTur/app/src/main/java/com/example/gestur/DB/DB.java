package com.example.gestur.DB;

import android.support.annotation.NonNull;

import com.example.gestur.DB.definitionCheckListClasses.CheckListDef;
import com.example.gestur.DB.definitionFormClasses.FormDefBinary;
import com.example.gestur.DB.definitionFormClasses.FormDefCafeteriaFondaSoda;
import com.example.gestur.DB.definitionFormClasses.FormDefConCenters;
import com.example.gestur.DB.definitionFormClasses.FormDefHotel;
import com.example.gestur.DB.definitionFormClasses.FormDefRestaurant;
import com.example.gestur.DB.definitionFormClasses.FormDefSpa;
import com.example.gestur.logic.Activity;
import com.example.gestur.logic.Address;
import com.example.gestur.logic.checkList.CheckListForm;
import com.example.gestur.logic.forms.Form;
import com.example.gestur.view.main.IObservable;
import com.example.gestur.logic.User;
import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DB {
    private FirebaseAuth mAuth;
    private List<AuthUI.IdpConfig> providers;
    private DatabaseReference databaseReference;
    private FirebaseDatabase firebaseDatabase;
    private FirebaseUser currentFireBaseUser;

    private User currentUser;
    private Activity currentActivity;
    private Form currentForm;
    private CheckListForm currentCheckListForm;

    private boolean registerUserResult;
    private boolean registerUserDataResult;
    private boolean logInResult;

    private int currentFormType;
    private int currentCheckType;

    private static DB db = new DB();

    private IObservable observable;

    private DB(){
        databaseReference = FirebaseDatabase.getInstance().getReference();
        firebaseDatabase = FirebaseDatabase.getInstance();
        mAuth = FirebaseAuth.getInstance();
        providers = Arrays.asList(new AuthUI.IdpConfig.EmailBuilder().build());
        registerUserResult = false;
        registerUserDataResult = false;
        logInResult = false;
        currentUser = null;
        currentFireBaseUser = null;
    }
    public static DB getInstance(){
        return db;
    }

    public User getCurrentUser(){
        return currentUser;
    }
    public boolean logIn(String userName, String password, IObservable observable){
        return searchUserWithUserName(userName,password,observable);
    }
    public void logOut(){
        mAuth.signOut();
        currentFireBaseUser = null;
        currentUser = null;
        logInResult = false;
        registerUserResult = false;
        registerUserDataResult = false;
    }
    private void logInWhenUserFound(final IObservable observable){
        mAuth.signInWithEmailAndPassword(currentUser.getEmailAddress(), currentUser.getPassword()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    currentFireBaseUser = mAuth.getCurrentUser();
                    observable.notifyObservable(1,"LogIn exitoso");
                } else {
                    observable.notifyObservable(2,"LogIn falló");

                }
            }
        });
    }
    private boolean searchUserWithUserName(final String userName, final String password, final IObservable observable){
        if(currentUser == null) {
            DatabaseReference ref = firebaseDatabase.getReference("Users");
            ref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    for(DataSnapshot ds : dataSnapshot.getChildren()){
                        UserDummy user = ds.getValue(UserDummy.class);
                        if(user.userName.equals(userName) && user.password.equals(password)){
                            currentUser = DummyRealFactory.getRealClass(user);
                            logInWhenUserFound(observable);
                        }
                    }
                    if(currentUser == null){
                        observable.notifyObservable(2,"Fallo al encontrar la información del usuario");
                    }
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });
        }
        return true;
    }

    public Form requestForm(final String form, final int type){
        DatabaseReference ref = firebaseDatabase.getReference("FormsDefinition").child(form);
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot ds : dataSnapshot.getChildren()){
                    if(type == 1 | type == 3 | type == 4 | type == 5 | type == 6 | type == 8 | type == 12 | type == 13){//Error long coonversion
                        FormDefBinary form = ds.getValue(FormDefBinary.class);
                        currentForm = DummyRealFactory.getRealClass(form);
                        observable.notifyObservable(3,"Encontre BinaryForm: "+currentForm.getName());
                    }else if(type == 2){
                        FormDefHotel form = ds.getValue(FormDefHotel.class);
                        currentForm = DummyRealFactory.getRealClass(form);
                        observable.notifyObservable(3,"Encontre HotelForm "+currentForm.getName());
                    }else if(type == 7){
                        FormDefConCenters form = ds.getValue(FormDefConCenters.class);
                        currentForm = DummyRealFactory.getRealClass(form);
                        observable.notifyObservable(3,"Encontre ConCentersForm "+currentForm.getName());
                    }else if(type == 9){
                        FormDefRestaurant form = ds.getValue(FormDefRestaurant.class);
                        currentForm = DummyRealFactory.getRealClass(form);
                        observable.notifyObservable(3,"Encontre RestaurantForm "+currentForm.getName());
                    }else if(type == 10 | type == 11){
                        FormDefCafeteriaFondaSoda form = ds.getValue(FormDefCafeteriaFondaSoda.class);
                        currentForm = DummyRealFactory.getRealClass(form);
                        observable.notifyObservable(3,"Encontre Cafe/soda/fonda "+currentForm.getName());
                    }else if(type == 14){
                        FormDefSpa form = ds.getValue(FormDefSpa.class);
                        currentForm = DummyRealFactory.getRealClass(form);
                        observable.notifyObservable(3,"Encontre SpaForm "+currentForm.getName());
                    }
                    currentActivity.setForm(currentForm);
                    currentUser.addActivity(currentActivity);

                    //InfoPasser.getInstance().setCheckListForm(currentCheckListForm);
                    //InfoPasser.getInstance().setCurrentForm(currentForm);
                    observable.notifyObservable(1,"Prueba todo bien");

                    break;
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        return  null;
    }
    public void requestCheckList(String check){
        DatabaseReference ref = firebaseDatabase.getReference("CheckListDefinitions").child(check);
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot ds : dataSnapshot.getChildren()){
                    CheckListDef form = ds.getValue(CheckListDef.class);
                    currentCheckListForm = DummyRealFactory.getRealClass(form);
                    currentActivity.setCheckListForm(currentCheckListForm);
                    DummyRealFactory.getForm(currentFormType);
                    observable.notifyObservable(3,"Encontre CheckList "+currentCheckListForm.getTitleForm());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    public void registerUser(String id,String fullName,String email,String username,String password,String date,String phoneNumber,IObservable observable){
        this.observable = observable;
        registerUserData(id,fullName,email,username,password,date,phoneNumber);
    }
    public boolean registerFireBaseUser(final String email, final String pass) {
        mAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    currentFireBaseUser = mAuth.getCurrentUser();
                    observable.notifyObservable(1,"Usuario creado exitosamente");
                } else {
                    observable.notifyObservable(2,"No se pudo crear el usuario");
                }
            }
        });
        return registerUserResult;
    }
    public void registerUserData(String id, String fullName, final String email, String username, final String password, String date, String phoneNumber)
    {
        User user = new User(id,fullName,username,email,password,date,null);
        user.addPhoneNumber(phoneNumber);
        currentUser = user;
        firebaseDatabase.getReference("Users").push().setValue(user.getUserDummy()).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()) {
                    registerFireBaseUser(email,password);
                }else{
                    observable.notifyObservable(2,"No se pudo guardar la informacion");
                }
            }
        });
    }

    public void addActivity(String activityName,int type,int checkType,boolean operative,String province,String canton,String district,String address, IObservable observable)
    {
        this.observable = observable;
        this.currentFormType = type;
        this.currentCheckType = checkType;

        currentActivity = new Activity(activityName,new Address(province,canton,district,address),operative,type);
        DummyRealFactory.getCheckList(checkType);

    }

    private User searchUserWithEmail(final String emailAddress, final String password){
        DatabaseReference ref = firebaseDatabase.getReference("Users");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Map<String, Object> objectMap = (HashMap<String, Object>) dataSnapshot.getValue(); //Users
                for (Object obj : objectMap.values()) {
                    User user = (User) obj;
                    if (user.getEmailAddress().equals(emailAddress) & user.getPassword().equals(password)) {
                        currentUser = user;
                        break;
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        return currentUser;
    }


    public void setFormDefinitions(){
        firebaseDatabase.getReference("FormsDefinition/FormTematics").push().setValue(FormDefFactory.getFormTematicsDef()); //Ready
        firebaseDatabase.getReference("FormsDefinition/FormHotels").push().setValue(FormDefFactory.getFormHotelDef()); //Ready

        firebaseDatabase.getReference("FormsDefinition/FormTravelAgencies").push().setValue(FormDefFactory.getFormTravelAgenciesDef()); //Missing questions
        firebaseDatabase.getReference("FormsDefinition/FormRentVehicles").push().setValue(FormDefFactory.getFormRentVehiclesDef()); //Missing questions
        firebaseDatabase.getReference("FormsDefinition/FormAirLines").push().setValue(FormDefFactory.getFormAirLinesDef()); //Missing questions
        firebaseDatabase.getReference("FormsDefinition/FormWaterTransport").push().setValue(FormDefFactory.getFormWaterTransportDef());//Missing questions

        firebaseDatabase.getReference("FormsDefinition/FormConCenters").push().setValue(FormDefFactory.getFormConCentersDef());//FALTA
        firebaseDatabase.getReference("FormsDefinition/FormEnterprise").push().setValue(FormDefFactory.getFormEnterpriseDef());//Missing questions
        firebaseDatabase.getReference("FormsDefinition/FormRestaurant").push().setValue(FormDefFactory.getFormRestaurantDef()); //Missing questions
        firebaseDatabase.getReference("FormsDefinition/FormFondaSoda").push().setValue(FormDefFactory.getFormFondaSodaDef());//FALTA
        firebaseDatabase.getReference("FormsDefinition/FormCafeteria").push().setValue(FormDefFactory.getFormCafeteriaDef());//FALTA
        firebaseDatabase.getReference("FormsDefinition/FormWaterActivities").push().setValue(FormDefFactory.getFormWaterActivitiesDef());//Missing questions
        firebaseDatabase.getReference("FormsDefinition/FormAirActivities").push().setValue(FormDefFactory.getFormAirActivitiesDef());//Missing questions

        firebaseDatabase.getReference("FormsDefinition/FormSpa").push().setValue(FormDefFactory.getFormSpaDef()); //Missing questions
    }
    public void setCheckListDefinitions(){
        firebaseDatabase.getReference("CheckListDefinitions/CheckListTematics_Hotel").push().setValue(CheckListDefFactory.getCheckListTematic_Hotel());
        firebaseDatabase.getReference("CheckListDefinitions/CheckListTematics_Hotel_IndianZone").push().setValue(CheckListDefFactory.getCheckListTematic_Hotel_IndianZone());
        firebaseDatabase.getReference("CheckListDefinitions/CheckListTravelAgency").push().setValue(CheckListDefFactory.getCheckListTravelAgency());

        firebaseDatabase.getReference("CheckListDefinitions/CheckListVehicleLease").push().setValue(CheckListDefFactory.getCheckListVehicleLease());
        firebaseDatabase.getReference("CheckListDefinitions/CheckListAirLine").push().setValue(CheckListDefFactory.getCheckListAirLine());
        firebaseDatabase.getReference("CheckListDefinitions/CheckListWaterTransport").push().setValue(CheckListDefFactory.getCheckListWaterTransport());

        firebaseDatabase.getReference("CheckListDefinitions/CheckListConCenters").push().setValue(CheckListDefFactory.getCheckListConCenters());
        firebaseDatabase.getReference("CheckListDefinitions/CheckListGastronomicEnterprise").push().setValue(CheckListDefFactory.getCheckListGastronomicEnterprise());
        firebaseDatabase.getReference("CheckListDefinitions/CheckListWaterActivity").push().setValue(CheckListDefFactory.getCheckListWaterActivity());

        firebaseDatabase.getReference("CheckListDefinitions/CheckListAirActivity").push().setValue(CheckListDefFactory.getCheckListAirActivity());
        firebaseDatabase.getReference("CheckListDefinitions/CheckListSpa").push().setValue(CheckListDefFactory.getCheckListSpa());
    }

    /*firebaseDatabase.getReference("Users").push().setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {

            }
    });*/
    /*Map<String, Object> objectMap = (HashMap<String, Object>) dataSnapshot.getValue(); //Users
                    for (Object obj : objectMap.values()) {
                        Map<String, Object> mapObj = (Map<String, Object>) obj;
                        UserDummy user = (UserDummy)mapObj;
                        if (user.userName.equals(userName) & user.password.equals(password)) {
                            currentUser = user.getRealClass();
                            break;
                        }
                    }*/
}
