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


public class pop_up_sign extends Dialog implements View.OnClickListener {
    Button okButton;
    Context myContext;
    public pop_up_sign(Context context) {
        super(context);
        this.myContext = context;
        setContentView(R.layout.pop_up_sign);
        okButton = (Button) findViewById(R.id.ok_but);
        okButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        Intent i = new Intent(myContext,Main2Activity.class);
        myContext.startActivity(i);
        dismiss();
        ((Activity) myContext).finish();
    }
}
