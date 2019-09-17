package com.example.gestur.view.restaurantFormView;

import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.forms.RestaurantBinaryForm;
import com.example.gestur.view.IHeaderView;

public class RestaurantHeaderView implements IHeaderView,IRestaurantHeaderViewConstants {

    private RestaurantBinaryForm form;

    TextView textTitle1;
    TextView textTitle2;
    TextView textTitle3;
    TextView textName;

    TextView textEstablishment;
    TextView textEspecialty;
    TextView textTables;
    TextView textPlaces;
    TextView textCollabs;
    TextView textSchedule;

    EditText editEstablishment;
    EditText editEspecialty;
    EditText editTables;
    EditText editPlaces;
    EditText editCollabs;
    EditText editSchedule;

    private int totalHeaderHeight;

    public RestaurantHeaderView(RestaurantBinaryForm form, AppCompatActivity context){
        this.form = form;

        textTitle1 = new TextView(context);
        textTitle2 = new TextView(context);
        textTitle3 = new TextView(context);
        textName = new TextView(context);

        textEstablishment = new TextView(context);
        textEspecialty = new TextView(context);
        textTables = new TextView(context);
        textPlaces = new TextView(context);
        textCollabs = new TextView(context);
        textSchedule = new TextView(context);

        editEstablishment = new EditText(context);
        editEspecialty = new EditText(context);
        editTables = new EditText(context);
        editPlaces = new EditText(context);
        editCollabs = new EditText(context);
        editSchedule = new EditText(context);

        totalHeaderHeight = 0;
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        configText();
        //if(screenX<screenY){
        configVerticalBounds(screenX,screenY,currentY);
        configVerticalSizes(screenX,screenY);
        //}else{
        //configHorizontalBounds(screenX,screenY,currentY);
        //configHorizontalSizes(screenX,screenY);
        //}

        layout.addView(textTitle1);
        layout.addView(textTitle2);
        layout.addView(textTitle3);
        layout.addView(textName);

        layout.addView(textEstablishment);
        layout.addView(textEspecialty);
        layout.addView(textTables);
        layout.addView(textPlaces);
        layout.addView(textCollabs);
        layout.addView(textSchedule);

        layout.addView(editEstablishment);
        layout.addView(editEspecialty);
        layout.addView(editTables);
        layout.addView(editPlaces);
        layout.addView(editCollabs);
        layout.addView(editSchedule);

        totalHeaderHeight += 200;

        textTitle1.setGravity(Gravity.CENTER); //IMPORTANTE
    }

    @Override
    public int getHeight() {
        return totalHeaderHeight;
    }

    private void configText(){
        textTitle1.setText(title1);
        textTitle2.setText(title2);
        textTitle3.setText(title3);
        textName.setText(form.getName());

        textEstablishment.setText(titleEstablishment);
        textEspecialty.setText(titleEspecialty);
        textTables.setText(titleTables);
        textPlaces.setText(titlePlaces);
        textCollabs.setText(titleCollabs);
        textSchedule.setText(titleSchedule);

        editEstablishment.setText(form.getEstablishmentName());
        editEspecialty.setText(form.getSpecialty());
        editTables.setText(form.getTables()+"");
        editPlaces.setText(form.getPlaces()+"");
        editCollabs.setText(form.getCollaborators()+"");
        editSchedule.setText(form.getSchedule());

    }
    private void configVerticalBounds(int screenX, int screenY, int currentY){
        textTitle1.setX(title1X*screenX);
        textTitle2.setX(title2X*screenX);
        textTitle3.setX(title3X*screenX);
        textName.setX(nameX*screenX);
        textEstablishment.setX(extrasX*screenX);
        textEspecialty.setX(extrasX*screenX);
        textTables.setX(extrasX*screenX);
        textPlaces.setX(extrasX*screenX);
        textCollabs.setX(extrasX*screenX);
        textSchedule.setX(extrasX*screenX);
        editEstablishment.setX(extrasX*screenX);
        editEspecialty.setX(extrasX*screenX);
        editTables.setX(extrasX*screenX);
        editPlaces.setX(extrasX*screenX);
        editCollabs.setX(extrasX*screenX);
        editSchedule.setX(extrasX*screenX);

        setY(textTitle1,title1Height*screenY,currentY);
        setY(textTitle2,title1Height*screenY,currentY);
        setY(textTitle3,title1Height*screenY,currentY);
        setY(textName,nameX*screenY,currentY);
        setY(textEstablishment,extrasHeight*screenY,currentY);
        setY(editEstablishment,extrasHeight*screenY,currentY);
        setY(textEspecialty,extrasHeight*screenY,currentY);
        setY(editEspecialty,extrasHeight*screenY,currentY);
        setY(textTables,extrasHeight*screenY,currentY);
        setY(editTables,extrasHeight*screenY,currentY);
        setY(textPlaces,extrasHeight*screenY,currentY);
        setY(editPlaces,extrasHeight*screenY,currentY);
        setY(textCollabs,extrasHeight*screenY,currentY);
        setY(editCollabs,extrasHeight*screenY,currentY);
        setY(textSchedule,extrasHeight*screenY,currentY);
        setY(editSchedule,extrasHeight*screenY,currentY);
    }
    private void configVerticalSizes(int screenX, int screenY){
        textTitle1.setWidth((int)(title1Width*screenX));
        textTitle2.setWidth((int)(title2Width*screenX));
        textTitle3.setWidth((int)(title3Width*screenX));
        textName.setWidth((int)(nameWidth*screenX));

        textEstablishment.setWidth((int)(extrasWidth*screenX));
        editEstablishment.setWidth((int)(extrasWidth*screenX));
        textEspecialty.setWidth((int)(extrasWidth*screenX));
        editEspecialty.setWidth((int)(extrasWidth*screenX));
        textTables.setWidth((int)(extrasWidth*screenX));
        editTables.setWidth((int)(extrasWidth*screenX));
        textPlaces.setWidth((int)(extrasWidth*screenX));
        editPlaces.setWidth((int)(extrasWidth*screenX));
        textCollabs.setWidth((int)(extrasWidth*screenX));
        editCollabs.setWidth((int)(extrasWidth*screenX));
        textSchedule.setWidth((int)(extrasWidth*screenX));
        editSchedule.setWidth((int)(extrasWidth*screenX));

        textTitle1.setHeight((int)(title1Height*screenY));
        textTitle2.setHeight((int)(title2Height*screenY));
        textTitle3.setHeight((int)(title3Height*screenY));
        textName.setHeight((int)(nameHeight*screenY));
        textEstablishment.setHeight((int)(extrasHeight*screenY));
        editEstablishment.setHeight((int)(extrasHeight*screenY));
        textEspecialty.setHeight((int)(extrasHeight*screenY));
        editEspecialty.setHeight((int)(extrasHeight*screenY));
        textTables.setHeight((int)(extrasHeight*screenY));
        editTables.setHeight((int)(extrasHeight*screenY));
        textPlaces.setHeight((int)(extrasHeight*screenY));
        editPlaces.setHeight((int)(extrasHeight*screenY));
        textCollabs.setHeight((int)(extrasHeight*screenY));
        editCollabs.setHeight((int)(extrasHeight*screenY));
        textSchedule.setHeight((int)(extrasHeight*screenY));
        editSchedule.setHeight((int)(extrasHeight*screenY));
    }
    private void setY(View view, float value, int currentY){
        view.setY(value+currentY+totalHeaderHeight);
        totalHeaderHeight+=value;
    }
}