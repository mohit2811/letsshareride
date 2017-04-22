package com.example.mohitpallaptop.letsshareride;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

public class sign_up_java extends AppCompatActivity {
    private EditText name,dob,username, password,mobile,email,conpass;
    private Button add;
    RadioButton b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        name = (EditText) findViewById(R.id.name_editText);
        dob = (EditText) findViewById(R.id.dob_editText);
        username = (EditText) findViewById(R.id.user_editText);
        password = (EditText) findViewById(R.id.pass_editText);
        conpass=(EditText) findViewById(R.id.con_pass_editText);
        mobile = (EditText) findViewById(R.id.mobile_editText);
        email = (EditText) findViewById(R.id.email_editText);


    }
    public void add(View v)
    {
    RadioGroup g = (RadioGroup) findViewById(R.id.radioGroup1);
    int selected = g.getCheckedRadioButtonId();

        if(selected!= -1) {
            b = (RadioButton) findViewById(selected);
        }
        else
        {
            return;
        }
         String nam= name.getText().toString();
         String date= dob.getText().toString();
         String usernam= username.getText().toString();
        String pass= password.getText().toString();
        String cpass= conpass.getText().toString();
        String mob= mobile.getText().toString();
        String mail= email.getText().toString();
         String gender = b.getText().toString();
        if(nam.equals(""))
        {
            Toast.makeText(sign_up_java.this,"Enter the name!!!",Toast.LENGTH_SHORT).show();

            return;
        }
         if(usernam.equals(""))
         {
             Toast.makeText(sign_up_java.this,"Enter the username!!!",Toast.LENGTH_SHORT).show();

             return;
         }
        if(pass.equals(""))
        {
            Toast.makeText(sign_up_java.this,"Enter the password!!!",Toast.LENGTH_SHORT).show();

            return;
        }
        if(cpass.equals(""))
        {
            Toast.makeText(sign_up_java.this,"confirm password!!!",Toast.LENGTH_SHORT).show();

            return;
        }
        if(mob.equals(""))
        {
            Toast.makeText(sign_up_java.this,"Enter the mobile number!!!",Toast.LENGTH_SHORT).show();

            return;
        }
        if(mail.equals(""))
        {
            Toast.makeText(sign_up_java.this,"Enter the Email!!!",Toast.LENGTH_SHORT).show();

            return;
        }
         if(date.equals(""))
         {
             Toast.makeText(sign_up_java.this,"Enter the Date of birth!!!",Toast.LENGTH_SHORT).show();

             return;
         }
        if(!pass.equals(cpass))
        {
            Toast.makeText(sign_up_java.this,"Password donot match!!!",Toast.LENGTH_SHORT).show();
            return;
        }

        JSONObject jobj =new JSONObject();
        try {
            jobj.put("name",nam);
            jobj.put("username",usernam);
            jobj.put("password",pass);
            jobj.put("mobile",mob);
            jobj.put("email",mail);
            jobj.put("dob",date);
            jobj.put("gender",gender);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        System.out.println(jobj);
         JsonObjectRequest jobject = new JsonObjectRequest("http://"+ipaddress.ip+"/add.php", jobj, new Response.Listener<JSONObject>() {
             @Override
             public void onResponse(JSONObject response) {

                 System.out.println(response);

             }
         }, new Response.ErrorListener() {
             @Override

             public void onErrorResponse(VolleyError error) {
    System.out.println(error);
             }
         });
         jobject.setRetryPolicy(new DefaultRetryPolicy(20000,4,2));
        AppController ap= new AppController(sign_up_java.this);
     ap.addToRequestQueue(jobject);
        pop_up_sign pop = new pop_up_sign(sign_up_java.this);

        pop.show();
    }
    }