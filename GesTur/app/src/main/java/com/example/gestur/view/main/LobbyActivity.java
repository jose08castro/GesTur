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
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.gestur.DB.DB;
import com.example.gestur.R;
import com.example.gestur.logic.Activity;
import com.example.gestur.logic.User;
import com.example.gestur.view.checkListView.CheckListView;
import com.example.gestur.view.FormView;

import java.util.ArrayList;

public class LobbyActivity extends AbstractActivity implements NavigationView.OnNavigationItemSelectedListener,ILobbyActivityConstants{

    private RelativeLayout layoutLobby;
    private ScrollView scroll;

    private TextView textTitle;
    private TextView textNoActivities;

    private ArrayList<ActivityPanel> activityPanels;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);
        user = DB.getInstance().getCurrentUser();

        configElements();
        createItems();
        setItemsConfiguration();
        setItemsBounds();
        addItems();

        loadActivities();

        scroll.setMinimumHeight(5200);
        layoutLobby.setMinimumHeight(5200);
    }
    private void loadActivities(){
        if(user.getActivities() != null && user.getActivities().size()>0){
            int counter = 0;
            for(Activity activity:user.getActivities()){
                ActivityPanel panel = new ActivityPanel(activity,this);
                panel.addComponents(width,height,totalY,layoutLobby);
                totalY+=panel.getHeight();
                addSpace(5,100);
                activityPanels.add(panel);
                counter++;
            }
        }
    }

    private void createItems(){
        layoutLobby = findViewById(R.id.layoutLobby);
        scroll = findViewById(R.id.scrollLobby);
        textTitle = new TextView(layoutLobby.getContext());
        textNoActivities = new TextView(layoutLobby.getContext());
        activityPanels = new ArrayList<ActivityPanel>();
    }

    @Override
    protected void setItemsBoundsHorizontal() {

    }

    @Override
    protected void setItemsBoundsVertical() {

        addSpace(1,100);
        setBounds(textTitle,text_title_Width,text_title_Heght,text_title_X);
        addSpace(2,100);
        setBounds(textNoActivities,1,text_title_Heght,0);
    }

    @Override
    protected void setItemsConfiguration() {
        textTitle.setText(text_title);
        textTitle.setGravity(Gravity.CENTER);
        textTitle.setTextSize(getTextSize(32));

        textNoActivities.setText("Actividades agregadas: " +user.getActivities().size());
        textNoActivities.setGravity(Gravity.CENTER);
        textNoActivities.setTextSize(getTextSize(40));
    }

    private void addItems(){
        layoutLobby.addView(textTitle);
        layoutLobby.addView(textNoActivities);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
        DB.getInstance().logOut();
        startActivity(new Intent(context, LoginActivity.class));
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
    private void configElements(){
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
    }
}
