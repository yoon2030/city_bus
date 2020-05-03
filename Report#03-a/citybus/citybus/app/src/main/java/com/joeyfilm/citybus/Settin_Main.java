package com.joeyfilm.citybus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class Settin_Main extends AppCompatActivity {

    public static final int sub = 1001; /*다른 액티비티를 띄우기 위한 요청코드(상수)*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_main);

        Button button7 = (Button)findViewById(R.id.button7); /*페이지 전환버튼*/
        Button button8 = (Button)findViewById(R.id.button8);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button2 = (Button)findViewById(R.id.button2);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),setting3.class);
                startActivityForResult(intent,sub);//액티비티 띄우기
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),setting5.class);
                startActivityForResult(intent,sub);//액티비티 띄우기
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),setting2.class);
                startActivityForResult(intent,sub);//액티비티 띄우기
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}