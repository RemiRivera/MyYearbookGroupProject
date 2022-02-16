package com.example.myyearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button btnR = findViewById(R.id.btnRemi);
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), MainActivityR.class);
                startActivity(i);
            }
        });

        Button btnM = findViewById(R.id.btnMuhammad);
        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), MainActivityM.class); //done
                startActivity(i);
            }
        });

        Button btnA = findViewById(R.id.btnAlex);
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), MainActivityA.class); //change activity name
                startActivity(i);
            }
        });
    }
}
