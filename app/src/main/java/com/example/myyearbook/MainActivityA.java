package com.example.myyearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);

    Button btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent i = new Intent(getApplicationContext(), NextActivityA.class);
            startActivity(i);
        }
    });
}}