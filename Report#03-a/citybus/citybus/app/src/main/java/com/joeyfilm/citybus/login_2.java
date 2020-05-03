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

public class login_2 extends AppCompatActivity {
    TextView text;
    Button button1,button2;
    EditText editText1,editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_2);
        button1=(Button)findViewById(R.id.button1);
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
                    button1.setBackgroundColor(Color.parseColor("#513ba1"));
                    button1.setTextColor(Color.parseColor("#FFFFFF"));
                    button1.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        text =(TextView) findViewById(R.id.textView5);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), com.joeyfilm.citybus.LoginMain.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                overridePendingTransition(0, 0);
                finish();
            }
        });
        button2 = (Button)findViewById(R.id.no_sign_up);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), com.joeyfilm.citybus.no_sing_up.class);
                startActivity(intent);
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
