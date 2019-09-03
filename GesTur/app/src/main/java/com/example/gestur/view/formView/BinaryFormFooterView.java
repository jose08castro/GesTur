package com.example.gestur.view.formView;

import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.BinaryForm;
import com.example.gestur.view.IFooterView;

public class BinaryFormFooterView implements IFooterView,IBinaryFormFooterViewConstants {

    private BinaryForm form;

    private TextView textTotalPoints;
    private TextView textTotalPercentage;

    private int footerHeight;

    public BinaryFormFooterView(BinaryForm form, AppCompatActivity context){
        this.form = form;
        textTotalPercentage = new TextView(context);
        textTotalPoints = new TextView(context);

        footerHeight = 0;
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {

        textTotalPoints.setX(screenX*textX);
        textTotalPercentage.setX(screenX*textX);

        textTotalPoints.setY(screenY*textHeight + currentY);
        textTotalPercentage.setY(2*screenY*textHeight + currentY);

        textTotalPoints.setWidth((int)(screenX*textWidth));
        textTotalPercentage.setWidth((int)(screenX*textWidth));

        textTotalPoints.setHeight((int)(screenY*textHeight));
        textTotalPercentage.setHeight((int)(screenY*textHeight));

        layout.addView(textTotalPercentage);
        layout.addView(textTotalPoints);

        footerHeight += 3*screenY*textHeight;

        update();

    }

    @Override
    public int getHeight() {
        return footerHeight;
    }

    @Override
    public void update() {
        textTotalPercentage.setText("PORCENTAJE ACTUAL: "+form.getAchievedPercentage() +"%");
        textTotalPoints.setText("PUNTAJE ACTUAL: "+form.getAchievedPoints()+" ");
    }
}
