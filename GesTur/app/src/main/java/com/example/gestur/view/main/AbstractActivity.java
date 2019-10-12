package com.example.gestur.view.main;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.gestur.view.CanvasView;

public abstract class AbstractActivity extends AppCompatActivity {

    protected ConstraintLayout layout;
    protected final Context context = this;
    protected CanvasView canvasView;
    protected int width;
    protected int height;
    protected int totalY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getScreenSizes();
    }
    protected void setSpinnerBounds(Spinner spinner, float w, float h, float x){
        spinner.setMinimumWidth((int)(w*width));
        spinner.setMinimumHeight((int)(h*height));
        spinner.setX(x*width);
        spinner.setY(totalY);
        totalY+=((int)(h*height));
    }
    protected void setBounds(TextView view, float w, float h, float x){
        view.setWidth((int)(w*width));
        view.setHeight((int)(h*height));
        view.setX(x*width);
        view.setY(totalY);
        totalY+=((int)(h*height));
    }
    protected void setTextInputLayoutBounds(TextInputLayout layout,TextView view,float w,float h,float x){
        layout.setLayoutParams(new LinearLayout.LayoutParams((int)(w*width),LinearLayout.LayoutParams.WRAP_CONTENT));
        layout.addView(view, new LinearLayout.LayoutParams((int)(w*width),(int)(h*height)));
        layout.setX(x*width);
        layout.setY(totalY);
        totalY+=((int)(h*height));
    }
    private void getScreenSizes()
    {
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        width = size.x;
        height = size.y;
        totalY = 0;
    }
    protected void setItemsBounds(){
        if(height>width){
            setItemsBoundsVertical();
        }else{
            setItemsBoundsHorizontal();
        }
    }

    protected void addSpace(int space,int base){
        totalY+=(space*height/base);
    }

    protected void addSpace(float space){
        totalY+=((int)(space*height));
    }

    protected int getTextSize(int n){
        if(width>height){
            return (int)(height/n);
        }else{
            return (int)(width/n);
        }
    }
    protected boolean validateNumericString(String num){
        try {
            int n = Integer.parseInt(num);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
    protected boolean validateEmailAddress(String email){
        if(email.startsWith("@") || email.endsWith("@")){
            return false;
        }
        for(int i = 0;i<email.length();i++){
            char c = email.charAt(i);
            if(c=='@'){
                return true;
            }
        }
        return false;
    }

    protected abstract void setItemsBoundsHorizontal();

    protected abstract void setItemsBoundsVertical();

    protected abstract void setItemsConfiguration();

    protected int getHeight(){
        return totalY;
    }
}
