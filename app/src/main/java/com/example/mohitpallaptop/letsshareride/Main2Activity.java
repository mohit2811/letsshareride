package com.example.mohitpallaptop.letsshareride;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }
    public void login(View v)
    {
        Intent i = new Intent(Main2Activity.this ,MainActivity.class);

        startActivity(i);

        finish();
    }
    public void sign(View v)
    {
        Intent i = new Intent(Main2Activity.this ,sign_up_java.class);

        startActivity(i);

        finish();
    }
    public void skip(View v)
    {
        Intent i = new Intent(Main2Activity.this, HomeActivity.class);

        startActivity(i);

        finish();
    }
    public void admin(View v)
    {
        Intent i = new Intent(Main2Activity.this ,AdminActivity.class);

        startActivity(i);

        finish();
    }
}
