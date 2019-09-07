package com.example.gestur.view;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.RelativeLayout;

import com.example.gestur.R;
import com.example.gestur.logic.chapters.BinaryChapter;
import com.example.gestur.view.chapterView.BinaryChapterFooterView;
import com.example.gestur.view.chapterView.BinaryChapterHeaderView;
import com.example.gestur.view.chapterView.BinaryChapterPanelView;
import com.example.gestur.view.chapterView.BinaryChapterTransferView;

public class ChapterView extends AppCompatActivity {

    private BinaryChapter chapter;

    private CanvasView canvas;
    private RelativeLayout layout;

    private int width;
    private int height;
    private int currentY;
    private int space;

    private IHeaderView chapterHeader;
    private IPanelView chapterPanel;
    private IFooterView chapterFooter;
    private IChapterTransferView chapterTransfer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_view);
        getScreenSizes();
        space = (int)(1/40f*height);
        currentY = 0;
        layout = findViewById(R.id.buttonsLayout);

        chapter = InfoPasser.getInstance().getCurrentChapter();

        chapterHeader = new BinaryChapterHeaderView(chapter,this);
        chapterFooter = new BinaryChapterFooterView(chapter,this);
        chapterPanel = new BinaryChapterPanelView(chapter,this);
        chapterTransfer = new BinaryChapterTransferView(chapter,this);

        addComponents();
        layout.setMinimumHeight(currentY);

    }
    public void update(){
        chapter.update();
        chapterPanel.update();
        chapterFooter.update();
    }
    private void addComponents(){
        addSpace(); //Space
        addHeader();
        addSpace(); //Space
        addPanel();
        addSpace(); //Space
        addFooter();
        addSpace(); //Space
        addTransfer();
        addSpace(); //Space
    }
    private void addSpace(){
        currentY+=space;
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
    private void getScreenSizes()
    {
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        width = size.x;
        height = size.y;
    }
}
