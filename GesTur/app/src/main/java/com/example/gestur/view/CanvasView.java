package com.example.gestur.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.gestur.view.chapterView.IBinaryViewConstants;

import java.util.ArrayList;

public class CanvasView extends View implements IBinaryViewConstants {

    private Paint paint;
    private Context context;
    int screenX;
    int screenY;
    int lastY;
    int startY;
    private ArrayList<Stroke> lines;
    private ArrayList<Stroke> rectangles;

    public CanvasView(Context context, int screenX, int screenY, int startY, int lastY){
        super(context);
        this.context = context;
        this.screenX = screenX;
        this.screenY = screenY;
        this.lastY = lastY;
        this.startY = startY;
        paint = new Paint();
        lines = new ArrayList<>();
        rectangles = new ArrayList<>();
        setLayoutParams(new RelativeLayout.LayoutParams(screenX,lastY+50));
    }
    private void drawLine(int x1,int y1,int x2,int y2,Canvas canvas){
        canvas.drawLine(x1,y1,x2,y2,paint);
    }
    private void drawRectangle(int x1,int y1,int x2,int y2,Canvas canvas){
        canvas.drawRect(x1,y1,x2,y2,paint);
    }
    public void addLine(int x1,int y1,int x2,int y2){
        lines.add(new Stroke(x1,y1,x2,y2));
    }
    public void addRectangle(int x1,int y1,int x2,int y2){
        rectangles.add(new Stroke(x1,y1,x2,y2));
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        paint.setStrokeWidth(3f);

        for(Stroke line:lines){
            drawLine(line.x1,line.y1,line.x2,line.y2,canvas);
        }
        //for(Stroke rectangle:rectangles){
        //drawRectangle(rectangle.x1,rectangle.y1,rectangle.x2,rectangle.y2,canvas);
        //}
        //canvas.drawLine(100,100,500,4500,paint);

    }
    private class Stroke
    {

        int x1;
        int y1;
        int x2;
        int y2;

        public Stroke(int x1,int y1,int x2,int y2){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }
}
