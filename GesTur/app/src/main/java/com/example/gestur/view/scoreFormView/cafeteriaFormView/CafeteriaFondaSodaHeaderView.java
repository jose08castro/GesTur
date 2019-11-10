package com.example.gestur.view.scoreFormView.cafeteriaFormView;

import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.forms.CafeteriaFondaSodaForm;
import com.example.gestur.view.main.AbstractActivityComponent;

public class CafeteriaFondaSodaHeaderView extends AbstractActivityComponent implements ICafeteriaHeaderConstants{

    private AppCompatActivity context;
    private CafeteriaFondaSodaForm form;
    private RelativeLayout layout;

    private TextView textTitle1;
    private TextView textTitle2;
    private TextView textTitle3;
    private TextView textFormName;

    private TextView textName;
    private TextView textType;
    private TextView textTables;
    private TextView textPlaces;
    private TextView textCollabs;

    private EditText editName;
    private TextView editType;
    private TextView editTables;
    private TextView editPlaces;
    private TextView editCollabs;

    public CafeteriaFondaSodaHeaderView(CafeteriaFondaSodaForm form, AppCompatActivity context){
        super();
        this.context = context;
        this.form = form;
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        this.width = screenX;
        this.height = screenY;
        this.layoutY = currentY;
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
        textFormName = new TextView(context);

        textName = new TextView(context);;
        textType = new TextView(context);;
        textTables = new TextView(context);;
        textPlaces = new TextView(context);;
        textCollabs = new TextView(context);;

        editName = new EditText(context);
        editType = new EditText(context);
        editTables = new EditText(context);
        editPlaces = new EditText(context);
        editCollabs = new EditText(context);
    }
    private void addItems(){
        layout.addView(textTitle1);
        layout.addView(textTitle2);
        layout.addView(textTitle3);
        layout.addView(textFormName);

        layout.addView(textName);
        layout.addView(textType);
        layout.addView(textTables);
        layout.addView(textPlaces);
        layout.addView(textCollabs);

        layout.addView(editName);
        layout.addView(editType);
        layout.addView(editTables);
        layout.addView(editPlaces);
        layout.addView(editCollabs);
    }
    @Override //Currently same as vertical
    protected void setItemsBoundsHorizontal() {
        addSpace(2,100);
        setBounds(textTitle1,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(textTitle2,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(textTitle3,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(textFormName,1,TEXT_HEIGHT_V,0,true,false);

        setBounds(textName,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(editName,1,TEXT_HEIGHT_V,0,true,false);

        setBounds(textType,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(editType,1,TEXT_HEIGHT_V,0,true,false);

        setBounds(textTables,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(editTables,1,TEXT_HEIGHT_V,0,true,false);

        setBounds(textPlaces,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(editPlaces,1,TEXT_HEIGHT_V,0,true,false);

        setBounds(textCollabs,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(editCollabs,1,TEXT_HEIGHT_V,0,true,false);
    }

    @Override
    protected void setItemsBoundsVertical() {
        addSpace(1,100);
        setBounds(textTitle1,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(textTitle2,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(textTitle3,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(textFormName,1,TEXT_HEIGHT_V,0,true,false);

        setBounds(textName,TEXT_WIDTH_V,TEXT_HEIGHT_V,TEXT_X_V,true,false);
        setBounds(editName,TEXT_WIDTH_V,TEXT_HEIGHT_V,TEXT_X_V,true,false);

        setBounds(textType,TEXT_WIDTH_V,TEXT_HEIGHT_V,TEXT_X_V,true,false);
        setBounds(editType,TEXT_WIDTH_V,TEXT_HEIGHT_V,TEXT_X_V,true,false);

        setBounds(textTables,TEXT_WIDTH_V,TEXT_HEIGHT_V,TEXT_X_V,true,false);
        setBounds(editTables,TEXT_WIDTH_V,TEXT_HEIGHT_V,TEXT_X_V,true,false);

        setBounds(textPlaces,TEXT_WIDTH_V,TEXT_HEIGHT_V,TEXT_X_V,true,false);
        setBounds(editPlaces,TEXT_WIDTH_V,TEXT_HEIGHT_V,TEXT_X_V,true,false);

        setBounds(textCollabs,TEXT_WIDTH_V,TEXT_HEIGHT_V,TEXT_X_V,true,false);
        setBounds(editCollabs,TEXT_WIDTH_V,TEXT_HEIGHT_V,TEXT_X_V,true,false);
    }

    @Override
    protected void setItemsConfiguration() {
        textTitle1.setText(TITLE1);
        textTitle1.setGravity(Gravity.CENTER);
        textTitle1.setTextSize(getTextSize(60));

        textTitle2.setText(TITLE2);
        textTitle2.setGravity(Gravity.CENTER);
        textTitle2.setTextSize(getTextSize(67));

        textTitle3.setText(TITLE3);
        textTitle3.setGravity(Gravity.CENTER);
        textTitle3.setTextSize(getTextSize(60));

        textFormName.setText(form.getName());
        textFormName.setGravity(Gravity.CENTER);
        textFormName.setTextSize(getTextSize(55));

        textName.setText(PLACE_NAME);
        textName.setTextSize(getTextSize(55));

        textType.setText(PLACE_TYPE);
        textType.setTextSize(getTextSize(55));

        textTables.setText(TABLES);
        textTables.setTextSize(getTextSize(55));

        textPlaces.setText(PLACES);
        textPlaces.setTextSize(getTextSize(55));

        textCollabs.setText(COLLABORATORS);
        textCollabs.setTextSize(getTextSize(55));

        editName.setText(form.getEstablishmentName());
        editName.setTextSize(getTextSize(60));

        editType.setText(form.getPlaceType());
        editType.setTextSize(getTextSize(60));

        editTables.setText(String.valueOf(form.getTables()));
        editTables.setTextSize(getTextSize(60));

        editPlaces.setText(String.valueOf(form.getPlaces()));
        editPlaces.setTextSize(getTextSize(60));

        editCollabs.setText(String.valueOf(form.getCollaborators()));
        editCollabs.setTextSize(getTextSize(60));

    }
}
