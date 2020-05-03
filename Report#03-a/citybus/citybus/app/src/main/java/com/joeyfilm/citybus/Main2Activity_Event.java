package com.joeyfilm.citybus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity_Event extends AppCompatActivity {

//    public static Activity _Main_Activity_event;
//
//    private RecyclerView recyclerView;
//    private List<Person> personList = new ArrayList<>();
//    private Myadapter adapter;

    TextView textView5;
    TextView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2__event);

//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);

        textView5 = (TextView) findViewById(R.id.textView5);

        textView5.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        //여기에 이벤트를 적어주세요
                        Intent intent = new Intent(getApplicationContext(), MainActivity_event.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                        overridePendingTransition(0, 0);
                        finish();
                    }
                }
        );

        back = (TextView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
//
//        MainActivity_event MA = (MainActivity_event) MainActivity_event._Main_Activity;
//
//
//
//        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
//        getSupportActionBar().setCustomView(R.layout.notice_event);
//        recyclerView = findViewById(R.id.recyclerView);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        personList.add(new Person("03/16  마일리지 이벤트", "금"));
//        personList.add(new Person("01/21  티머니 페이백 이벤트", "수"));
//
//
//
//        adapter = new Myadapter(personList);
//        recyclerView.setAdapter(adapter);
//
//        MA.finish();

    }
}
