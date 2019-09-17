package com.example.gestur.view.formView;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.chapters.BinaryChapter;
import com.example.gestur.logic.forms.BinaryForm;
import com.example.gestur.view.CanvasView;
import com.example.gestur.view.IPanelView;

public class BinaryFormPanelView implements IPanelView,IBinaryFormPanelViewConstants {

    private BinaryForm form;
    private AppCompatActivity context;
    private int totalY;
    private int layoutY;
    private int width;
    private int height;
    private RelativeLayout layout;
    private CanvasView canvasView;

    private TextView textNumber;
    private TextView textQuestion;
    private TextView textPoints;
    private TextView textPercentage;

    public BinaryFormPanelView(BinaryForm form, AppCompatActivity context){
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

        addItems(null,1,questionBannerHeight);
        for(BinaryChapter chapter: form.getChapters()){
            addItems(chapter,2,questionHeight);
        }
        addItems(null,3,questionBannerHeight);
        configCanvas();

    }
    private void addItems(BinaryChapter chapter, int type,float height){
        createItems();
        if(type == 1){
            configItems("#","Capitulo","Puntaje","%",16);
        }
        if(type == 2){
            configItems(chapter.getNumber(), chapter.getName(),
                    String.valueOf(chapter.getTotalQuestions()),
                    String.valueOf(chapter.getTotalPercentage())+"%",
                    16);
        }
        if(type == 3){
            configItems("Total","",String.valueOf(form.getTotalPoints()),"100%",16);
        }
        setBounds(textNumber,numberWitdh,height,numberX);
        setBounds(textQuestion,questionWidth,height,questionX);
        setBounds(textPoints,pointsWitdh,height,pointsX);
        setBounds(textPercentage,percentageWitdh,height,percentageX);
        totalY+=((int)(this.height*height));

        layout.addView(textNumber);
        layout.addView(textQuestion);
        layout.addView(textPoints);
        layout.addView(textPercentage);
    }
    private void configItems(String textN,String textQ,String textPo,String textPer,int size){
        textNumber.setText(textN);
        //textNumber.setBackgroundColor(Color.CYAN);
        textNumber.setTextSize(size);

        textQuestion.setText(textQ);
        //textQuestion.setBackgroundColor(Color.argb(111,111,111,111));
        textQuestion.setTextSize(size);

        textPoints.setText(textPo);
        textPoints.setTextSize(size);
        //textPoints.setBackgroundColor(Color.argb(111,111,111,111));

        textPercentage.setText(textPer);
        textPercentage.setTextSize(size);
        //textPercentage.setBackgroundColor(Color.argb(111,111,111,111));
    }
    private void createItems(){
        textNumber = new TextView(context);
        textQuestion = new TextView(context);
        textPoints = new TextView(context);
        textPercentage = new TextView(context);
    }
    private void setBounds(TextView view, float w, float h, float x){
        view.setWidth((int)(w*width));
        view.setHeight((int)(h*height));
        view.setX(x*width);
        view.setY(totalY+layoutY);
        view.setGravity(Gravity.CENTER);
    }
    private void addSpace(int space){
        totalY+=(space*height/100);
    }
    @Override
    public int getHeight() {
        return totalY;
    }

    @Override
    public void update() {

    }
    private void configCanvas(){
        canvasView = new CanvasView(context,width,height,layoutY,(layoutY+totalY));
        //canvasView.setBackgroundColor(Color.CYAN);
        canvasView.addLine(numberX,0,percentageWitdh+percentageX,0);
        float k = questionBannerHeight;
        canvasView.addLine(numberX,k,percentageWitdh+percentageX,questionBannerHeight);
        for(int i = 0;i<form.getChapters().size();i++){
            k+=questionHeight;
            canvasView.addLine(numberX,k,percentageWitdh+percentageX,k);
        }
        k+=questionBannerHeight;
        canvasView.addLine(numberX,k,percentageWitdh+percentageX,k);

        canvasView.addLine(numberX,0,numberX,totalY);
        canvasView.addLine(questionX,0,questionX,totalY);
        canvasView.addLine(pointsX,0,pointsX,totalY);
        canvasView.addLine(percentageX,0,percentageX,totalY);
        canvasView.addLine(percentageX+percentageWitdh,0,percentageX+percentageWitdh,totalY);

        canvasView.draw(new Canvas(Bitmap.createBitmap(width,totalY, Bitmap.Config.ARGB_8888)));
        canvasView.setX(0);
        canvasView.setY(layoutY);
        layout.addView(canvasView);
    }
}
