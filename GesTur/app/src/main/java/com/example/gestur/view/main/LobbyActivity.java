package com.example.gestur.view.main;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.gestur.R;
import com.example.gestur.view.CheckListView;
import com.example.gestur.view.FormView;

public class LobbyActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,ILobbyActivityConstants{

    final Context context = this;
    private ConstraintLayout layoutLobby;
    private ScrollView scroll;
    private int width;
    private int height;
    private int totalY;

    private TextView textTitle;
    private TextView textName1;
    private Button buttonForm;
    private TextView textFormPer;
    private Button buttonCheckList;
    private TextView textCheckPer;

    //private Button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        getScreenSizes();
        totalY = 0;
        createItems();
        configItems();
        setItemsBounds();
        addItems();
        scroll.setMinimumHeight(1500);
        layoutLobby.setMinimumHeight(5200);
    }
    private void createItems(){
        layoutLobby = findViewById(R.id.layoutLobby);
        scroll = findViewById(R.id.scrollLobby);
        textTitle = new TextView(layoutLobby.getContext());
        textName1 = new TextView(layoutLobby.getContext());
        buttonForm = new Button(layoutLobby.getContext());
        textFormPer = new TextView(layoutLobby.getContext());
        buttonCheckList = new Button(layoutLobby.getContext());
        textCheckPer = new TextView(layoutLobby.getContext());
    }
    private void configItems(){
        textTitle.setText(text_title);
        textTitle.setGravity(Gravity.CENTER);
        textTitle.setTextSize(32);

        textName1.setTextSize(20);
        textName1.setGravity(Gravity.CENTER);
        textName1.setText(text_example);

        buttonForm.setText(text_button_Form);
        buttonForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context, FormView.class));
            }
        });

        textFormPer.setText("0%");
        textFormPer.setTextSize(20);
        textFormPer.setGravity(Gravity.CENTER);

        buttonCheckList.setText(text_button_Check);
        buttonCheckList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context, CheckListView.class));
            }
        });

        textCheckPer.setText("0%");
        textCheckPer.setTextSize(20);
        textCheckPer.setGravity(Gravity.CENTER);
    }
    private void setItemsBounds(){
        addSpace(space1p);
        setBounds(textTitle,text_title_Width,text_title_Heght,text_title_X);
        addSpace(space1p);
        setBounds(textName1,text_name_Width,text_name_Height,text_name_X);
        addSpace(space1p);
        setBounds(buttonForm,button_Width_V,button_height_V,button_X_V);
        addSpace(-button_height_V);
        setBounds(textFormPer,textPer_Width_V,textPer_height_V,textPer_X_V);
        addSpace(space1p);
        setBounds(buttonCheckList,button_Width_V,button_height_V,button_X_V);
        addSpace(-button_height_V);
        setBounds(textCheckPer,textPer_Width_V,textPer_height_V,textPer_X_V);
    }
    private void addItems(){
        layoutLobby.addView(textTitle);
        layoutLobby.addView(textName1);
        layoutLobby.addView(buttonForm);
        layoutLobby.addView(textFormPer);
        layoutLobby.addView(buttonCheckList);
        layoutLobby.addView(textCheckPer);
    }
    private void setBounds(View view, float w,float h,float x){
        view.setMinimumWidth((int)(w*width));
        view.setMinimumHeight((int)(h*height));
        view.setX(x*width);
        view.setY(totalY);
        totalY+=((int)(h*height));
    }
    private void addSpace(float space){
        totalY+=((int)(space*height));
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.lobby, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.new_activity) {
            startActivity(new Intent(this, RegisterActivity.class));

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    private void getScreenSizes()
    {
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        width = size.x;
        height = size.y;
    }
}
