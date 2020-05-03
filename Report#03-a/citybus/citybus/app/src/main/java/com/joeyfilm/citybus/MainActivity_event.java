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

public class MainActivity_event extends AppCompatActivity {
    TextView textView4;
    TextView back;
    //public static Activity _Main_Activity;


//    private RecyclerView recyclerView;
//    private List<Person> personList = new ArrayList<>();
//    private Myadapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_event);
        //_Main_Activity = MainActivity_event.this;


//        // 액션바 뒤로가기 버튼
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);

        textView4 = (TextView)findViewById(R.id.textView4);

        textView4.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        //여기에 이벤트를 적어주세요
                        Intent intent = new Intent(getApplicationContext(), Main2Activity_Event.class);
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
//
//
//
//        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
//        getSupportActionBar().setCustomView(R.layout.notice_event);
//        recyclerView = findViewById(R.id.recyclerView);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        personList.add(new Person("03/06  개인정보 처리방침 약관", "금"));
//        personList.add(new Person("01/01  서비스 이용약관", "수"));
//        personList.add(new Person("11/22  전자금융이용 정보보호수칙", "목"));
//        personList.add(new Person("05/10  모바일티머니사용 USIM변경", "금"));
//        personList.add(new Person("03/20  이용자 유의사항", "월"));
//        personList.add(new Person("04/27  마일리지 유효기간", "금"));
//        personList.add(new Person("04/23  회원정보 정기변경", "토"));
//        personList.add(new Person("04/13  일부 노선 변경안내", "금"));
//        personList.add(new Person("02/10  불편사항 접수", "화"));
//
//
//        adapter = new Myadapter(personList);
//        recyclerView.setAdapter(adapter);

    }
}
