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
    }

    public void startGame(View view) {

        Intent intent = new Intent(this, StorychoiceActivity.class);
        startActivity(intent);
    }
}
