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

//        story terughalen uit saved instance state als we restoren(draaien)
        if (bundle != null) {
            story = (Story) bundle.getSerializable("story");
        }
//       anders uit vorige activity inladen en stream enalles bouwen (nieuwe bouwen)
        else {
                Intent i = getIntent();
                String item = (String) i.getStringExtra("chosen_item");

                //        findview by id voor textvakje en dan get text
                //        text moet placeholder worden

                // check om bij gekozen item het bijbehorende verhaal openen


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

                //    Making an instance of the story class
                story = new Story(stream);
            }

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
        String input = words.getText().toString();
        story.fillInPlaceholder(input);
        Integer remainingcount = story.getPlaceholderRemainingCount();
        counter.setText("Words remaining:" + remainingcount);
        words.setText("");
        String placeholder = story.getNextPlaceholder();
        words.setHint(placeholder);

        if (story.isFilledIn()){
            String endstory = story.toString();

            // intent aanmaken
            Intent i = new Intent(Words_Activity.this, FinalActivity.class);

            // en item meegeven aan intent naar nieuwe activity (verhaaltje invullen met woorden)

            i.putExtra("endstory", endstory);
            startActivity(i);
        }



    }
}
