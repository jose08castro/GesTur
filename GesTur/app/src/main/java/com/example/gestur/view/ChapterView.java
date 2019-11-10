package com.example.gestur.view;

import android.content.Intent;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.gestur.R;
import com.example.gestur.logic.chapters.BinaryChapter;
import com.example.gestur.logic.chapters.Chapter;
import com.example.gestur.logic.chapters.ScoreChapter;
import com.example.gestur.view.binaryChapterView.BinaryChapterFooterView;
import com.example.gestur.view.binaryChapterView.BinaryChapterHeaderView;
import com.example.gestur.view.binaryChapterView.BinaryChapterPanelView;
import com.example.gestur.view.binaryChapterView.BinaryChapterTransferView;
import com.example.gestur.view.main.AbstractActivity;
import com.example.gestur.view.main.IActivityComponent;
import com.example.gestur.view.scoreChapterView.ScoreChapterPanelView;

public class ChapterView extends AbstractActivity {

    private Chapter chapter;

    private CanvasView canvas;
    private RelativeLayout layout;

    private int currentY;

    private IActivityComponent chapterHeader;
    private IActivityComponent chapterPanel;
    private IActivityComponent chapterFooter;
    private IActivityComponent chapterTransfer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_view);
        layout = findViewById(R.id.buttonsLayout);
        createComponents();
        addComponents();
        layout.setMinimumHeight(currentY);
    }

    private void createComponents(){
        chapter = InfoPasser.getInstance().getCurrentChapter();
        int type = InfoPasser.getInstance().getCurrentForm().getType();
        if(type == 2 || type == 10 || type == 11 || type == 14){
            chapterHeader = new BinaryChapterHeaderView(chapter,this);
            chapterFooter = new BinaryChapterFooterView(chapter,this);
            chapterPanel = new ScoreChapterPanelView((ScoreChapter) chapter,this);
            chapterTransfer = new BinaryChapterTransferView(chapter,this);
        }else{
            chapterHeader = new BinaryChapterHeaderView(chapter,this);
            chapterFooter = new BinaryChapterFooterView(chapter,this);
            chapterPanel = new BinaryChapterPanelView((BinaryChapter)chapter,this);
            chapterTransfer = new BinaryChapterTransferView(chapter,this);
        }
    }
    private void addComponents(){
        addSpace(1,100); //Space
        addHeader();
        addSpace(1,100); //Space
        addPanel();
        addSpace(1,100); //Space
        addFooter();
        addSpace(1,100); //Space
        addTransfer();
        addSpace(1,100); //Space
    }
    public void update(){
        chapter.update();
        chapterPanel.update();
        chapterFooter.update();
    }
    private void addHeader(){
        chapterHeader.addComponents(width,height,currentY,layout);
        currentY+=chapterHeader.getHeight();
    }
    private void addPanel(){
        chapterPanel.addComponents(width,height,currentY,layout);
        currentY += chapterPanel.getHeight();
    }
    private void addFooter(){
        chapterFooter.addComponents(width,height,currentY,layout);
        currentY+=chapterFooter.getHeight();
    }
    private void addTransfer(){
        chapterTransfer.addComponents(width,height,currentY,layout);
        currentY+=chapterTransfer.getHeight();
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, FormView.class));
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
}
