package com.example.gestur.view.formView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.BinaryChapter;
import com.example.gestur.logic.BinaryForm;
import com.example.gestur.view.CanvasView;
import com.example.gestur.view.InfoPasser;
import com.example.gestur.view.ChapterView;
import com.example.gestur.view.IChapterTransferView;

public class BinaryFormChapterTransferView implements IChapterTransferView,IBinaryFormTransferViewConstants {

    private TextView textView;
    private CanvasView canvasView;
    private RelativeLayout scrollLayout;
    private AppCompatActivity context;
    private BinaryForm form;
    private Button button;

    private int transferHeight;

    public BinaryFormChapterTransferView(BinaryForm form, AppCompatActivity context){
        this.form = form;
        this.context = context;
        scrollLayout = new RelativeLayout(context);
        textView = new TextView(context);
        transferHeight = 0;
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {

        configScrollLayout(screenX,screenY,currentY);
        for(final BinaryChapter chapter: form.getChapters()){
            configButton(screenX,screenY,chapter);
            scrollLayout.addView(button);
            transferHeight += (int)(screenY*buttonFieldHeight);
        }
        scrollLayout.setMinimumHeight(transferHeight+210);
        layout.addView(scrollLayout);
        configCanvas(screenX,screenY,currentY,layout);

    }
    private void configScrollLayout(int screenX, int screenY, int currentY){
        scrollLayout.setX(screenX*scrollX);
        scrollLayout.setY(currentY);
        scrollLayout.setMinimumWidth((int)(scrollWidth*screenX));
    }

    private void configButton(int screenX, int screenY, final BinaryChapter chapter){
        button = new Button(context);
        button.setText("CAPITULO "+chapter.getNumber());
        button.setWidth((int)(screenX*scrollWidth));
        button.setHeight((int)(screenY*buttonHeight));
        button.setX(0);
        button.setY(transferHeight);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InfoPasser.getInstance().setCurrentChapter(chapter);
                Intent i = new Intent(context, ChapterView.class);
                context.startActivity(i);
            }
        });
    }

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
    @Override
    public int getHeight()
    {
        return transferHeight;
    }
}
