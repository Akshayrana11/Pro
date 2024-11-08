# Pro
package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b;
    public static final String MyPrefrences="myprefs";
    public static final String name="namekey";
    public static final String phone="phonekey";
    public static final String email="emailkey";
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
        b=(Button)findViewById(R.id.button);

        sharedPreferences=getSharedPreferences(MyPrefrences,
                Context.MODE_PRIVATE);
        if (sharedPreferences.contains(name)) {
            e1.setText(sharedPreferences.getString(name,""));
        }
        if (sharedPreferences.contains(phone)) {
            e2.setText(sharedPreferences.getString(phone,""));
        }
        if (sharedPreferences.contains(email)) {
            e3.setText(sharedPreferences.getString(email,""));
        }
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = e1.getText().toString();
                String ph = e2.getText().toString();
                String e = e3.getText().toString();
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(name,n);
                editor.putString(phone,ph);
                editor.putString(email,e);
                editor.commit();
Toast.makeText(MainActivity.this,"Thanks for saving Data...!!",Toast.LENGTH_LONG).show();

            }
        });
    }
}
