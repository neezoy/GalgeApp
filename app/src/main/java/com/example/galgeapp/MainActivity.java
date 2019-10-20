package com.example.galgeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button startknap;
    Button helpknap;
    Button bhighscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        helpknap = findViewById(R.id.buttonHelp);
        startknap = findViewById(R.id.startbutton);
        bhighscore = findViewById(R.id.buttonhighscore);

        //startknap.setText("Begin");
        startknap.setOnClickListener(this);
        bhighscore.setOnClickListener(this);





    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.startbutton:
                Intent i = new Intent(this, Game.class);
                startActivity(i);
                break;
            case R.id.buttonHelp:
                break;
            case R.id.buttonhighscore:
                Intent hs = new Intent(this, Highscore.class);
                startActivity(hs);
                break;


        }

    }
}
