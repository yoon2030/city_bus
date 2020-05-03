package com.joeyfilm.citybus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Paylist extends AppCompatActivity {
    TextView back;

    //private RecyclerView recyclerView;
    //private List<Person2> personList2 = new ArrayList<>();
    //private Adapter adapter;
    //Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paylist);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_paylist);
//        recyclerView = findViewById(R.id.recyclerView);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        personList2.add(new Person2("2020.4.15(수)", "시외버스터미널","충북대 후문", "(신용카드)", "1,300원"));
//        personList2.add(new Person2("2020.4.10(금)", "가경초등학교","사창사거리", "(티머니)", "1,300원"));
//        personList2.add(new Person2("2020.4.10(금)", "충북대 정문","현대아파트", "(신용카드)", "1,300원"));
//        personList2.add(new Person2("2020.3.9(월)", "충북대 후문","하나병원", "(티머니)", "1,300원"));
//        personList2.add(new Person2("2020.3.4(수)", "방송통신대학","사창사거리", "(티머니)", "1,300원"));
//        personList2.add(new Person2("2020.3.3(목)", "시외버스터미널","충북대 병원", "(신용카드)", "1,300원"));
//        personList2.add(new Person2("2020.2.19(화)", "충북대학교","성안길", "(신용카드)", "1,300원"));

//        button = (Button) findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), Mypage.class);
//                startActivity(intent);
//            }
//        });
//        adapter = new Adapter(personList2);
//        recyclerView.setAdapter(adapter);

        back = (TextView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
