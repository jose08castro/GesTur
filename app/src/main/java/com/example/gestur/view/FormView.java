package com.example.gestur.view;

import android.content.Intent;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.RelativeLayout;

import com.example.gestur.R;
import com.example.gestur.logic.forms.BinaryForm;
import com.example.gestur.logic.forms.ConCentersBinaryForm;
import com.example.gestur.view.conCentersFormView.ConCenterHeaderView;
import com.example.gestur.view.formView.BinaryFormChapterTransferView;
import com.example.gestur.view.formView.BinaryFormFooterView;
import com.example.gestur.view.formView.BinaryFormHeaderView;
import com.example.gestur.view.formView.BinaryFormPanelView;
import com.example.gestur.view.main.LobbyActivity;

public class FormView extends AppCompatActivity {

    private BinaryForm form;

    private CanvasView canvas;
    private RelativeLayout layout;

    private int width;
    private int height;
    private int currentY;
    private int space;
    private int finalSpace;

    private IHeaderView formHeader;
    private IPanelView formPanel;
    private IFooterView formFooter;
    private IChapterTransferView formTransfer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_view);
        layout = findViewById(R.id.formLayout);
        currentY = 0;
        getScreenSizes();
        space = (int)(1/20f*height);
        finalSpace = (int)(1/15f*height);
        form = InfoPasser.getInstance().getCurrentForm();

        formHeader = new BinaryFormHeaderView(form,this);
        formPanel =  new BinaryFormPanelView(form,this);
        formFooter = new BinaryFormFooterView(form,this);
        formTransfer =  new BinaryFormChapterTransferView(form,this);

        addComponents();
        layout.setMinimumHeight(currentY);
    }

    private void addComponents(){
        addHeader();
        addPanel();
        addFooter();
        addTransfer();
        addFinalSpace();
    }
    private void addFinalSpace(){
        currentY+=finalSpace;
    }
    private void addSpace(){
        currentY+=space;
    }
    private void addHeader(){
        formHeader.addComponents(width,height,currentY,layout);
        currentY+=formHeader.getHeight();
    }
    private void addPanel(){
        formPanel.addComponents(width,height,currentY,layout);
        currentY += formPanel.getHeight();
    }
    private void addFooter(){
        formFooter.addComponents(width,height,currentY,layout);
        currentY+=formFooter.getHeight();
    }
    private void addTransfer(){
        formTransfer.addComponents(width,height,currentY,layout);
        currentY+=formTransfer.getHeight();
    }
    private void getScreenSizes()
    {
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        width = size.x;
        height = size.y;
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, LobbyActivity.class));
    }
}
