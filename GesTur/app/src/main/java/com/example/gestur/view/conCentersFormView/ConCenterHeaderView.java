package com.example.gestur.view.conCentersFormView;


import android.view.Gravity;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.forms.ConCentersBinaryForm;
import com.example.gestur.view.main.AbstractActivity;
import com.example.gestur.view.main.AbstractActivityComponent;

public class ConCenterHeaderView extends AbstractActivityComponent implements IConCenterHeaderViewConstants {

    private ConCentersBinaryForm form;
    private AbstractActivity context;
    private RelativeLayout layout;

    private TextView textTitle1;
    private TextView textTitle2;
    private TextView textTitle3;
    private TextView textName;

    private TextView textEstablishment;
    private TextView textRooms;
    private TextView textPlaces;
    private TextView textCollabs;

    private EditText editEstablishment;
    private EditText editRooms;
    private EditText editPlaces;
    private EditText editCollabs;

    public ConCenterHeaderView(ConCentersBinaryForm form, AbstractActivity context){
        super();
        this.form = form;
        this.context = context;
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        width = screenX;
        height = screenY;
        layoutY = currentY;
        this.layout = layout;
        createItems();
        setItemsConfiguration();
        setItemsBounds();
        addItems();
    }

    private void createItems(){
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
    }
    private void addItems(){
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
    }
    @Override
    protected void setItemsBoundsHorizontal() {

    }

    @Override
    protected void setItemsBoundsVertical() {
        setBounds(textTitle1,1,title1Height,0,true,false);
        setBounds(textTitle2,1,title1Height,0,true,false);
        setBounds(textTitle3,1,title1Height,0,true,false);
        setBounds(textName,nameWidth,nameHeight,nameX,true,false);
        addSpace(5,100);
        setBounds(textEstablishment,extrasWidth,nameX,extrasX,true,false);
        setBounds(editEstablishment,extrasWidth,extrasHeight,extrasX,true,false);
        setBounds(textRooms,extrasWidth,extrasHeight,extrasX,true,false);
        setBounds(editRooms,extrasWidth,extrasHeight,extrasX,true,false);
        setBounds(textPlaces,extrasWidth,extrasHeight,extrasX,true,false);
        setBounds(editPlaces,extrasWidth,extrasHeight,extrasX,true,false);
        setBounds(textCollabs,extrasWidth,extrasHeight,extrasX,true,false);
        setBounds(editCollabs,extrasWidth,extrasHeight,extrasX,true,false);
        addSpace(5,100);
    }

    @Override
    protected void setItemsConfiguration() {
        textTitle1.setText(title1);
        textTitle1.setTextSize(getTextSize(60));
        textTitle1.setGravity(Gravity.CENTER);

        textTitle2.setText(title2);
        textTitle2.setTextSize(getTextSize(67));
        textTitle2.setGravity(Gravity.CENTER);

        textTitle3.setText(title3);
        textTitle3.setTextSize(getTextSize(56));
        textTitle3.setGravity(Gravity.CENTER);

        textName.setText(form.getName());
        textName.setTextSize(getTextSize(40));
        textName.setGravity(Gravity.CENTER);

        textEstablishment.setText(titleEstablishment);
        textRooms.setText(titleRooms);
        textPlaces.setText(titlePlaces);
        textCollabs.setText(titleCollabs);
        editEstablishment.setText(form.getEstablishmentName());
        editRooms.setText(form.getEventRooms()+"");
        editPlaces.setText(form.getPlaces()+"");
        editCollabs.setText(form.getCollaborators()+"");

    }
}
