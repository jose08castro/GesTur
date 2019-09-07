package com.example.gestur.view.chapterView;

import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.chapters.BinaryChapter;
import com.example.gestur.view.IHeaderView;

public class BinaryChapterHeaderView implements IBinaryViewConstants, IHeaderView {

    private BinaryChapter binaryChapter;

    private TextView formTitle;
    private TextView chapterTitle;
    private TextView textPoints;
    private TextView textPercentage;

    private int totalHeaderHeight;

    public BinaryChapterHeaderView(BinaryChapter chapter, AppCompatActivity context){
        binaryChapter = chapter;
        formTitle = new TextView(context);
        chapterTitle = new TextView(context);
        textPoints = new TextView(context);
        textPercentage = new TextView(context);

        totalHeaderHeight = 0;
    }
    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        formTitle.setText(binaryChapter.getForm().getName());

        chapterTitle.setText(binaryChapter.getName());
        textPoints.setText("Puntaje: "+binaryChapter.getTotalQuestions());
        textPercentage.setText("Porcentaje: "+binaryChapter.getTotalPercentage());

        formTitle.setX(startX*screenX);
        chapterTitle.setX(startX*screenX);
        textPoints.setX(startX*screenX);
        textPercentage.setX(screenX/2);

        formTitle.setY(currentY);
        chapterTitle.setY(currentY+(headerHeight*screenY));
        textPoints.setY(currentY+(2*headerHeight*screenY));
        textPercentage.setY(currentY+(2*headerHeight*screenY));

        formTitle.setWidth((int)(headerWidth*screenX));
        chapterTitle.setWidth((int)(headerWidth*screenX));
        textPoints.setWidth((int)((headerWidth*screenX)/2));
        textPercentage.setWidth((int)((headerWidth*screenX)/2));

        formTitle.setHeight((int)(headerHeight*screenY));
        chapterTitle.setHeight((int)(headerHeight*screenY));
        textPoints.setHeight((int)(headerHeight*screenY));
        textPercentage.setHeight((int)(headerHeight*screenY));

        layout.addView(formTitle);
        layout.addView(chapterTitle);
        layout.addView(textPoints);
        layout.addView(textPercentage);

        totalHeaderHeight += 3*headerHeight*screenY;
    }

    @Override
    public int getHeight() {
        return totalHeaderHeight;
    }
}
