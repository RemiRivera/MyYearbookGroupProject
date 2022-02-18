package com.example.myyearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityR extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_r);

        Button btn = findViewById(R.id.btnPress1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView mTextView = findViewById(R.id.textView);
                mTextView.setText("Victini is a Fire/Psychic type Pokemon");

                Intent i = new Intent(getApplicationContext(), NextActivity.class);
                startActivity(i);
            }
        });

//Remi was here

    }
}