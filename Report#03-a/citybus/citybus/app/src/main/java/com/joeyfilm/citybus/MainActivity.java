package com.joeyfilm.citybus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageButton peoplebtn,mypage,announcement,like,change;
    LinearLayout people;
    int updown = 0;
    Button lookup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peoplebtn = (ImageButton) findViewById(R.id.peoplebtn);
        people = (LinearLayout) findViewById(R.id.people);

        peoplebtn.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (updown == 0) {
                    people.setVisibility(View.VISIBLE);
                    peoplebtn.setRotation(180);
                    updown = 1;
                }
                else {
                    people.setVisibility(View.GONE);
                    peoplebtn.setRotation(0);
                    updown = 0;
                }
            }
        });

        mypage = (ImageButton) findViewById(R.id.mypage);
        mypage.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Mypage.class);
                startActivity(intent);
            }
        });

        announcement = (ImageButton) findViewById(R.id.announcement);
        announcement.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity_event.class);
                startActivity(intent);
            }
        });

        like = (ImageButton) findViewById(R.id.like);
        like.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Favorites.class);
                startActivity(intent);
            }
        });

        change = (ImageButton) findViewById(R.id.chage);
        change.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),confirm.class);
                startActivity(intent);
            }
        });

        lookup = (Button)findViewById(R.id.lookup);
        lookup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),BusChoose.class);
                startActivity(intent);
            }
        });
    }

}
