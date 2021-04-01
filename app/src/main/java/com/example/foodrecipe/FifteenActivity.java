package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FifteenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifteen);
        getSupportActionBar().hide();
    }
}