package com.example.gestur.view;

import android.content.Intent;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.RelativeLayout;

import com.example.gestur.R;
import com.example.gestur.logic.checkList.CheckListForm;
import com.example.gestur.view.IHeaderView;
import com.example.gestur.view.checkListView.CheckListFooter;
import com.example.gestur.view.checkListView.CheckListHeader;
import com.example.gestur.view.checkListView.CheckListPanel;
import com.example.gestur.view.main.AbstractActivity;
import com.example.gestur.view.main.IActivityComponent;
import com.example.gestur.view.main.LobbyActivity;

public class CheckListView extends AbstractActivity {

    private RelativeLayout layout;
    private CheckListForm checkListForm;

    private IActivityComponent header;
    private IActivityComponent panel;
    private IActivityComponent footer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_list_view);
        layout = findViewById(R.id.layoutCheckList);

        checkListForm = InfoPasser.getInstance().getCurrentCheckListForm();
        header = new CheckListHeader(checkListForm,this);
        panel = new CheckListPanel(checkListForm,this);
        footer = new CheckListFooter(checkListForm,this);

        addComponents();
        layout.setMinimumHeight(totalY);

    }
    private void addComponents(){
        addHeader();
        addPanel();
        addFooter();
    }

    private void addHeader(){
        header.addComponents(width,height,totalY,layout);
        totalY+=header.getHeight();
    }
    private void addPanel(){
        addSpace(5,100);
        panel.addComponents(width,height,totalY,layout);
        totalY+=panel.getHeight();
    }
    private void addFooter(){
        addSpace(5,100);
        footer.addComponents(width,height,totalY,layout);
        totalY+=footer.getHeight();
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
    public void update(){
        panel.update();
        footer.update();
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, LobbyActivity.class));
    }
}
