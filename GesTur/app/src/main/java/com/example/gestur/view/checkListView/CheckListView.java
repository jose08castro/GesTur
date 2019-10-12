package com.example.gestur.view.checkListView;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.RelativeLayout;

import com.example.gestur.R;
import com.example.gestur.logic.checkList.CheckListForm;
import com.example.gestur.view.IHeaderView;

public class CheckListView extends AppCompatActivity {

    //SNIT
    private int width;
    private int height;
    private int currentY;

    private IHeaderView formHeader;
    private RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_list_view);
        getScreenSizes();
        layout = findViewById(R.id.layoutCheckList);
        currentY = 0;

        //CheckListForm checkListForm = new CheckListForm("Chequeo Tematicos",
         //       "Tec","josueggss73@gmail.com",
         //       "23/12/2019","83492382",1,12,null);

        //formHeader = new CheckListHeader(checkListForm,this);

        addComponents();
        layout.setMinimumHeight(currentY+200);

    }
    private void addComponents(){
        addHeader();
    }

    private void addHeader(){
        formHeader.addComponents(width,height,currentY,layout);
        currentY+=formHeader.getHeight();
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
