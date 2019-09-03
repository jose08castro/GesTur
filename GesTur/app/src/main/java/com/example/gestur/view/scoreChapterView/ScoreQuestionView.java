package com.example.gestur.view.scoreChapterView;

import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import com.example.gestur.view.IQuestion;
import com.example.gestur.view.IScoreViewConstants;

import java.util.ArrayList;

public class ScoreQuestionView implements IQuestion, IScoreViewConstants {

    private CheckBox naCheckbox;
    private Spinner spinner;


    public ScoreQuestionView(String question, AppCompatActivity context){
        naCheckbox = new CheckBox(context);
        spinner = new Spinner(context);

        String[] letra = {"A","B","C","D","E"};
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");

        spinner.setAdapter(new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, strings));
        //spinner.getSelectedItem();
    }


    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        spinner.setX(100);
        spinner.setY(currentY);
        layout.addView(spinner);
    }
}
