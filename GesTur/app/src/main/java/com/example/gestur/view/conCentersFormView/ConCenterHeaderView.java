package com.example.gestur.view.conCentersFormView;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.ConCentersBinaryForm;
import com.example.gestur.view.IHeaderView;

public class ConCenterHeaderView implements IHeaderView, IConCenterHeaderViewConstants {

    private ConCentersBinaryForm form;

    TextView textTitle1;
    TextView textTitle2;
    TextView textTitle3;
    TextView textName;

    TextView textEstablishment;
    TextView textRooms;
    TextView textPlaces;
    TextView textCollabs;

    EditText editEstablishment;
    EditText editRooms;
    EditText editPlaces;
    EditText editCollabs;

    private int totalHeaderHeight;

    public ConCenterHeaderView(ConCentersBinaryForm form, AppCompatActivity context){
        this.form = form;

        textTitle1 = new TextView(context);
        textTitle2 = new TextView(context);
        textTitle3 = new TextView(context);
        textName = new TextView(context);

        textEstablishment = new TextView(context);
        textRooms = new TextView(context);
        textPlaces = new TextView(context);
        textCollabs = new TextView(context);

        editEstablishment = new EditText(context);
        editRooms = new EditText(context);
        editPlaces = new EditText(context);
        editCollabs = new EditText(context);

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
        layout.addView(textRooms);
        layout.addView(textPlaces);
        layout.addView(textCollabs);

        layout.addView(editEstablishment);
        layout.addView(editRooms);
        layout.addView(editPlaces);
        layout.addView(editCollabs);

        totalHeaderHeight += 200;
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
        textRooms.setText(titleRooms);
        textPlaces.setText(titlePlaces);
        textCollabs.setText(titleCollabs);
        editEstablishment.setText(form.getEstablishmentName());
        editRooms.setText(form.getEventRooms()+"");
        editPlaces.setText(form.getPlaces()+"");
        editCollabs.setText(form.getCollaborators()+"");

    }
    private void configVerticalBounds(int screenX, int screenY, int currentY){
        textTitle1.setX(title1X*screenX);
        textTitle2.setX(title2X*screenX);
        textTitle3.setX(title3X*screenX);
        textName.setX(nameX*screenX);
        textEstablishment.setX(extrasX*screenX);
        textRooms.setX(extrasX*screenX);
        textPlaces.setX(extrasX*screenX);
        textCollabs.setX(extrasX*screenX);
        editEstablishment.setX(extrasX*screenX);
        editRooms.setX(extrasX*screenX);
        editPlaces.setX(extrasX*screenX);
        editCollabs.setX(extrasX*screenX);

        setY(textTitle1,title1Height*screenY,currentY);
        setY(textTitle2,title1Height*screenY,currentY);
        setY(textTitle3,title1Height*screenY,currentY);
        setY(textName,nameX*screenY,currentY);
        setY(textEstablishment,extrasHeight*screenY,currentY);
        setY(editEstablishment,extrasHeight*screenY,currentY);
        setY(textRooms,extrasHeight*screenY,currentY);
        setY(editRooms,extrasHeight*screenY,currentY);
        setY(textPlaces,extrasHeight*screenY,currentY);
        setY(editPlaces,extrasHeight*screenY,currentY);
        setY(textCollabs,extrasHeight*screenY,currentY);
        setY(editCollabs,extrasHeight*screenY,currentY);
    }
    private void configVerticalSizes(int screenX, int screenY){
        textTitle1.setWidth((int)(title1Width*screenX));
        textTitle2.setWidth((int)(title2Width*screenX));
        textTitle3.setWidth((int)(title3Width*screenX));
        textName.setWidth((int)(nameWidth*screenX));
        textEstablishment.setWidth((int)(extrasWidth*screenX));
        textRooms.setWidth((int)(extrasWidth*screenX));
        textPlaces.setWidth((int)(extrasWidth*screenX));
        textCollabs.setWidth((int)(extrasWidth*screenX));
        editEstablishment.setWidth((int)(extrasWidth*screenX));
        editRooms.setWidth((int)(extrasWidth*screenX));
        editPlaces.setWidth((int)(extrasWidth*screenX));
        editCollabs.setWidth((int)(extrasWidth*screenX));

        textTitle1.setHeight((int)(title1Height*screenY));
        textTitle2.setHeight((int)(title2Height*screenY));
        textTitle3.setHeight((int)(title3Height*screenY));
        textName.setHeight((int)(nameHeight*screenY));
        textEstablishment.setHeight((int)(extrasHeight*screenY));
        textRooms.setHeight((int)(extrasHeight*screenY));
        textPlaces.setHeight((int)(extrasHeight*screenY));
        textCollabs.setHeight((int)(extrasHeight*screenY));
        editEstablishment.setHeight((int)(extrasHeight*screenY));
        editRooms.setHeight((int)(extrasHeight*screenY));
        editPlaces.setHeight((int)(extrasHeight*screenY));
        editCollabs.setHeight((int)(extrasHeight*screenY));
    }
    private void setY(View view, float value,int currentY){
        view.setY(value+currentY+totalHeaderHeight);
        totalHeaderHeight+=value;
    }
}
