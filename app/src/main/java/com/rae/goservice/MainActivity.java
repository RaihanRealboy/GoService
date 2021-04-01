package com.rae.goservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
    }

    public void ClickHospital(View view) {
        // Logo RS di klik
        Intent i = new Intent(this,Hospital.class);
        startActivity(i);
    }

    public void ClickPolice(View view) {
        // Logo RS di klik
        Intent i = new Intent(this,Police.class);
        startActivity(i);
    }

    public void ClickGrocery(View view) {
        // Logo RS di klik
        Intent i = new Intent(this,Grocery.class);
        startActivity(i);
    }

    public void ClickSchool(View view) {
        // Logo RS di klik
        Intent i = new Intent(this,School.class);
        startActivity(i);
    }

}