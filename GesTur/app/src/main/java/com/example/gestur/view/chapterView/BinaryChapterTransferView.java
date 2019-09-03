package com.example.gestur.view.chapterView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.gestur.logic.BinaryChapter;
import com.example.gestur.view.FormView;
import com.example.gestur.view.IChapterTransferView;

public class BinaryChapterTransferView implements IChapterTransferView,IBinaryViewConstants {

    private BinaryChapter chapter;
    private Button buttonReturn;
    private Button buttonPrevChapter;
    private Button buttonNextChapter;
    private int transferHeight;
    private AppCompatActivity context;

    public BinaryChapterTransferView(BinaryChapter chapter, AppCompatActivity context){
        this.chapter = chapter;
        this.context = context;
        buttonNextChapter = new Button(context);
        buttonPrevChapter = new Button(context);
        buttonReturn = new Button(context);
        transferHeight = 0;
    }
    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {

        buttonReturn.setText("ATRAS");
        buttonPrevChapter.setText("ANTERIOR");
        buttonNextChapter.setText("SIGUIENTE");

        buttonReturn.setX(screenX*footerButtonX);
        buttonPrevChapter.setX((2*screenX*footerButtonX)+(footerButtonWidth*screenX));
        buttonNextChapter.setX((3*screenX*footerButtonX)+(2*footerButtonWidth*screenX));

        buttonReturn.setY(currentY+(screenY*footerItemsHeight));
        buttonPrevChapter.setY(currentY+(screenY*footerItemsHeight));
        buttonNextChapter.setY(currentY+(screenY*footerItemsHeight));

        buttonNextChapter.setWidth((int)(footerButtonWidth*screenX));
        buttonPrevChapter.setWidth((int)(footerButtonWidth*screenX));
        buttonReturn.setWidth((int)(footerButtonWidth*screenX));

        buttonNextChapter.setHeight((int)(footerItemsHeight*screenY));
        buttonPrevChapter.setHeight((int)(footerItemsHeight*screenY));
        buttonReturn.setHeight((int)(footerItemsHeight*screenY));

        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, FormView.class);
                context.startActivity(i);
            }
        });

        layout.addView(buttonNextChapter);
        layout.addView(buttonPrevChapter);
        layout.addView(buttonReturn);

        transferHeight += (int)(footerItemsHeight*screenY*2.5);
    }

    @Override
    public int getHeight() {
        return transferHeight;
    }
}
