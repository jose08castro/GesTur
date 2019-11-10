package com.example.gestur.view.binaryChapterView;

import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.chapters.BinaryChapter;
import com.example.gestur.logic.chapters.Chapter;
import com.example.gestur.view.main.AbstractActivityComponent;

public class BinaryChapterFooterView extends AbstractActivityComponent implements IBinaryChapterFooterConstants {

    private Chapter chapter;

    private TextView textChapterPercentage;
    private TextView textFormPercentage;

    public BinaryChapterFooterView(Chapter chapter, AppCompatActivity context){
        this.chapter = chapter;
        textChapterPercentage = new TextView(context);
        textFormPercentage = new TextView(context);
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        width = screenX;
        height = screenY;
        layoutY = currentY;
        setItemsConfiguration();
        setItemsBounds();
        layout.addView(textChapterPercentage);
        layout.addView(textFormPercentage);
    }

    @Override
    protected void setItemsBoundsHorizontal() {
        setBounds(textChapterPercentage,1,footerItemsHeight,0,true,false);
        setBounds(textFormPercentage,1,footerItemsHeight,0,true,false);
    }

    @Override
    protected void setItemsBoundsVertical() {
        setBounds(textChapterPercentage,1,footerItemsHeight,0,true,false);
        setBounds(textFormPercentage,1,footerItemsHeight,0,true,false);
    }

    @Override
    protected void setItemsConfiguration() {
        update();
        textFormPercentage.setTextSize(getTextSize(45));
        textFormPercentage.setGravity(Gravity.CENTER);

        textChapterPercentage.setTextSize(getTextSize(45));
        textChapterPercentage.setGravity(Gravity.CENTER);
    }
    public void update() {
        String textFormPer = "Porcentaje del formulario: "+chapter.getAchievedFormPercentage()+"%";
        String textChapterPer =  "Porcentaje del capitulo: "+chapter.getAchievedChapterPercentage()+"%";
        textFormPercentage.setText(textFormPer);
        textChapterPercentage.setText(textChapterPer);
    }
}
