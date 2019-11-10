package com.example.gestur.view.main;

import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

public abstract class AbstractActivityComponent implements IActivityComponent{

    protected int width;
    protected int height;
    protected int layoutY;
    protected int totalY;

    public AbstractActivityComponent(){
        totalY = 0;
    }

    protected void setBounds(TextView view, float w, float h, float x,boolean incrementTotalY,boolean useHeightValue){
        int newHeight = (int)(h*height);
        if(useHeightValue){
            newHeight = (int)h;
        }
        view.setWidth((int)(w*width));
        view.setX(x*width);
        view.setY(totalY+layoutY);
        view.setHeight(newHeight);
        if(incrementTotalY) {
            totalY += (newHeight);
        }
    }
    protected void setSpinnerBounds(Spinner spinner, float w, float h, float x,boolean incrementTotalY,boolean useHeightValue){
        int newHeight = (int)(h*height);
        if(useHeightValue){
            newHeight = (int)h;
        }
        spinner.setMinimumWidth((int)(w*width));
        spinner.setMinimumHeight((int)(h*height));
        spinner.setX(x*width);
        spinner.setY(totalY+layoutY);
        if(incrementTotalY) {
            totalY += (newHeight);
        }
    }
    protected void setRatingBarBounds(RatingBar view, float w, float h, float x, boolean incrementY){
        view.setMinimumWidth((int)(w*width));
        view.setMinimumHeight((int)(h*height));
        view.setX(x*width);
        view.setY(totalY+layoutY);
        if(incrementY){
            totalY+=((int)(h*height));
        }
    }
    protected void setImageViewBounds(ImageView imageView, float w, float h, float x, boolean incrementY){
        imageView.setMaxWidth((int)(width*w));
        imageView.setMaxHeight((int)(width*h));
        imageView.setY(totalY+layoutY);
        imageView.setX((int)(x*width));
        if(incrementY){
            totalY+=((int)(h*height));
        }
    }
    protected int getTextViewHeight(TextView view, int textWidth){

        view.setWidth(textWidth);
        String text = view.getText().toString();
        Rect bounds = new Rect();
        Paint textPaint = view.getPaint();
        textPaint.getTextBounds(text, 0, text.length(), bounds);

        int height = bounds.height();
        int width = bounds.width();
        int intLines = (int)((float)width/(float)textWidth);
        //view.setText("H: "+(int)((1.7*height*intLines) + 2*height));
        return (int)((1.7*height*intLines) + 2*height);
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

    //values come in function of height slready
    protected void addMaxSpace(int space1,int space2){
        if(space1>space2){
            totalY += space1;
        }else{
            totalY += space2;
        }
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

    public void update(){

    }

}
