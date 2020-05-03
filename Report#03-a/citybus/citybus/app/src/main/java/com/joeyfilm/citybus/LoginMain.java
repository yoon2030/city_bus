package com.joeyfilm.citybus;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class LoginMain extends AppCompatActivity {
    TextView text;
    EditText editText1,editText2;
    Button button1,login;
    TextView id_search;
    TextView pw_search;
    TextView sign_up;
    public static ArrayList<Activity> actList = new ArrayList<Activity>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);
        button1=(Button)findViewById(R.id.button1);
        button1.setEnabled(false);
       editText1=(EditText)findViewById(R.id.Sample1);
       editText2=(EditText)findViewById(R.id.Sample2);
       editText2.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               if(editText1.getText().toString().equals("")||editText2.getText().toString().equals("")) {
                   button1.setBackgroundColor(Color.parseColor("#d6d5d5"));
                   button1.setTextColor(Color.parseColor("#000000"));
                   button1.setEnabled(false);
               }
           }

           @Override
           public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               if(editText1.getText().toString().equals("")||editText2.getText().toString().equals("")) {
                   button1.setBackgroundColor(Color.parseColor("#d6d5d5"));
                   button1.setTextColor(Color.parseColor("#000000"));
                   button1.setEnabled(false);

               }
               else{
                   button1.setEnabled(true);
                   button1.setBackgroundColor(Color.parseColor("#513ba1"));
                   button1.setTextColor(Color.parseColor("#FFFFFF"));
               }
           }

           @Override
           public void afterTextChanged(Editable editable) {

           }
       });

        id_search=(TextView) findViewById(R.id.id_search);
        id_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),id_search.class);
                startActivity(intent);
            }
        });
        pw_search=(TextView)findViewById(R.id.pw_search);
        pw_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),pw_search.class);
                startActivity(intent);
            }
        });
        sign_up=(TextView)findViewById(R.id.sign_up);
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), com.joeyfilm.citybus.sign_up_1.class);
                startActivity(intent);
            }
        });
        text =(TextView) findViewById(R.id.textView4);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),login_2.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                overridePendingTransition(0, 0);
                finish();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
