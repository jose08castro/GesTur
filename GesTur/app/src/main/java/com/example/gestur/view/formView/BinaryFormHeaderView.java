package com.example.gestur.view.formView;

import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.forms.BinaryForm;
import com.example.gestur.view.IHeaderView;

public class BinaryFormHeaderView implements IHeaderView,IBinaryFormHeaderViewConstants {

    private TextView textTitle1;
    private TextView textTitle2;
    private TextView textTitle3;
    private TextView textName;

    private BinaryForm form;

    private int totalHeaderHeight;

    public BinaryFormHeaderView(BinaryForm form, AppCompatActivity context){
        this.form = form;
        textTitle1 = new TextView(context);
        textTitle2 = new TextView(context);
        textTitle3 = new TextView(context);
        textName = new TextView(context);

        totalHeaderHeight = 0;
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        textTitle1.setText(title1);
        textTitle2.setText(title2);
        textTitle3.setText(title3);
        textName.setText(form.getName());

        textTitle1.setX(title1X*screenX);
        textTitle2.setX(title2X*screenX);
        textTitle3.setX(title3X*screenX);
        textName.setX(nameX*screenX);

        textTitle1.setY(title1Height*screenY);
        textTitle2.setY(2*title2Height*screenY);
        textTitle3.setY(3*title3Height*screenY);
        textName.setY((3*title3Height*screenY)+(nameX*screenY));

        textTitle1.setWidth((int)(title1Width*screenX));
        textTitle2.setWidth((int)(title2Width*screenX));
        textTitle3.setWidth((int)(title3Width*screenX));
        textName.setWidth((int)(nameWidth*screenX));

        textTitle1.setHeight((int)(title1Height*screenY));
        textTitle2.setHeight((int)(title2Height*screenY));
        textTitle3.setHeight((int)(title3Height*screenY));
        textName.setHeight((int)(nameHeight*screenY));

        layout.addView(textTitle1);
        layout.addView(textTitle2);
        layout.addView(textTitle3);
        layout.addView(textName);

        totalHeaderHeight = (int)((3*title3Height*screenY)+(nameHeight*screenY));

    }

    @Override
    public int getHeight() {
        return totalHeaderHeight;
    }
}
