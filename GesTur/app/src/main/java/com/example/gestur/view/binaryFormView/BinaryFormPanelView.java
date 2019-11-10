package com.example.gestur.view.binaryFormView;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.chapters.BinaryChapter;
import com.example.gestur.logic.chapters.Chapter;
import com.example.gestur.logic.forms.BinaryForm;
import com.example.gestur.logic.forms.Form;
import com.example.gestur.view.CanvasView;
import com.example.gestur.view.IPanelView;
import com.example.gestur.view.main.AbstractActivity;
import com.example.gestur.view.main.AbstractActivityComponent;

public class BinaryFormPanelView extends AbstractActivityComponent implements IPanelView,IBinaryFormPanelViewConstants {

    private BinaryForm form;
    private AbstractActivity context;
    private RelativeLayout layout;
    private CanvasView canvasView;

    private TextView textNumber;
    private TextView textQuestion;
    private TextView textPoints;
    private TextView textPercentage;

    public BinaryFormPanelView(BinaryForm form, AbstractActivity context){
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
    private void addItems(Chapter chapter, int type,float height){
        createItems();
        if(type == 1){
            configItems("#","Capitulo","Puntaje","%",getTextSize(60));
        }
        if(type == 2){
            configItems(chapter.getNumber(), chapter.getName(),
                    String.valueOf(chapter.getTotalQuestions()),
                    String.valueOf(chapter.getTotalPercentage())+"%",
                    getTextSize(60));
        }
        if(type == 3){
            configItems("Total","",String.valueOf(form.getTotalPoints()),"100%",getTextSize(60));
        }
        setBounds(textNumber,numberWitdh,height,numberX,false,false);
        setBounds(textQuestion,questionWidth,height,questionX,false,false);
        setBounds(textPoints,pointsWitdh,height,pointsX,false,false);
        setBounds(textPercentage,percentageWitdh,height,percentageX,false,false);
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
        textNumber.setGravity(Gravity.CENTER);

        textQuestion.setText(textQ);
        //textQuestion.setBackgroundColor(Color.argb(111,111,111,111));
        textQuestion.setTextSize(size);
        textQuestion.setGravity(Gravity.CENTER);

        textPoints.setText(textPo);
        textPoints.setTextSize(size);
        textPoints.setGravity(Gravity.CENTER);

        textPercentage.setText(textPer);
        textPercentage.setTextSize(size);
        textPercentage.setGravity(Gravity.CENTER);
    }
    private void createItems(){
        textNumber = new TextView(context);
        textQuestion = new TextView(context);
        textPoints = new TextView(context);
        textPercentage = new TextView(context);
    }

    @Override
    protected void setItemsBoundsHorizontal() {

    }

    @Override
    protected void setItemsBoundsVertical() {

    }

    @Override
    protected void setItemsConfiguration() {

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
