package com.example.gestur.view.scoreFormView.hotelFormView;

import android.view.Gravity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.forms.ScoreForm;
import com.example.gestur.view.main.AbstractActivity;
import com.example.gestur.view.main.AbstractActivityComponent;

public class HotelFormHeaderView extends AbstractActivityComponent implements IHotelHeaderViewConstants {

    private ScoreForm hotelForm;
    private AbstractActivity context;
    private RelativeLayout layout;

    private TextView title1;
    private TextView title2;
    private TextView title3;
    private TextView textName;


    public HotelFormHeaderView(ScoreForm form, AbstractActivity context){
        super();
        hotelForm = form;
        this.context = context;
    }

    @Override
    protected void setItemsBoundsHorizontal() {
        setBounds(title1,1,TITLE_HEIGHT_V,0,true,false);
        setBounds(title2,1,TITLE_HEIGHT_V,0,true,false);
        setBounds(title3,1,TITLE_HEIGHT_V,0,true,false);
        setBounds(textName,1,TITLE_HEIGHT_V,0,true,false);
    }

    @Override
    protected void setItemsBoundsVertical() {
        setBounds(title1,1,TITLE_HEIGHT_V,0,true,false);
        addSpace(4,100);
        setBounds(title2,1,TITLE_HEIGHT_V,0,true,false);
        addSpace(3,100);
        setBounds(title3,1,TITLE_HEIGHT_V,0,true,false);
        addSpace(3,100);
        setBounds(textName,1,TITLE_HEIGHT_V,0,true,false);
        addSpace(1,100);
    }

    @Override
    protected void setItemsConfiguration() {
        title1.setText(TEXT_TITLE_1);
        title1.setGravity(Gravity.CENTER);
        title1.setTextSize(getTextSize(50));

        title2.setText(TEXT_TITLE_2);
        title2.setGravity(Gravity.CENTER);
        title2.setTextSize(getTextSize(60));

        title3.setText(TEXT_TITLE_3);
        title3.setGravity(Gravity.CENTER);
        title3.setTextSize(getTextSize(60));

        textName.setText(hotelForm.getName());
        textName.setGravity(Gravity.CENTER);
        textName.setTextSize(getTextSize(40));
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
    private void addItems(){
        layout.addView(title1);
        layout.addView(title2);
        layout.addView(title3);
        layout.addView(textName);
    }
    private void createItems(){
        title1 = new TextView(context);
        title2 = new TextView(context);
        title3 = new TextView(context);
        textName = new TextView(context);
    }
}
