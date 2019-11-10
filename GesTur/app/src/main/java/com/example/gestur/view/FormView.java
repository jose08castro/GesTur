package com.example.gestur.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.example.gestur.R;
import com.example.gestur.logic.forms.BinaryForm;
import com.example.gestur.logic.forms.CafeteriaFondaSodaForm;
import com.example.gestur.logic.forms.ConCentersBinaryForm;
import com.example.gestur.logic.forms.Form;
import com.example.gestur.logic.forms.RestaurantBinaryForm;
import com.example.gestur.logic.forms.ScoreForm;
import com.example.gestur.logic.forms.SpaForm;
import com.example.gestur.view.binaryFormView.BinaryFormChapterTransferView;
import com.example.gestur.view.binaryFormView.BinaryFormFooterView;
import com.example.gestur.view.binaryFormView.BinaryFormHeaderView;
import com.example.gestur.view.binaryFormView.BinaryFormPanelView;
import com.example.gestur.view.conCentersFormView.ConCenterHeaderView;
import com.example.gestur.view.main.AbstractActivity;
import com.example.gestur.view.main.IActivityComponent;
import com.example.gestur.view.main.LobbyActivity;
import com.example.gestur.view.restaurantFormView.RestaurantHeaderView;
import com.example.gestur.view.scoreFormView.ScoreFormPanelView;
import com.example.gestur.view.scoreFormView.cafeteriaFormView.CafeteriaFondaSodaHeaderView;
import com.example.gestur.view.scoreFormView.hotelFormView.HotelFormHeaderView;
import com.example.gestur.view.scoreFormView.hotelFormView.HotelFormPanelView;
import com.example.gestur.view.scoreFormView.spaFormView.SpaFormHeaderView;

public class FormView extends AbstractActivity {

    private Form form;

    private CanvasView canvas;
    private RelativeLayout layout;
    private int currentY;

    private IActivityComponent formHeader;
    private IActivityComponent formPanel;
    private IActivityComponent formFooter;
    private IActivityComponent formTransfer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_view);
        layout = findViewById(R.id.formLayout);
        createComponents();
        addComponents();
        layout.setMinimumHeight(currentY);
    }
    private void createComponents(){
        form = InfoPasser.getInstance().getCurrentForm();
        int type = form.getType();
        if(type == 1 | type == 3 | type == 4 | type == 5 | type == 6 | type == 8 | type == 12 | type == 13){
            formHeader = new BinaryFormHeaderView((BinaryForm)form,this);
            formPanel =  new BinaryFormPanelView((BinaryForm)form,this);
            formFooter = new BinaryFormFooterView(form,this);
            formTransfer =  new BinaryFormChapterTransferView(form,this);
        }else if (type == 2){ //ScoreForm
            formHeader = new HotelFormHeaderView((ScoreForm)form,this);
            formPanel =  new HotelFormPanelView((ScoreForm)form,this);
            formFooter = new BinaryFormFooterView(form,this);
            formTransfer =  new BinaryFormChapterTransferView(form,this);
        }else if(type == 7){ //ConCentersBinaryForm
            formHeader = new ConCenterHeaderView((ConCentersBinaryForm)form,this);
            formPanel =  new BinaryFormPanelView((ConCentersBinaryForm)form,this);
            formFooter = new BinaryFormFooterView(form,this);
            formTransfer =  new BinaryFormChapterTransferView(form,this);
        }else if(type == 9){ //RestaurantBinaryForm
            formHeader = new RestaurantHeaderView((RestaurantBinaryForm)form,this);
            formPanel =  new BinaryFormPanelView((BinaryForm) form,this);
            formFooter = new BinaryFormFooterView(form,this);
            formTransfer =  new BinaryFormChapterTransferView(form,this);
        }else if(type == 10 | type == 11){ //CafeteriaFondaSodaForm
            formHeader = new CafeteriaFondaSodaHeaderView((CafeteriaFondaSodaForm)form,this);
            formPanel =  new ScoreFormPanelView((CafeteriaFondaSodaForm)form,this);
            formFooter = new BinaryFormFooterView(form,this);
            formTransfer =  new BinaryFormChapterTransferView(form,this);
        }else if(type == 14){//SpaForm
            formHeader = new SpaFormHeaderView((SpaForm)form,this);
            formPanel =  new ScoreFormPanelView((SpaForm)form,this);
            formFooter = new BinaryFormFooterView(form,this);
            formTransfer =  new BinaryFormChapterTransferView(form,this);
        }
    }

    private void addComponents(){
        addHeader();
        addPanel();
        addFooter();
        addTransfer();
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

    @Override
    protected void setItemsBoundsHorizontal() {

    }

    @Override
    protected void setItemsBoundsVertical() {

    }

    @Override
    protected void setItemsConfiguration() {

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, LobbyActivity.class));
    }
}
