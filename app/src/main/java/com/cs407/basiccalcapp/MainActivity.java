package com.cs407.basiccalcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view){
        EditText num1= (EditText)findViewById(R.id.num1);
        EditText num2= (EditText)findViewById(R.id.num2);
        try{
            int val1= Integer.parseInt(num1.getText().toString());
            int val2= Integer.parseInt(num2.getText().toString());
            val1= val1+val2;
            String finalVal= String.valueOf(val1);
            goToActivity(finalVal);
        }catch (NumberFormatException e){
            goToActivity("Error: invalid input");
        }


    }
    public void sub(View view){
        EditText num1= (EditText)findViewById(R.id.num1);
        EditText num2= (EditText)findViewById(R.id.num2);
        try {
            int val1= Integer.parseInt(num1.getText().toString());
            int val2= Integer.parseInt(num2.getText().toString());
            val1= val1-val2;
            String finalVal= String.valueOf(val1);
            goToActivity(finalVal);
        }catch (NumberFormatException e){
            goToActivity("Error: invalid input");
        }

    }
    public void mult(View view){
        EditText num1= (EditText)findViewById(R.id.num1);
        EditText num2= (EditText)findViewById(R.id.num2);
        try {
            int val1= Integer.parseInt(num1.getText().toString());
            int val2= Integer.parseInt(num2.getText().toString());
            int val= val1*val2;
            String finalVal= String.valueOf(val);
            goToActivity(finalVal);
        }catch (NumberFormatException e){
            goToActivity("Error: invalid input");
        }

    }
    public void div(View view){
        EditText num1= (EditText)findViewById(R.id.num1);
        EditText num2= (EditText)findViewById(R.id.num2);

        try {
            int val1= Integer.parseInt(num1.getText().toString());
            int val2= Integer.parseInt(num2.getText().toString());

            if(val2 == 0){
                goToActivity("error: cannot divide by zero");
            }else{
                double val= (double)(val1)/(double)(val2);
                Log.i("INFO", String.valueOf(val));
                String finalVal= String.valueOf(val);
                goToActivity(finalVal);
            }

        }catch (NumberFormatException e){
            goToActivity("Error: invalid input");
        }

    }

    public void goToActivity(String s){
        Intent intent = new Intent (this, result.class);
        intent.putExtra("result", s);
        startActivity(intent);
    }
}