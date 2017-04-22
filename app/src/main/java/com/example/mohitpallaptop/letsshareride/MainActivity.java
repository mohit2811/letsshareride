package com.example.mohitpallaptop.letsshareride;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    private EditText username, password;
String uname,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.user_edit);
        password = (EditText) findViewById(R.id.pass_edit);
    }

    public void done(View view) {
        uname=username.getText().toString();
        pass=password.getText().toString();
        JSONObject jobj =new JSONObject();
        try {
            jobj.put("name",uname);
            jobj.put("password",pass);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        System.out.println(jobj);
        JsonObjectRequest jobject = new JsonObjectRequest("http://"+ipaddress.ip+"/check.php", jobj, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println(response);

                try {
                    if(response.getString("r").equals("done"))
                    {
                        Intent i = new Intent(MainActivity.this , HomeActivity.class);

                        startActivity(i);
                        finish();
                    }
                    else{
                        Toast.makeText(MainActivity.this,"error ",Toast.LENGTH_SHORT).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override

            public void onErrorResponse(VolleyError error) {
                System.out.println(error);
            }
        });
        jobject.setRetryPolicy(new DefaultRetryPolicy(20000,4,2));
        AppController ap= new AppController(MainActivity.this);
        ap.addToRequestQueue(jobject);
    }
    }
