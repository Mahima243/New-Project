package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ItemDetail extends AppCompatActivity {
    TextView itemlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        itemlist = (TextView) findViewById(R.id.itemlist);


        Intent intent = getIntent();
        itemlist.setText(intent.getStringExtra("select"));

    }
}