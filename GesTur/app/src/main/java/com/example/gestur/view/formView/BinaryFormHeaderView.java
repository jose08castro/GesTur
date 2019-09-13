package com.example.gestur.view.formView;

import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.forms.BinaryForm;
import com.example.gestur.view.IHeaderView;

public class BinaryFormHeaderView implements IHeaderView,IBinaryFormHeaderViewConstants {

    private int width;
    private int height;
    private int layoutY;

    private TextView textTitle1;
    private TextView textTitle2;
    private TextView textTitle3;
    private TextView textName;

    private BinaryForm form;
    private int totalY;

    public BinaryFormHeaderView(BinaryForm form, AppCompatActivity context){
        this.form = form;
        textTitle1 = new TextView(context);
        textTitle2 = new TextView(context);
        textTitle3 = new TextView(context);
        textName = new TextView(context);

        totalY = 0;
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        width = screenX;
        height = screenY;
        layoutY = currentY;

        configItems();
        setItemsBounds();

        layout.addView(textTitle1);
        layout.addView(textTitle2);
        layout.addView(textTitle3);
        layout.addView(textName);

    }
    private void configItems(){
        textTitle1.setText(title1);
        textTitle1.setTextSize(18);
        textTitle1.setGravity(Gravity.CENTER);

        textTitle2.setText(title2);
        textTitle2.setTextSize(16);
        textTitle2.setGravity(Gravity.CENTER);

        textTitle3.setText(title3);
        textTitle3.setTextSize(18);
        textTitle3.setGravity(Gravity.CENTER);

        textName.setText(form.getName());
        textName.setTextSize(22);
        textName.setGravity(Gravity.CENTER);
    }
    private void setItemsBounds(){
        addSpace(3);
        setBounds(textTitle1,titleWidth,titleHeight,titleX);
        setBounds(textTitle2,titleWidth,titleHeight,titleX);
        setBounds(textTitle3,titleWidth,titleHeight,titleX);
        setBounds(textName,nameWidth,nameHeight,nameX);
    }
    private void setBounds(TextView view, float w, float h, float x){
        view.setWidth((int)(w*width));
        view.setHeight((int)(h*height));
        view.setX(x*width);
        view.setY(totalY+layoutY);
        totalY+=((int)(h*height));
    }
    private void addSpace(int space){
        totalY+=(space*height/100);
    }
    @Override
    public int getHeight() {
        return totalY;
    }
}
