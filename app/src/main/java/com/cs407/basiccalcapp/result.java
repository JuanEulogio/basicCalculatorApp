package com.cs407.basiccalcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textView= (TextView)findViewById(R.id.result);
        Intent intent= getIntent();
        String str= intent.getStringExtra("result");
        textView.setText (str);
    }
}