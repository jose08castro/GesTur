package com.example.gestur.view.binaryChapterView;

import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.chapters.BinaryChapter;
import com.example.gestur.logic.chapters.Chapter;
import com.example.gestur.view.main.AbstractActivityComponent;

public class BinaryChapterHeaderView extends AbstractActivityComponent implements IBinaryChapterHeaderConstants {

    private Chapter chapter;

    private TextView formTitle;
    private TextView chapterTitle;
    private TextView textPoints;
    private TextView textPercentage;

    public BinaryChapterHeaderView(Chapter chapter, AppCompatActivity context){
        super();
        this.chapter = chapter;
        formTitle = new TextView(context);
        chapterTitle = new TextView(context);
        textPoints = new TextView(context);
        textPercentage = new TextView(context);
    }
    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        width = screenX;
        height = screenY;
        layoutY = currentY;
        setItemsConfiguration();
        setItemsBounds();
        layout.addView(formTitle);
        layout.addView(chapterTitle);
        layout.addView(textPoints);
        layout.addView(textPercentage);
    }
    @Override
    protected void setItemsBoundsVertical() {
        setBounds(formTitle,1,formNameHeight,0,true,false);
        addSpace(1,100);
        setBounds(chapterTitle,1,ChapterNameHeight,0,true,false);
        addSpace(1,100);
        setBounds(textPoints,1,pointsHeight,0,true,false);
        setBounds(textPercentage,1,percentageHeight,0,true,false);
    }

    @Override
    protected void setItemsBoundsHorizontal() {
        setBounds(formTitle,1,formNameHeight,0,true,false);
        addSpace(1,100);
        setBounds(chapterTitle,1,ChapterNameHeight,0,true,false);
        addSpace(1,100);
        setBounds(textPoints,1,pointsHeight,0,true,false);
        setBounds(textPercentage,1,percentageHeight,0,true,false);
    }

    @Override
    protected void setItemsConfiguration() {

        String chapterName = "Capítulo "+chapter.getNumber()+": "+chapter.getName();
        String stringPoints = "Puntaje: "+chapter.getTotalPoints();
        String stringPercentage = "Porcentaje: "+chapter.getTotalPercentage()+"%";

        formTitle.setText(chapter.getForm().getName());
        formTitle.setGravity(Gravity.CENTER);
        formTitle.setTextSize(getTextSize(60));

        chapterTitle.setText(chapterName);
        chapterTitle.setGravity(Gravity.CENTER);
        chapterTitle.setTextSize(getTextSize(50));

        textPoints.setText(stringPoints);
        textPoints.setGravity(Gravity.CENTER);
        textPoints.setTextSize(getTextSize(55));

        textPercentage.setText(stringPercentage);
        textPercentage.setGravity(Gravity.CENTER);
        textPercentage.setTextSize(getTextSize(55));

    }
}
