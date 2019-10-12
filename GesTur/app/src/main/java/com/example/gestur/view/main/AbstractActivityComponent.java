package com.example.gestur.view.main;

import android.widget.TextView;

public abstract class AbstractActivityComponent implements IActivityComponent{

    protected int width;
    protected int height;
    protected int layoutY;
    protected int totalY;

    public AbstractActivityComponent(){

        totalY = 0;
    }
    protected void setBounds(TextView view, float w, float h, float x){
        view.setWidth((int)(w*width));
        view.setHeight((int)(h*height));
        view.setX(x*width);
        view.setY(totalY+layoutY);
        totalY+=((int)(h*height));
    }
    protected void setItemsBounds(){
        if(height>width){
            setItemsBoundsVertical();
        }else{
            setItemsBoundsHorizontal();
        }
    }
    protected int getTextSize(int n){
        if(width>height){
            return (int)(height/n);
        }else{
            return (int)(width/n);
        }
    }
    protected void addSpace(int space,int base){
        totalY+=(space*height/base);
    }

    protected void addSpace(float space){
        totalY+=((int)(space*height));
    }

    protected abstract void setItemsBoundsHorizontal();

    protected abstract void setItemsBoundsVertical();

    protected abstract void setItemsConfiguration();

    @Override
    public int getHeight() {
        return totalY;
    }

}
