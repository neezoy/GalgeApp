package com.example.galgeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button startknap;
    Button helpknap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startknap = findViewById(R.id.startbutton);
        //startknap.setText("Begin");
        startknap.setOnClickListener(this);

        helpknap = findViewById(R.id.buttonHelp);


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
        }

    }
}
