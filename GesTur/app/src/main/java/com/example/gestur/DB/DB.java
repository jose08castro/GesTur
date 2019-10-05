package com.example.gestur.DB;

import android.support.annotation.NonNull;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Arrays;
import java.util.List;

public class DB {
    private FirebaseAuth mAuth;
    private List<AuthUI.IdpConfig> providers;
    private DatabaseReference databaseReference;
    private FirebaseDatabase firebaseDatabase;
    private FirebaseUser currentUser;

    public DB(){
        databaseReference = FirebaseDatabase.getInstance().getReference();
        firebaseDatabase = FirebaseDatabase.getInstance();
        mAuth = FirebaseAuth.getInstance();
        providers = Arrays.asList(new AuthUI.IdpConfig.EmailBuilder().build());
    }
    public boolean registerUser(final String email, final String pass) {
        mAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    //logIn(email,pass);
                    //attemptResult = true;
                } else {
                    //attemptResult = false;
                }
            }
        });
        return true;
    }
    public void setFormDefinitions(){
        //firebaseDatabase.getReference("FormsDefinition/FormTematics").setValue(FormDefFactory.getFormTematicsDef()); //Ready
        //firebaseDatabase.getReference("FormsDefinition/FormHotels").setValue(FormDefFactory.getFormHotelDef()); //Ready

        //firebaseDatabase.getReference("FormsDefinition/FormTravelAgencies").setValue(FormDefFactory.getFormTravelAgenciesDef());
        //firebaseDatabase.getReference("FormsDefinition/FormRentVehicles").setValue(FormDefFactory.getFormRentVehiculesDef());
        //firebaseDatabase.getReference("FormsDefinition/FormAirLines").setValue(FormDefFactory.getFormCafeteriaDef());
        //firebaseDatabase.getReference("FormsDefinition/FormWaterTransport").setValue(FormDefFactory.getFormWaterTransportDef());
        //firebaseDatabase.getReference("FormsDefinition/FormConCenters").setValue(FormDefFactory.getFormConCentersDef());
        //firebaseDatabase.getReference("FormsDefinition/FormEnterprise").setValue(FormDefFactory.getFormEnterpriseDef());
        //firebaseDatabase.getReference("FormsDefinition/FormRestaurant").setValue(FormDefFactory.getFormRestaurantDef());
        //firebaseDatabase.getReference("FormsDefinition/FormFondaSoda").setValue(FormDefFactory.getFormFondaSodaDef());
        //firebaseDatabase.getReference("FormsDefinition/FormCafeteria").setValue(FormDefFactory.getFormCafeteriaDef());
        //firebaseDatabase.getReference("FormsDefinition/FormWaterActivities").setValue(FormDefFactory.getFormWaterActivitiesDef());
        //firebaseDatabase.getReference("FormsDefinition/FormAirActivities").setValue(FormDefFactory.getFormAirActivitiessDef());
        //firebaseDatabase.getReference("FormsDefinition/FormSpa").setValue(FormDefFactory.getFormSpaDef()); // Falta
    }
}
