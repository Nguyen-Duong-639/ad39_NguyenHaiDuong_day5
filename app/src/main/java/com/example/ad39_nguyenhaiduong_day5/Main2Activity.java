package com.example.ad39_nguyenhaiduong_day5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView phoneNumber1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        phoneNumber1=findViewById(R.id.phoneNumber1);

        setDataByExtras();


    }

    private void setDataByExtras() {
        Intent intent=getIntent();
        String number=intent.getStringExtra(MainActivity.LV);

        phoneNumber1.setText(number);
    }
}
