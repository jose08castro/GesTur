package com.example.gestur.view.scoreChapterView;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.Image;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gestur.R;
import com.example.gestur.logic.questions.HotelQuestion;
import com.example.gestur.view.ChapterView;
import com.example.gestur.view.main.AbstractActivityComponent;

public class HotelQuestionView extends AbstractActivityComponent implements IHotelQuestionViewConstants{

    private ChapterView context;
    private HotelQuestion question;

    private TextView textNumber;
    private TextView textQuestion;

    private TextView text1Star;
    private TextView text2Star;
    private TextView text3Star;
    private TextView text4Star;
    private TextView text5Star;

    private ImageView star1;
    private ImageView star2;
    private ImageView star3;
    private ImageView star4;
    private ImageView star5;

    private TextView textScore;

    private RatingBar ratingBar;
    private ImageButton buttonNoStars;
    private RelativeLayout layout;

    public HotelQuestionView(HotelQuestion question, ChapterView context){
        super();
        this.question = question;
        this.context = context;
    }
    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        width = screenX;
        height = screenY;
        layoutY = currentY;
        this.layout = layout;
        createItems();
        setItemsConfiguration();
        setItemsBounds();
        addItems();
    }
    private void createItems(){
        textNumber = new TextView(context);
        textQuestion = new TextView(context);
        text1Star = new TextView(context);
        text2Star = new TextView(context);
        text3Star = new TextView(context);
        text4Star = new TextView(context);
        text5Star = new TextView(context);
        star1 = new ImageView(context);
        star2 = new ImageView(context);
        star3 = new ImageView(context);
        star4 = new ImageView(context);
        star5 = new ImageView(context);
        textScore = new TextView(context);
        ratingBar = new RatingBar(context);
        buttonNoStars = new ImageButton(context);
    }
    private void addItems(){
        layout.addView(textQuestion);
        layout.addView(textNumber);
        layout.addView(text1Star);
        layout.addView(text2Star);
        layout.addView(text3Star);
        layout.addView(text4Star);
        layout.addView(text5Star);
        layout.addView(star1);
        layout.addView(star2);
        layout.addView(star3);
        layout.addView(star4);
        layout.addView(star5);
        layout.addView(textScore);
        layout.addView(ratingBar);
        layout.addView(buttonNoStars);
    }
    @Override//Currently same than Vertical
    protected void setItemsBoundsHorizontal() {

        setBounds(textNumber,1,SMALL_TEXT_HEIGHT,0,true,false);
        setBounds(textQuestion,QUESTION_WIDTH_V,LARGE_TEXT_HEIGHT,QUESTION_X_V,true,false);
        addSpace(2,100);

        //setBounds(star1,1,SMALL_TEXT_HEIGHT,0,true,false);
        setBounds(text1Star,STAR_QUESTION_WIDTH_V,LARGE_TEXT_HEIGHT,STAR_QUESTION_X_V,true,false);
        addSpace(2,100);

        //setBounds(star2,1,SMALL_TEXT_HEIGHT,0,true,false);
        setBounds(text2Star,STAR_QUESTION_WIDTH_V,LARGE_TEXT_HEIGHT,STAR_QUESTION_X_V,true,false);
        addSpace(2,100);

        //setBounds(star3,1,SMALL_TEXT_HEIGHT,0,true,false);
        setBounds(text3Star,STAR_QUESTION_WIDTH_V,LARGE_TEXT_HEIGHT,STAR_QUESTION_X_V,true,false);
        addSpace(2,100);

        //setBounds(star4,1,SMALL_TEXT_HEIGHT,0,true,false);
        setBounds(text4Star,STAR_QUESTION_WIDTH_V,LARGE_TEXT_HEIGHT,STAR_QUESTION_X_V,true,false);
        addSpace(2,100);

        //setBounds(star5,1,SMALL_TEXT_HEIGHT,0,true,false);
        setBounds(text5Star,STAR_QUESTION_WIDTH_V,LARGE_TEXT_HEIGHT,STAR_QUESTION_X_V,true,false);
        addSpace(2,100);

        setRatingBarBounds(ratingBar,RATING_BAR_WIDTH_V,SMALL_TEXT_HEIGHT,RATING_BAR_X_V,true);
        addSpace(3,100);
    }

    @Override
    protected void setItemsBoundsVertical() {
        setBounds(textNumber,1,SMALL_TEXT_HEIGHT,0,true,false);

        int newHeight = getTextViewHeight(textQuestion,(int)(QUESTION_WIDTH_V*width));
        setBounds(textQuestion,QUESTION_WIDTH_V,newHeight,QUESTION_X_V,true,true);
        addSpace(2,100);

        newHeight = getTextViewHeight(text1Star,(int)(STAR_QUESTION_WIDTH_V*width));
        setImageViewBounds(star1,IMAGE_WIDTH_V,IMAGE_HEIGHT_V,IMAGE_X_V,false);
        setBounds(text1Star,STAR_QUESTION_WIDTH_V,newHeight,STAR_QUESTION_X_V,false,true);
        addMaxSpace(newHeight,((int)(IMAGE_HEIGHT_V*height)));
        addSpace(2,100);

        newHeight = getTextViewHeight(text2Star,(int)(STAR_QUESTION_WIDTH_V*width));
        setImageViewBounds(star2,IMAGE_WIDTH_V,IMAGE_HEIGHT_V,IMAGE_X_V,false);
        setBounds(text2Star,STAR_QUESTION_WIDTH_V,newHeight,STAR_QUESTION_X_V,false,true);
        addMaxSpace(newHeight,((int)(IMAGE_HEIGHT_V*height)));
        addSpace(2,100);

        newHeight = getTextViewHeight(text3Star,(int)(STAR_QUESTION_WIDTH_V*width));
        setImageViewBounds(star3,IMAGE_WIDTH_V,IMAGE_HEIGHT_V,IMAGE_X_V,false);
        setBounds(text3Star,STAR_QUESTION_WIDTH_V,newHeight,STAR_QUESTION_X_V,false,true);
        addMaxSpace(newHeight,((int)(IMAGE_HEIGHT_V*height)));
        addSpace(2,100);

        newHeight = getTextViewHeight(text4Star,(int)(STAR_QUESTION_WIDTH_V*width));
        setImageViewBounds(star4,IMAGE_WIDTH_V,IMAGE_HEIGHT_V,IMAGE_X_V,false);
        setBounds(text4Star,STAR_QUESTION_WIDTH_V,newHeight,STAR_QUESTION_X_V,false,true);
        addMaxSpace(newHeight,((int)(IMAGE_HEIGHT_V*height)));
        addSpace(2,100);

        newHeight = getTextViewHeight(text5Star,(int)(STAR_QUESTION_WIDTH_V*width));
        setImageViewBounds(star5,IMAGE_WIDTH_V,IMAGE_HEIGHT_V,IMAGE_X_V,false);
        setBounds(text5Star,STAR_QUESTION_WIDTH_V,newHeight,STAR_QUESTION_X_V,false,true);
        addMaxSpace(newHeight,((int)(IMAGE_HEIGHT_V*height)));
        addSpace(4,100);

        setBounds(textScore,1,TEXT_SCORE_HEIGHT_V,0,true,false);

        setImageViewBounds(buttonNoStars,BUTTON_NO_STARS_WIDTH_V,BUTTON_NO_STARS_HEIGHT_V,BUTTON_NO_STARS_X_V,false);
        setRatingBarBounds(ratingBar,RATING_BAR_WIDTH_V,SMALL_TEXT_HEIGHT,RATING_BAR_X_V,true);
        addSpace(3,100);
    }

    @Override
    protected void setItemsConfiguration() {
        textNumber.setText("Pregunta "+question.getNumber());
        textNumber.setGravity(Gravity.CENTER);
        textQuestion.setText(question.getQuestion());
        text1Star.setText(question.getQuestion1Star());
        text2Star.setText(question.getQuestion2Star());
        text3Star.setText(question.getQuestion3Star());
        text4Star.setText(question.getQuestion4Star());
        text5Star.setText(question.getQuestion5Star());


        star1.setImageResource(R.drawable.stars1);
        star2.setImageResource(R.drawable.stars2);
        star3.setImageResource(R.drawable.stars3);
        star4.setImageResource(R.drawable.stars4);
        star5.setImageResource(R.drawable.stars5);

        ratingBar.setNumStars(5);
        ratingBar.setStepSize(1);
        ratingBar.setRating(question.getSelectedQuestion());

        textScore.setText(TEXT_SCORE);
        textScore.setTextSize(getTextSize(45));
        textScore.setGravity(Gravity.CENTER);


        setCurrentRating(question.getSelectedQuestion());
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                int rating = (int)v;
                question.setSelectedQuestion(rating);
                question.setScore(rating);
                context.update();
                setCurrentRating(rating);
            }
        });
        buttonNoStars.setImageResource(R.drawable.redx);
        buttonNoStars.setBackgroundColor(Color.argb(0,250,250,250));
        buttonNoStars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question.setSelectedQuestion(0);
                question.setScore(0);
                context.update();
                setCurrentRating(0);
            }
        });

    }
    private void setRatingStarColor(Drawable drawable, @ColorInt int color)
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            DrawableCompat.setTint(drawable, color);
        } else {
            drawable.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        }
    }
    private void setCurrentRating(float rating) {
        LayerDrawable drawable = (LayerDrawable)ratingBar.getProgressDrawable();
        if(context!=null) {
            switch (Math.round(rating)) {
                case 0:
                    setRatingStarColor(drawable.getDrawable(2), ContextCompat.getColor(context,R.color.light_gray));
                    break;
                case 1:
                    setRatingStarColor(drawable.getDrawable(2), ContextCompat.getColor(context,R.color.red));
                    break;
                case 2:
                    setRatingStarColor(drawable.getDrawable(2), ContextCompat.getColor(context, R.color.orange));
                    break;
                case 3:
                    setRatingStarColor(drawable.getDrawable(2), ContextCompat.getColor(context, R.color.light_orange));
                    break;
                case 4:
                    setRatingStarColor(drawable.getDrawable(2), ContextCompat.getColor(context, R.color.yellow));
                    break;
                case 5:
                    setRatingStarColor(drawable.getDrawable(2), ContextCompat.getColor(context, R.color.light_yellow));
                    break;
            }
            setRatingStarColor(drawable.getDrawable(1), ContextCompat.getColor(context, R.color.transparent));
            setRatingStarColor(drawable.getDrawable(0), ContextCompat.getColor(context, R.color.light_gray));

        }
    }

}
