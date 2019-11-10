package com.example.gestur.view.binaryChapterView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.gestur.logic.chapters.BinaryChapter;
import com.example.gestur.logic.chapters.Chapter;
import com.example.gestur.view.FormView;
import com.example.gestur.view.main.AbstractActivityComponent;

public class BinaryChapterTransferView extends AbstractActivityComponent implements IBinaryChapterTransferConstants {

    private Chapter chapter;
    private Button buttonReturn;
    private Button buttonPrevChapter;
    private Button buttonNextChapter;

    private AppCompatActivity context;

    public BinaryChapterTransferView(Chapter chapter, AppCompatActivity context){
        this.chapter = chapter;
        this.context = context;
        buttonNextChapter = new Button(context);
        buttonPrevChapter = new Button(context);
        buttonReturn = new Button(context);
    }
    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        width = screenX;
        height = screenY;
        layoutY = currentY;
        setItemsConfiguration();
        setItemsBounds();

        layout.addView(buttonNextChapter);
        layout.addView(buttonPrevChapter);
        layout.addView(buttonReturn);
    }
    @Override
    protected void setItemsBoundsVertical() {
        setBounds(buttonReturn,footerButtonWidth,transferButtonsHeight,footerButtonX,true,false);
        addSpace(-transferButtonsHeight);
        setBounds(buttonPrevChapter,footerButtonWidth,transferButtonsHeight,(2*footerButtonX)+(footerButtonWidth),true,false);
        addSpace(-transferButtonsHeight);
        setBounds(buttonNextChapter,footerButtonWidth,transferButtonsHeight,(3*footerButtonX)+(2*footerButtonWidth),true,false);
    }

    @Override
    protected void setItemsBoundsHorizontal() {
        setBounds(buttonReturn,footerButtonWidth,transferButtonsHeight,footerButtonX,true,false);
        addSpace(-transferButtonsHeight);
        setBounds(buttonPrevChapter,footerButtonWidth,transferButtonsHeight,(2*footerButtonX)+(footerButtonWidth),true,false);
        addSpace(-transferButtonsHeight);
        setBounds(buttonNextChapter,footerButtonWidth,transferButtonsHeight,(3*footerButtonX)+(2*footerButtonWidth),true,false);
    }

    @Override
    protected void setItemsConfiguration() {
        buttonReturn.setText(textBack);
        buttonPrevChapter.setText(textPrevious);
        buttonNextChapter.setText(textNext);

        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, FormView.class);
                context.startActivity(i);
            }
        });
    }
}
