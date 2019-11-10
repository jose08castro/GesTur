package com.example.gestur.view.checkListView;

import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.checkList.CheckListForm;
import com.example.gestur.view.IHeaderView;
import com.example.gestur.view.main.AbstractActivity;
import com.example.gestur.view.main.AbstractActivityComponent;
import com.example.gestur.view.main.IActivityComponent;

public class CheckListHeader extends AbstractActivityComponent implements ICheckListHeaderConstants {

    private TextView title1;
    private TextView title2;
    private TextView titleCheckList;

    private TextView textEnterprise;
    private TextView textEmail;
    private TextView textPhone;
    private TextView textDate;

    private EditText editEnterprise;
    private EditText editEmail;
    private EditText editPhone;
    private EditText editDate;

    private RelativeLayout layout;
    private CheckListForm form;
    private AbstractActivity context;

    public CheckListHeader(CheckListForm form, AbstractActivity context){
        super();
        this.form = form;
        this.context = context;
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        this.layout = layout;
        width = screenX;
        height = screenY;
        layoutY = currentY;
        createItems();
        setItemsConfiguration();
        setItemsBounds();
        addItems();
    }
    private void createItems(){
        title1 = new TextView(context);
        title2 = new TextView(context);
        titleCheckList = new TextView(context);

        textEnterprise = new TextView(context);
        textEmail = new TextView(context);
        textPhone = new TextView(context);
        textDate = new TextView(context);

        editEnterprise = new EditText(context);
        editEmail = new EditText(context);
        editPhone = new EditText(context);
        editDate = new EditText(context);

    }

    @Override
    protected void setItemsBoundsHorizontal() {
        setBounds(title1,1,title_height_V,0,true,false);
        setBounds(title2,1,title_height_V,0,true,false);
        setBounds(titleCheckList,1,title_height_V,0,true,false);
        setBounds(textEnterprise,field_width_V,text_height_V,field_X_V,true,false);
        setBounds(textEmail,field_width_V,text_height_V,field_X_V,true,false);
        setBounds(textDate,field_width_V,text_height_V,field_X_V,true,false);
        setBounds(textPhone,field_width_V,text_height_V,field_X_V,true,false);
        setBounds(editEnterprise,field_width_V,edit_height_V,field_X_V,true,false);
        setBounds(editEmail,field_width_V,edit_height_V,field_X_V,true,false);
        setBounds(editDate,field_width_V,edit_height_V,field_X_V,true,false);
        setBounds(editPhone,field_width_V,edit_height_V,field_X_V,true,false);
    }

    @Override
    protected void setItemsBoundsVertical() {
        setBounds(title1,1,title_height_V,0,true,false);
        setBounds(title2,1,title_height_V,0,true,false);
        setBounds(titleCheckList,1,title_height_V,0,true,false);
        addSpace(5,100);
        setBounds(textEnterprise,field_width_V,text_height_V,field_X_V,true,false);
        setBounds(editEnterprise,field_width_V,edit_height_V,field_X_V,true,false);
        setBounds(textEmail,field_width_V,text_height_V,field_X_V,true,false);
        setBounds(editEmail,field_width_V,edit_height_V,field_X_V,true,false);
        setBounds(textDate,field_width_V,text_height_V,field_X_V,true,false);
        setBounds(editDate,field_width_V,edit_height_V,field_X_V,true,false);
        setBounds(textPhone,field_width_V,text_height_V,field_X_V,true,false);
        setBounds(editPhone,field_width_V,edit_height_V,field_X_V,true,false);
    }

    @Override
    protected void setItemsConfiguration() {

        title1.setText(text_title1);
        title1.setGravity(Gravity.CENTER);
        title1.setTextSize(getTextSize(50));

        title2.setText(text_title2);
        title2.setGravity(Gravity.CENTER);
        title2.setTextSize(getTextSize(50));

        titleCheckList.setText(form.getTitleForm());
        titleCheckList.setGravity(Gravity.CENTER);
        titleCheckList.setTextSize(40);

        textEnterprise.setText(text_enterprise);
        textEnterprise.setTextSize(getTextSize(45));

        textEmail.setText(text_email);
        textEmail.setTextSize(getTextSize(45));

        textPhone.setText(text_phone);
        textPhone.setTextSize(getTextSize(45));

        textDate.setText(text_date);
        textDate.setTextSize(getTextSize(45));

        editEnterprise.setTextSize(getTextSize(45));
        editDate.setTextSize(getTextSize(45));
        editEmail.setTextSize(getTextSize(45));

        editPhone.setTextSize(getTextSize(45));
        editPhone.setInputType(InputType.TYPE_CLASS_PHONE);
    }

    private void addItems(){
        layout.addView(title1);
        layout.addView(title2);
        layout.addView(titleCheckList);

        layout.addView(textEnterprise);
        layout.addView(textEmail);
        layout.addView(textPhone);
        layout.addView(textDate);

        layout.addView(editEnterprise);
        layout.addView(editEmail);
        layout.addView(editDate);
        layout.addView(editPhone);
    }
}
