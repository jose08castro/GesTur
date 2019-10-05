package com.example.gestur.view.checkListView;

import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.checkList.CheckListForm;
import com.example.gestur.view.IHeaderView;

public class CheckListHeader implements IHeaderView,ICheckListHeaderConstants {

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

    private int width;
    private int height;
    private int layoutY;
    private int totalY;

    private RelativeLayout layout;
    private CheckListForm form;
    private AppCompatActivity context;

    public CheckListHeader(CheckListForm form, AppCompatActivity context){
        this.form = form;
        this.context = context;
        totalY = 0;
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        this.layout = layout;
        width = screenX;
        height = screenY;
        layoutY = currentY;

        createItems();
        configItems();
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
    private void configItems(){
        title1.setText(text_title1);
        title1.setGravity(Gravity.CENTER);
        title1.setTextSize(20);

        title2.setText(text_title2);
        title2.setGravity(Gravity.CENTER);
        title2.setTextSize(20);

        titleCheckList.setText(form.getTitleForm());
        titleCheckList.setGravity(Gravity.CENTER);
        titleCheckList.setTextSize(24);

    }
    private void setItemsBounds(){
        setBounds(title1,1,title_height_V,0);
        setBounds(title2,1,title_height_V,0);
        setBounds(titleCheckList,1,title_height_V,0);

    }
    private void addItems(){
        layout.addView(title1);
        layout.addView(title2);
        layout.addView(titleCheckList);
    }
    private void setBounds(TextView view, float w, float h, float x){
        view.setWidth((int)(w*width));
        view.setHeight((int)(h*height));
        view.setX(x*width);
        view.setY(totalY+layoutY);
        totalY+=((int)(h*height));
    }

    @Override
    public int getHeight() {
        return totalY;
    }
}
