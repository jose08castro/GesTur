package com.example.gestur.view.binaryFormView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.chapters.BinaryChapter;
import com.example.gestur.logic.chapters.Chapter;
import com.example.gestur.logic.forms.BinaryForm;
import com.example.gestur.logic.forms.Form;
import com.example.gestur.view.CanvasView;
import com.example.gestur.view.InfoPasser;
import com.example.gestur.view.ChapterView;
import com.example.gestur.view.IChapterTransferView;
import com.example.gestur.view.main.AbstractActivity;
import com.example.gestur.view.main.AbstractActivityComponent;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class BinaryFormChapterTransferView extends AbstractActivityComponent implements IChapterTransferView,IBinaryFormTransferViewConstants {


    private CanvasView canvasView;
    private RelativeLayout layout;
    private AbstractActivity context;
    private Form form;

    private TextView textPer;
    private ProgressBar progressBar;
    private Button button;

    public BinaryFormChapterTransferView(Form form, AbstractActivity context){
        this.form = form;
        this.context = context;
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        width = screenX;
        height = screenY;
        layoutY = currentY;
        this.layout = layout;
        loopButtons();
    }
/*
    private void configCanvas(int width, int height, int currentY,RelativeLayout layout){
        canvasView = new CanvasView(context,width,height,currentY,(currentY+transferHeight));
        for(int i = 0;i<=form.getChapters().size();i++){
            canvasView.addLine((int)(width*scrollX),(int)(currentY+(buttonFieldHeight*height*i)),(int)(width*(scrollX+scrollWidth)),(int)(currentY+(buttonFieldHeight*height*i)));
        }
        canvasView.addLine((int)(width*scrollX),currentY,(int)(width*scrollX),currentY+transferHeight);
        canvasView.addLine((int)(width*(scrollX+scrollWidth)),currentY,(int)(width*(scrollX+scrollWidth)),currentY+transferHeight);

        canvasView.draw(new Canvas(Bitmap.createBitmap(width,transferHeight, Bitmap.Config.ARGB_8888)));
        layout.addView(canvasView);
    }

    private void configScrollLayout(int screenX, int screenY, int currentY){
        scrollLayout.setX(screenX*scrollX);
        scrollLayout.setY(currentY);
        scrollLayout.setMinimumWidth((int)(scrollWidth*screenX));
    }

    */
    private void loopButtons(){
        for(Chapter chapter: (ArrayList<Chapter>)form.getChapters()){
            createItems();
            setButtonConfiguration(chapter);
            setItemsBounds();
            addItems();
        }
    }
    @Override
    protected void setItemsBoundsHorizontal() {
        setBounds(button,BUTTON_WIDTH_V,BUTTON_HEIGHT_V,BUTTON_X_V,true,false);
        addSpace(1,15);
    }

    @Override
    protected void setItemsBoundsVertical() {
        setBounds(button,BUTTON_WIDTH_V,BUTTON_HEIGHT_V,BUTTON_X_V,true,false);
        addSpace(2,100);
        setProgressBarBounds(progressBar,BUTTON_WIDTH_V,BUTTON_HEIGHT_V,PROGRESS_X,false);
        addSpace(-1,100);
        setBounds(textPer,NUMBER_WIDTH,NUMBER_HEIGHT,NUMBER_X,true,false);
        addSpace(3,100);
    }
    protected void setButtonConfiguration(final Chapter chapter) {

        textPer.setTextSize(getTextSize(50));
        textPer.setText(String.valueOf(chapter.getAchievedChapterPercentage())+"%");
        textPer.setGravity(Gravity.CENTER_HORIZONTAL);
        textPer.setTypeface(textPer.getTypeface(), Typeface.BOLD);

        button.setTextSize(getTextSize(60));
        button.setGravity(Gravity.CENTER);
        button.setText("Capitulo "+chapter.getNumber()+": "+chapter.getName());

        int prog = (int)chapter.getAchievedChapterPercentage();
        progressBar.setProgress(prog);
        if(prog <25){
            progressBar.getProgressDrawable().setColorFilter(
                    Color.RED, PorterDuff.Mode.SRC_IN);
        }
        if(prog >= 25 && prog < 50){
            progressBar.getProgressDrawable().setColorFilter(
                    Color.rgb(255,127,39), android.graphics.PorterDuff.Mode.SRC_IN);
        }
        if(prog >= 50 && prog < 75){
            progressBar.getProgressDrawable().setColorFilter(
                    Color.YELLOW, PorterDuff.Mode.SRC_IN);
        }
        if(prog >= 75){
            progressBar.getProgressDrawable().setColorFilter(
                    Color.GREEN, android.graphics.PorterDuff.Mode.SRC_IN);
        }


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InfoPasser.getInstance().setCurrentChapter(chapter);
                Intent i = new Intent(context, ChapterView.class);
                context.startActivity(i);
            }
        });
    }
    private void addItems(){
        layout.addView(button);
        layout.addView(progressBar);
        layout.addView(textPer);
    }
    private void createItems(){
        textPer = new TextView(context);
        button = new Button(context);
        progressBar = new ProgressBar(context,null,android.R.attr.progressBarStyleHorizontal);
    }
    @Override
    protected void setItemsConfiguration() {

    }
    protected void setProgressBarBounds(View view, float w, float h, float x,boolean incrementTotalY){
        view.setScaleX(4.5f);
        view.setScaleY(4f);
        view.setMinimumWidth((int)(w*width));
        view.setMinimumHeight((int)(h*height));
        view.setX(x*width -150);
        view.setY(totalY+layoutY);
        if(incrementTotalY) {
            totalY += ((int) (h * height));
        }
    }

}
