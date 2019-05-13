package com.example.matlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.InputStream;

public class Words_Activity extends AppCompatActivity {

    private Button submitbutton;
    private EditText words;
    private Story story;
    private TextView counter;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_words_);
        submitbutton = findViewById(R.id.button);
        words = findViewById(R.id.putwords);
        counter = findViewById(R.id.counter);

        // If the app (for instance) is rotated get story from saved instance state as we restore
        if (bundle != null) {
            story = (Story) bundle.getSerializable("story");
        }

        // Else reload from previous activity and build the words activity
        else {
                Intent i = getIntent();
                String item = (String) i.getStringExtra("chosen_item");

                // Checking which story the user has chosen
                InputStream stream;

                if (item.equals("simple story")) {
                    stream = getResources().openRawResource(R.raw.madlib0_simple);
                } else if (item.equals("tarzan story")) {
                    stream = getResources().openRawResource(R.raw.madlib1_tarzan);
                } else if (item.equals("university story")) {
                    stream = getResources().openRawResource(R.raw.madlib2_university);
                } else if (item.equals("clothes story")) {
                    stream = getResources().openRawResource(R.raw.madlib3_clothes);
                } else if (item.equals("dance story")) {
                    stream = getResources().openRawResource(R.raw.madlib4_dance);
                } else {
                    stream = getResources().openRawResource(R.raw.madlib0_simple);
                }

                // Making an instance of the story class
                story = new Story(stream);
            }

        // Making sure that the placeholder(count) is updated when starting the activity
        String placeholder = story.getNextPlaceholder();
        words.setHint(placeholder);
        Integer firstcount = story.getPlaceholderRemainingCount();
        counter.setText("Words remaining:" + firstcount);

    }

    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);

        bundle.putSerializable("story", story);

    }

    public void Fillinword(View view) {
        // Making sure that the placeholder(count) is updated during the game
        String input = words.getText().toString();
        story.fillInPlaceholder(input);
        Integer remainingcount = story.getPlaceholderRemainingCount();
        counter.setText("Words remaining:" + remainingcount);
        words.setText("");
        String placeholder = story.getNextPlaceholder();
        words.setHint(placeholder);

        if (story.isFilledIn()){
            String endstory = story.toString();

            // Creating a new intent and returning the completed story through new activity
            Intent i = new Intent(Words_Activity.this, FinalActivity.class);
            i.putExtra("endstory", endstory);
            startActivity(i);
        }
    }
}
