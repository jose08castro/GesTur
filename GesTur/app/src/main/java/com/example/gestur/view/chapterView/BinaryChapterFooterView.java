package com.example.gestur.view.chapterView;

import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.BinaryChapter;
import com.example.gestur.view.IFooterView;

public class BinaryChapterFooterView implements IFooterView, IBinaryViewConstants {

    private BinaryChapter chapter;

    private TextView textChapterPercentage;
    private TextView textFormPercentage;

    private int footerHeight;

    public BinaryChapterFooterView(BinaryChapter chapter, AppCompatActivity context){
        this.chapter = chapter;
        textChapterPercentage = new TextView(context);
        textFormPercentage = new TextView(context);
        footerHeight = 0;
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {

        textChapterPercentage.setX(screenX*footerTextX);
        textFormPercentage.setX(screenX*footerTextX);

        textChapterPercentage.setY(currentY);
        textFormPercentage.setY(currentY+screenY*footerItemsHeight);

        textChapterPercentage.setWidth((int)(footerTextWidth*screenX));
        textFormPercentage.setWidth((int)(footerTextWidth*screenX));

        textChapterPercentage.setHeight((int)(footerItemsHeight*screenY));
        textFormPercentage.setHeight((int)(footerItemsHeight*screenY));

        layout.addView(textChapterPercentage);
        layout.addView(textFormPercentage);

        footerHeight += (footerItemsHeight*screenY*2);

        update();
    }

    @Override
    public int getHeight() {
        return footerHeight;
    }

    @Override
    public void update() {
        textFormPercentage.setText("Porcentaje del formulario: "+chapter.getAchievedFormPercentage()+"%");
        textChapterPercentage.setText("Porcentaje del capitulo: "+chapter.getAchievedChapterPercentage()+"%");
    }
}
