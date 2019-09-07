package com.example.gestur.view.formView;

import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.chapters.BinaryChapter;
import com.example.gestur.logic.forms.BinaryForm;
import com.example.gestur.view.IPanelView;

public class BinaryFormPanelView implements IPanelView,IBinaryFormPanelViewConstants {

    private BinaryForm form;
    private AppCompatActivity context;

    private int totalPanelHeight;
    private RelativeLayout layout;

    public BinaryFormPanelView(BinaryForm form, AppCompatActivity context){
        this.form = form;
        this.context = context;
        totalPanelHeight = 0;
    }
    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        this.layout = layout;
        addItems(null,1,screenX,screenY,currentY+totalPanelHeight,(int)(questionBannerHeight*screenY));
        totalPanelHeight += (int)(questionBannerHeight*screenY);
        for(BinaryChapter chapter: form.getChapters()){
            addItems(chapter,2,screenX,screenY,currentY+totalPanelHeight,(int)(questionHeight*screenY));
            totalPanelHeight += (int)(questionHeight*screenY);
        }
        addItems(null,3,screenX,screenY,currentY+totalPanelHeight,(int)(questionBannerHeight*screenY));
        totalPanelHeight += (int)(questionBannerHeight*screenY);
    }
    private void addItems(BinaryChapter chapter, int type, int screenX,int screenY,int currentY,int height){
        TextView textNumber = new TextView(context);
        TextView textQuestion = new TextView(context);
        TextView textPoints = new TextView(context);
        TextView textPercentage = new TextView(context);

        if(type == 1){
            textNumber.setText("#");
            textQuestion.setText("Capitulo");
            textPoints.setText("Puntaje");
            textPercentage.setText("%");
        }
        if(type == 2){
            textNumber.setText(chapter.getNumber()+" ");
            textQuestion.setText(chapter.getName());
            textPoints.setText(chapter.getTotalQuestions()+"");
            textPercentage.setText(chapter.getTotalPercentage()+"%");
        }
        if(type == 3){
            textNumber.setText("Total");
            textQuestion.setText("");
            textPoints.setText(form.getTotalPoints()+"");
            textPercentage.setText("100%");
        }
        textNumber.setX(screenX*numberX);
        textQuestion.setX(screenX*questionX);
        textPoints.setX(screenX*pointsX);
        textPercentage.setX(screenX*percentageX);

        textNumber.setY(currentY);
        textQuestion.setY(currentY);
        textPoints.setY(currentY);
        textPercentage.setY(currentY);

        textNumber.setHeight(height);
        textQuestion.setHeight(height);
        textPoints.setHeight(height);
        textPercentage.setHeight(height);

        textNumber.setWidth((int)(screenX*numberWitdh));
        textQuestion.setWidth((int)(screenX*questionWidth));
        textPoints.setWidth((int)(screenX*pointsWitdh));
        textPercentage.setWidth((int)(screenX*percentageWitdh));

        layout.addView(textNumber);
        layout.addView(textQuestion);
        layout.addView(textPoints);
        layout.addView(textPercentage);
    }
    @Override
    public int getHeight() {
        return totalPanelHeight;
    }

    @Override
    public void update() {

    }
}
