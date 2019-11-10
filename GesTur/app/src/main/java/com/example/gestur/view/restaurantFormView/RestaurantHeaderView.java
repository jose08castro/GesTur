package com.example.gestur.view.restaurantFormView;

import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.forms.RestaurantBinaryForm;
import com.example.gestur.view.IHeaderView;
import com.example.gestur.view.main.AbstractActivity;
import com.example.gestur.view.main.AbstractActivityComponent;

public class RestaurantHeaderView extends AbstractActivityComponent implements IHeaderView,IRestaurantHeaderViewConstants {

    private RestaurantBinaryForm form;
    private AbstractActivity context;
    private RelativeLayout layout;

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

    public RestaurantHeaderView(RestaurantBinaryForm form, AbstractActivity context){
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
    }
    private void addItems(){
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
    }

    @Override
    protected void setItemsBoundsHorizontal() {

    }

    @Override
    protected void setItemsBoundsVertical() {
        setBounds(textTitle1,1,title1Height,0,true,false);
        setBounds(textTitle2,1,title1Height,0,true,false);
        setBounds(textTitle3,1,title1Height,0,true,false);
        setBounds(textName,1,title1Height,0,true,false);

        setBounds(textEstablishment,extrasWidth,extrasHeight,extrasX,true,false);
        setBounds(editEstablishment,extrasWidth,extrasHeight,extrasX,true,false);

        setBounds(textEspecialty,extrasWidth,extrasHeight,extrasX,true,false);
        setBounds(editEspecialty,extrasWidth,extrasHeight,extrasX,true,false);

        setBounds(textTables,extrasWidth,extrasHeight,extrasX,true,false);
        setBounds(editTables,extrasWidth,extrasHeight,extrasX,true,false);

        setBounds(textPlaces,extrasWidth,extrasHeight,extrasX,true,false);
        setBounds(editPlaces,extrasWidth,extrasHeight,extrasX,true,false);

        setBounds(textCollabs,extrasWidth,extrasHeight,extrasX,true,false);
        setBounds(editCollabs,extrasWidth,extrasHeight,extrasX,true,false);

        setBounds(textSchedule,extrasWidth,extrasHeight,extrasX,true,false);
        setBounds(editSchedule,extrasWidth,extrasHeight,extrasX,true,false);
    }

    @Override
    protected void setItemsConfiguration() {
        textTitle1.setText(title1);
        textTitle1.setGravity(Gravity.CENTER);
        textTitle2.setText(title2);
        textTitle2.setGravity(Gravity.CENTER);
        textTitle3.setText(title3);
        textTitle3.setGravity(Gravity.CENTER);
        textName.setText(form.getName());
        textName.setGravity(Gravity.CENTER);

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


}
