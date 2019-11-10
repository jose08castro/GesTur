package com.example.gestur.view.scoreFormView.spaFormView;

import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gestur.logic.forms.SpaForm;
import com.example.gestur.view.main.AbstractActivity;
import com.example.gestur.view.main.AbstractActivityComponent;

import static com.example.gestur.view.scoreFormView.cafeteriaFormView.ICafeteriaHeaderConstants.PLACES;
import static com.example.gestur.view.scoreFormView.cafeteriaFormView.ICafeteriaHeaderConstants.PLACE_NAME;
import static com.example.gestur.view.scoreFormView.cafeteriaFormView.ICafeteriaHeaderConstants.PLACE_TYPE;

public class SpaFormHeaderView extends AbstractActivityComponent implements ISpaFormHeaderViewConstants{

    private AbstractActivity context;
    private SpaForm form;
    private RelativeLayout layout;

    private TextView textTitle1;
    private TextView textTitle2;
    private TextView textTitle3;
    private TextView textTitle4;

    private TextView textName;
    private TextView textTypology;
    private TextView textCollabs;
    private TextView textRooms;

    private EditText editName;
    private Spinner editTypology;
    private EditText editCollabs;
    private EditText editRooms;

    public SpaFormHeaderView(SpaForm form, AbstractActivity context){
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
        setListeners();
        addItems();
    }
    private void setListeners(){
        editName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(!b){
                    form.setEstablishmentName(editName.getText().toString());
                }
            }
        });
        editCollabs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                String value = editCollabs.getText().toString();
                try {
                    form.setCollaborators(Integer.parseInt(value));
                }catch (Exception e){
                    form.setCollaborators(0);
                    Toast.makeText(context,"El valor debe ser numérico",Toast.LENGTH_SHORT).show();
                }
            }
        });
        editTypology.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                form.setTypology((String)editTypology.getSelectedItem());
            }
        });
        editRooms.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                String value = editRooms.getText().toString();
                try {
                    form.setRooms(Integer.parseInt(value));
                }catch (Exception e){
                    form.setRooms(0);
                    Toast.makeText(context,"El valor debe ser numérico",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override //Currently same as vertical
    protected void setItemsBoundsHorizontal() {
        addSpace(2,100);
        setBounds(textTitle1,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(textTitle2,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(textTitle3,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(textTitle4,1,TEXT_HEIGHT_V,0,true,false);

        setBounds(textName,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(editName,1,TEXT_HEIGHT_V,0,true,false);

        setBounds(textTypology,1,TEXT_HEIGHT_V,0,true,false);
        setSpinnerBounds(editTypology,1,TEXT_HEIGHT_V,0,true,false);

        setBounds(textRooms,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(editRooms,1,TEXT_HEIGHT_V,0,true,false);

        setBounds(textCollabs,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(editCollabs,1,TEXT_HEIGHT_V,0,true,false);
    }

    @Override
    protected void setItemsBoundsVertical() {
        addSpace(2,100);
        setBounds(textTitle1,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(textTitle2,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(textTitle3,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(textTitle4,1,TEXT_HEIGHT_V,0,true,false);

        setBounds(textName,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(editName,1,TEXT_HEIGHT_V,0,true,false);

        setBounds(textTypology,1,TEXT_HEIGHT_V,0,true,false);
        setSpinnerBounds(editTypology,1,TEXT_HEIGHT_V,0,true,false);

        setBounds(textRooms,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(editRooms,1,TEXT_HEIGHT_V,0,true,false);

        setBounds(textCollabs,1,TEXT_HEIGHT_V,0,true,false);
        setBounds(editCollabs,1,TEXT_HEIGHT_V,0,true,false);
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

        textTitle4.setText(TITLE4);
        textTitle4.setGravity(Gravity.CENTER);
        textTitle4.setTextSize(getTextSize(60));



        textName.setText(STABLISHMENT);
        textName.setTextSize(getTextSize(55));

        textTypology.setText(TYPOLOGY);
        textTypology.setTextSize(getTextSize(55));

        textRooms.setText(ROOMS);
        textRooms.setTextSize(getTextSize(55));

        textCollabs.setText(COLLABORATORS);
        textCollabs.setTextSize(getTextSize(55));



        editName.setText(form.getEstablishmentName());
        editName.setTextSize(getTextSize(60));

        editTypology.setAdapter(new ArrayAdapter<String>(context,android.R.layout.simple_spinner_dropdown_item,form.getTypologies()));
        if(form.getTypology().equals("Urbano")){
            editTypology.setSelection(0);
        }
        if(form.getTypology().equals("Playa")){
            editTypology.setSelection(1);
        }
        if(form.getTypology().equals("Montaña")){
            editTypology.setSelection(2);
        }
        if(form.getTypology().equals("Termomineral")){
            editTypology.setSelection(3);
        }
        if(form.getTypology().equals("Mixto")){
            editTypology.setSelection(4);
        }

        editRooms.setText(String.valueOf(form.getRooms()));
        editRooms.setTextSize(getTextSize(60));

        editCollabs.setText(String.valueOf(form.getCollaborators()));
        editCollabs.setTextSize(getTextSize(60));

    }

    private void createItems(){
        textTitle1 = new TextView(context);
        textTitle2 = new TextView(context);
        textTitle3 = new TextView(context);
        textTitle4 = new TextView(context);

        textName = new TextView(context);
        textTypology = new TextView(context);
        textCollabs = new TextView(context);
        textRooms = new TextView(context);

        editName = new EditText(context);
        editTypology = new Spinner(context);
        editCollabs = new EditText(context);
        editRooms = new EditText(context);
    }

    private void addItems(){
        layout.addView(textTitle1);
        layout.addView(textTitle2);
        layout.addView(textTitle3);
        layout.addView(textTitle4);

        layout.addView(textName);
        layout.addView(textTypology);
        layout.addView(textRooms);
        layout.addView(textCollabs);

        layout.addView(editName);
        layout.addView(editTypology);
        layout.addView(editRooms);
        layout.addView(editCollabs);
    }
}