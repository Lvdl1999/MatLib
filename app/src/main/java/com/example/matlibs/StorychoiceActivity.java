package com.example.matlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StorychoiceActivity extends AppCompatActivity {

    private ListView storylist;
    private ArrayAdapter arrayAdapter;
    private String[] stories= {"simple story", "tarzan story", "university story", "clothes story", "dance story"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storychoice);

        storylist = findViewById(R.id.storylist);

//        Geeft een standaard layout aan elke view in listview
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, stories);
//        set adapter zet alle titels op hun plek in listview
        storylist.setAdapter(arrayAdapter);

        storylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = (String) storylist.getItemAtPosition(position);
//                kijken welke titel is ingeklikt
                //TODO eventueel met switchcase doen, switch (item)
//                story meegeven aan intent
                if (item.equals("simple story")){
                    Log.wtf("klik iets", "geklikt1");
                }
                else if (item.equals("tarzan story")){
                    Log.wtf("klik iets", "geklikt2");
                }
                else if (item.equals("university story")){
                    Log.wtf("klik iets", "geklikt3");
                }
                else if (item.equals("clothes story")){
                    Log.wtf("klik iets", "geklikt4");
                }
                else if (item.equals("dance story")){
                    Log.wtf("klik iets", "geklikt5");
                }

//TODO                intent aanmaken
                Intent i = new Intent(StorychoiceActivity.this, Words_Activity.class);

//TODO                 en item meegeven aan intent naar nieuwe activity (verhaaltje invullen met woorden)

                i.putExtra("chosen_item", item);
                startActivity(i);

            }
        });

    }
}
