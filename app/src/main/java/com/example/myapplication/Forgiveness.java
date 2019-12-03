package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Forgiveness extends AppCompatActivity {

    //section of global variables
    private int mNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgiveness);

        TextView NumberInCircle = findViewById(R.id.forgivenessCounter);
        NumberInCircle.setText(""+mNumber);


        Button forgivenessButton = findViewById(R.id.forgiveness_button);
        forgivenessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Increment();
                //check area
                if(mNumber == 33){
                    TextView forGivenessText = findViewById(R.id.forgiveness_textView);
                    forGivenessText.setText("الله أكبر");

                }else if(mNumber == 66){
                    TextView forGivenessText = findViewById(R.id.forgiveness_textView);
                    forGivenessText.setText("الحمدلله");
                }else if(mNumber == 99){
                    mNumber =0;
                    TextView forGivenessText = findViewById(R.id.forgiveness_textView);
                    forGivenessText.setText("استغفر الله العظيم");
                }
                TextView NumberInCircle = findViewById(R.id.forgivenessCounter);
                NumberInCircle.setText(""+mNumber);

            }
        });

    }


    private void Increment(){
        mNumber++;

    }


}
