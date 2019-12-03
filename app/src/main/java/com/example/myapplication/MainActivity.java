package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //section of making buttons interact with the user
        Button ButtonONE = findViewById(R.id.SalatyMonitorButton1);
        ButtonONE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SalatyActivityOne = new Intent(MainActivity.this , prey.class);
                startActivity(SalatyActivityOne);
            }
        });

        Button ButtonTwo = findViewById(R.id.AfterSalatyButton2);
        ButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forgivenessActivity = new Intent(MainActivity.this , Forgiveness.class);
                startActivity(forgivenessActivity);
            }
        });



    }
}
