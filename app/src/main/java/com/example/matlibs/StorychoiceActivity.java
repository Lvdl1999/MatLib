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

        // Gives a standard layout to the listview
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, stories);

        // Set Adapter puts all titles of the stories at their position in the listview
        storylist.setAdapter(arrayAdapter);

        // Checking which item was clicked and return this story through intent
        storylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = (String) storylist.getItemAtPosition(position);

                // Creating a new intent and returning chosen item through new activity
                Intent i = new Intent(StorychoiceActivity.this, Words_Activity.class);
                i.putExtra("chosen_item", item);
                startActivity(i);
            }
        });
    }
}
