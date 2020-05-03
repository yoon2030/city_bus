package com.joeyfilm.citybus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class payment extends AppCompatActivity {

    private TextView day;
    private String str;
    private SimpleDateFormat mFormat = new SimpleDateFormat("yyy/MM/dd");
    Button card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        day = (TextView) findViewById(R.id.day);

        Date date = new Date();
        str = mFormat.format(date);



        day.setText(str);

        card = (Button)findViewById(R.id.card);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),payment2.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
