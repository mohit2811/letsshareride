package com.example.mohitpallaptop.letsshareride;

/**
 * Created by Mohitpal laptop on 08-02-2017.
 */


import android.app.Activity;
import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.view.View;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    FragmentManager fm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Fragment ride_frag = new find_ride_fragment();
        ft.replace(R.id.frame_id ,ride_frag);
        ft.commit();
    }
    public void drawer(View v) {
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.activity_main);
        mDrawerLayout.openDrawer(Gravity.LEFT);
    }
    public void openoffer(View v)
    {
        FragmentTransaction ft = fm.beginTransaction();
        Fragment offer_ride = new offer_ride_fragment();
        ft.replace(R.id.frame_id ,offer_ride);
        ft.commit();
    }

    public void openride(View v)
    {
        FragmentTransaction ft = fm.beginTransaction();
        Fragment ride_frag = new find_ride_fragment();
        ft.replace(R.id.frame_id ,ride_frag);
        ft.commit();
    }

    public void openmyride(View v)
    {
        FragmentTransaction ft = fm.beginTransaction();
        Fragment my_ride_frag = new my_ride_fragment.SwipeFragment();
        ft.replace(R.id.frame_id ,my_ride_frag);
        ft.commit();
    }
}