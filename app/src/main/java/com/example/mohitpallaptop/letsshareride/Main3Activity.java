package com.example.mohitpallaptop.letsshareride;

import android.content.Intent;
import android.os.Handler;
import android.net.Uri;
import android.widget.VideoView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Handler h=new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i =new Intent(Main3Activity.this,Main2Activity.class);

            }
        },2000);

    }
}
