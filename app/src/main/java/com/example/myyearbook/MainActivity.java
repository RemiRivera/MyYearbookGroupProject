package com.example.myyearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btnChange);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView mTextView = (TextView) findViewById(R.id.textView);
                mTextView.setText("Victini is a Fire/Psychic type Pokemon");
            }
        });



    }
}