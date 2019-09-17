package com.example.gestur.view.formView;

import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.forms.BinaryForm;
import com.example.gestur.view.IFooterView;

public class BinaryFormFooterView implements IFooterView,IBinaryFormFooterViewConstants {

    private BinaryForm form;
    private int width;
    private int height;
    private int layoutY;

    private TextView textTotalPoints;
    private TextView textTotalPercentage;

    private TextView totalPoints;
    private TextView totalPercentage;

    private int totalY;

    public BinaryFormFooterView(BinaryForm form, AppCompatActivity context){
        this.form = form;
        textTotalPercentage = new TextView(context);
        textTotalPoints = new TextView(context);
        totalPoints = new TextView(context);
        totalPercentage = new TextView(context);

        totalY = 0;
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {

        width = screenX;
        height = screenY;
        layoutY = currentY;

        setItemsConfig();

        addSpace(5/100f);
        setBounds(textTotalPoints,textWidth,textHeight,textX);
        totalY-=((int)(height*textHeight));
        setBounds(totalPoints,numberWidth,numberHeight,numberX);
        setBounds(textTotalPercentage,textWidth,textHeight,textX);
        totalY-=((int)(height*textHeight));
        setBounds(totalPercentage,numberWidth,numberHeight,numberX);
        addSpace(5/100f);

        layout.addView(textTotalPercentage);
        layout.addView(textTotalPoints);
        layout.addView(totalPoints);
        layout.addView(totalPercentage);
        update();
    }
    private void setItemsConfig(){
        textTotalPercentage.setText(text_totalPercentage);
        textTotalPoints.setText(text_totalPoints);

        textTotalPercentage.setTextSize(20);
        textTotalPoints.setTextSize(20);

        totalPercentage.setGravity(Gravity.END);
        totalPercentage.setTextSize(20);
        totalPoints.setGravity(Gravity.END);
        totalPoints.setTextSize(20);

    }
    private void setBounds(TextView view, float w, float h, float x){
        view.setWidth((int)(w*width));
        view.setHeight((int)(h*height));
        view.setX(x*width);
        view.setY(totalY+layoutY);
        view.setGravity(Gravity.CENTER);
        totalY+=((int)(h*height));
    }
    private void addSpace(float space){
        totalY+=((int)(space*height));
    }

    @Override
    public int getHeight() {
        return totalY;
    }

    @Override
    public void update() {
        totalPercentage.setText(String.valueOf(form.getAchievedPercentage())+"%");
        totalPoints.setText(String.valueOf(form.getAchievedPoints()));
    }
}
