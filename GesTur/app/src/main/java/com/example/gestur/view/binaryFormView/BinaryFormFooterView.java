package com.example.gestur.view.binaryFormView;

import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.forms.BinaryForm;
import com.example.gestur.logic.forms.Form;
import com.example.gestur.view.IFooterView;
import com.example.gestur.view.main.AbstractActivity;
import com.example.gestur.view.main.AbstractActivityComponent;

public class BinaryFormFooterView extends AbstractActivityComponent implements IFooterView,IBinaryFormFooterViewConstants {

    private Form form;
    private AbstractActivity context;
    private RelativeLayout layout;

    private TextView textTotalPoints;
    private TextView textTotalPercentage;
    private TextView totalPoints;
    private TextView totalPercentage;

    public BinaryFormFooterView(Form form, AbstractActivity context){
        super();
        this.context = context;
        this.form = form;
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
        update();
    }
    private void addItems(){
        layout.addView(textTotalPercentage);
        layout.addView(textTotalPoints);
        layout.addView(totalPoints);
        layout.addView(totalPercentage);
    }
    private void createItems(){
        textTotalPercentage = new TextView(context);
        textTotalPoints = new TextView(context);
        totalPoints = new TextView(context);
        totalPercentage = new TextView(context);
    }

    @Override//currently same as vertical
    protected void setItemsBoundsHorizontal() {
        addSpace(5/100f);
        setBounds(textTotalPoints,textWidth,textHeight,textX,true,false);
        totalY-=((int)(height*textHeight));
        setBounds(totalPoints,numberWidth,numberHeight,numberX,true,false);
        setBounds(textTotalPercentage,textWidth,textHeight,textX,true,false);
        totalY-=((int)(height*textHeight));
        setBounds(totalPercentage,numberWidth,numberHeight,numberX,true,false);
        addSpace(5/100f);
    }

    @Override
    protected void setItemsBoundsVertical() {
        addSpace(5,100);
        setBounds(textTotalPoints,textWidth,textHeight,textX,false,false);
        setBounds(totalPoints,numberWidth,numberHeight,numberX,true,false);
        setBounds(textTotalPercentage,textWidth,textHeight,textX,false,false);
        setBounds(totalPercentage,numberWidth,numberHeight,numberX,true,false);
        addSpace(5,100);
    }

    @Override
    protected void setItemsConfiguration() {
        textTotalPercentage.setText(text_totalPercentage);
        textTotalPoints.setText(text_totalPoints);

        textTotalPercentage.setTextSize(getTextSize(50));
        textTotalPoints.setTextSize(getTextSize(50));

        totalPercentage.setGravity(Gravity.END);
        totalPercentage.setTextSize(getTextSize(50));
        totalPercentage.setTypeface(totalPercentage.getTypeface(), Typeface.BOLD);

        totalPoints.setGravity(Gravity.END);
        totalPoints.setTextSize(getTextSize(50));
        totalPoints.setTypeface(totalPoints.getTypeface(), Typeface.BOLD);
    }

    @Override
    public void update() {
        totalPercentage.setText(String.valueOf(form.getAchievedPercentage())+"%");
        totalPoints.setText(String.valueOf(form.getAchievedPoints()));
    }
}
