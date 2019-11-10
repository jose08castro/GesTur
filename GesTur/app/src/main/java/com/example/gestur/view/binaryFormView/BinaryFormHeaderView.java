package com.example.gestur.view.binaryFormView;

import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.forms.BinaryForm;
import com.example.gestur.logic.forms.Form;
import com.example.gestur.view.IHeaderView;
import com.example.gestur.view.main.AbstractActivityComponent;

public class BinaryFormHeaderView extends AbstractActivityComponent implements IBinaryFormHeaderViewConstants {

    private TextView textTitle1;
    private TextView textTitle2;
    private TextView textTitle3;
    private TextView textName;
    private BinaryForm form;

    public BinaryFormHeaderView(BinaryForm form, AppCompatActivity context){
        super();
        this.form = form;
        textTitle1 = new TextView(context);
        textTitle2 = new TextView(context);
        textTitle3 = new TextView(context);
        textName = new TextView(context);
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        width = screenX;
        height = screenY;
        layoutY = currentY;

        setItemsConfiguration();
        setItemsBounds();

        layout.addView(textTitle1);
        layout.addView(textTitle2);
        layout.addView(textTitle3);
        layout.addView(textName);

    }
    @Override
    protected void setItemsBoundsHorizontal() {
        setBounds(textTitle1,titleWidth,titleHeight,titleX,true,false);
        setBounds(textTitle2,titleWidth,titleHeight,titleX,true,false);
        setBounds(textTitle3,titleWidth,titleHeight,titleX,true,false);
        setBounds(textName,nameWidth,nameHeight,nameX,true,false);
    }

    @Override
    protected void setItemsBoundsVertical() {
        setBounds(textTitle1,titleWidth,titleHeight,titleX,true,false);
        setBounds(textTitle2,titleWidth,titleHeight,titleX,true,false);
        setBounds(textTitle3,titleWidth,titleHeight,titleX,true,false);
        setBounds(textName,nameWidth,nameHeight,nameX,true,false);
    }

    @Override
    protected void setItemsConfiguration() {
        textTitle1.setText(title1);
        textTitle1.setTextSize(getTextSize(60));
        textTitle1.setGravity(Gravity.CENTER);

        textTitle2.setText(title2);
        textTitle2.setTextSize(getTextSize(67));
        textTitle2.setGravity(Gravity.CENTER);

        textTitle3.setText(title3);
        textTitle3.setTextSize(getTextSize(60));
        textTitle3.setGravity(Gravity.CENTER);

        textName.setText(form.getName());
        textName.setTextSize(getTextSize(49));
        textName.setGravity(Gravity.CENTER);
    }
}
