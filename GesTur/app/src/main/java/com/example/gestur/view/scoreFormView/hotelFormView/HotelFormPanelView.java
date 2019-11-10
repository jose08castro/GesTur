package com.example.gestur.view.scoreFormView.hotelFormView;

import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.chapters.ScoreChapter;
import com.example.gestur.logic.forms.ScoreForm;
import com.example.gestur.view.FormView;
import com.example.gestur.view.main.AbstractActivityComponent;

public class HotelFormPanelView extends AbstractActivityComponent implements IHotelPanelViewConstants {

    private ScoreForm hotelForm;
    private FormView context;
    private RelativeLayout layout;

    private TextView textTitle;
    private TextView textArea;
    private TextView textPercentage;

    private int currentPanelType;
    private ScoreChapter currentChapter;

    public HotelFormPanelView(ScoreForm form, FormView context){
        super();
        hotelForm = form;
        this.context = context;
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        width = screenX;
        height = screenY;
        layoutY = currentY;
        this.layout = layout;
        configTitle();
        loopPanel();
    }
    private void configTitle(){
        textTitle = new TextView(context);
        textTitle.setText(TEXT_PANEL);
        textTitle.setGravity(Gravity.CENTER);
        textTitle.setTextSize(getTextSize(50));
        setBounds(textTitle,1,TITLE_HEIGHT_V,0,true,false);
        addSpace(3,100);
        layout.addView(textTitle);
    }
    private void loopPanel(){
        currentPanelType = 1;
        createItems();
        setItemsConfiguration();
        setItemsBounds();
        addItems();
        currentPanelType = 2;
        for(ScoreChapter chapter: hotelForm.getChapters()){
            currentChapter = chapter;
            createItems();
            setItemsConfiguration();
            setItemsBounds();
            addItems();
        }
        currentPanelType = 3;
        createItems();
        setItemsConfiguration();
        setItemsBounds();
        addItems();
    }

    @Override
    protected void setItemsBoundsHorizontal() {
        setBounds(textArea,TEXT_AREA_WIDTH_V,TEXT_HEIGHT_V,TEXT_AREA_X_V,false,false);
        setBounds(textPercentage,TEXT_PER_WIDTH_V,TEXT_HEIGHT_V,TEXT_PER_X_V,true,false);
    }

    @Override
    protected void setItemsBoundsVertical() {
        setBounds(textArea,TEXT_AREA_WIDTH_V,TEXT_HEIGHT_V,TEXT_AREA_X_V,false,false);
        setBounds(textPercentage,TEXT_PER_WIDTH_V,TEXT_HEIGHT_V,TEXT_PER_X_V,true,false);
    }

    @Override
    protected void setItemsConfiguration() {
        textArea.setTextSize(getTextSize(65));
        textPercentage.setTextSize(getTextSize(65));
        textPercentage.setGravity(Gravity.END);
        switch (currentPanelType){
            case 1:
                textArea.setText("Área");
                textArea.setTypeface(textArea.getTypeface(), Typeface.BOLD);

                textPercentage.setText("Porcentage");
                textPercentage.setTypeface(textArea.getTypeface(), Typeface.BOLD);
                break;
            case 2:
                textArea.setText(currentChapter.getName());

                textPercentage.setText(currentChapter.getTotalPercentage()+"%");
                break;
            case 3:
                textArea.setText("Total");
                textArea.setTypeface(textArea.getTypeface(), Typeface.BOLD);

                textPercentage.setText("100%");
                textPercentage.setTypeface(textArea.getTypeface(), Typeface.BOLD);
                break;
            default:
                return;
        }
    }
    private void addItems(){
        layout.addView(textArea);
        layout.addView(textPercentage);
    }
    private void createItems(){
        textArea = new TextView(context);
        textPercentage = new TextView(context);
    }
}
