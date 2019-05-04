package com.example.matlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    private Button startbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startbutton = findViewById(R.id.startbutton);

//        om te beginnen laadt je hier altijd het simpele verhaal
        InputStream is = getResources().openRawResource(R.raw.madlib0_simple);

        //    Making an instance of the story class
        Story story = new Story(is);


    }

    public void startGame(View view) {

        Intent intent = new Intent(this, StorychoiceActivity.class);
        startActivity(intent);
    }


//    beginpagina welkom en start spel
//    keuze uit 5 verhaaltjes
//    kijken op welk verhaal is geklikt en dat bijhouden met Clicklistener
//    adhv verhaal wat iemand kiest moet dat op achtergrond worden geladen


}
