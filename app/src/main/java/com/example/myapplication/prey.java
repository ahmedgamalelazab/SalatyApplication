package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class prey extends AppCompatActivity {

    //section of controls

    int mNumberForCheck = 0;

    //end of controls
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prey);
        //picking an arrayList to store my data in \
        ArrayList<String>selectItems = new ArrayList<String>();
        ListView chl = findViewById(R.id.List);
            chl.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
            String[] items ={"فجر","ضهر","عصر","مغرب","عشاء"};
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this,R.layout.row_layout,R.id.text_prey,items);
        chl.setAdapter(listAdapter);
        chl.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CheckedTextView selectedItem = (CheckedTextView) view;
                boolean IsChecked = selectedItem.isChecked();
                if(IsChecked){
                    mNumberForCheck++;
                }
            }
        });
    }

    public void RateMe(View view){

        TextView State = findViewById(R.id.preyState);
        CheckedTextView selectedItem = findViewById(R.id.text_prey);

        switch (mNumberForCheck){

            case 0 :
                State.setText("حرام عليك ما تصلى ولا تركع حتى ركعه !");
                break;

            case 1:
                State.setText("صلاه واحده بس مش حلوة لو كانت هيا محصله اليوم ! ");
                break;

            case 2:
                State.setText("صلاتين مش حلوة برده لو كانت هيا دى محصله اليوم !");
                break;
            case 3:
                State.setText("3 فروض ليك كويس بس مش حلوة برده لو كانت هيا دى محصله اليوم !");
                break;
            case 4:
                State.setText("4 ركعات ممتاز جدا بس فرحنا بقا ب 5 ركعات !");
                break;

            case 5:
                State.setText("الله اكبر عليك ما شاء الله انت الان مسلم مستقر استغفر الله وادعي بانك تكمل كده");
                break;

        }
    }
}
