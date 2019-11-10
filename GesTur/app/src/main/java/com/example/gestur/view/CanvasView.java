package com.example.gestur.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.gestur.view.binaryChapterView.IBinaryViewConstants;

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
        setLayoutParams(new RelativeLayout.LayoutParams(screenX,lastY-startY+4));
    }
    private void drawLine(int x1,int y1,int x2,int y2,Canvas canvas){
        canvas.drawLine(x1,y1,x2,y2,paint);
    }
    public void addLine(float x1,float y1,float x2,float y2){
        lines.add(new Stroke((int)(x1*screenX),(int)((y1*screenY)),(int)(x2*screenX),(int)((y2*screenY))));
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        paint.setStrokeWidth(3f);
        for(Stroke line:lines){
            drawLine(line.x1,line.y1,line.x2,line.y2,canvas);
        }
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
