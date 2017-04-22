package com.example.mohitpallaptop.letsshareride;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.view.View;

/**
 * Created by Mohitpal laptop on 10-02-2017.
 */


public class pop_up_error extends Dialog implements View.OnClickListener {
    Button okButton;
Context mycontext;
    public pop_up_error(Context context) {
        super(context);
        this.mycontext=context;
        setContentView(R.layout.pop_up_error);
        okButton = (Button) findViewById(R.id.ok_text);
        okButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


            Intent i = new Intent(mycontext,MainActivity.class);
            mycontext.startActivity(i);
        dismiss();
        ((Activity) mycontext).finish();
        }
    }
