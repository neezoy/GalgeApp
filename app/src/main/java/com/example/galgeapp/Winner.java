package com.example.galgeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Winner extends AppCompatActivity implements View.OnClickListener {

    TextView wword;
    TextView wmistakes;
    Button tryagain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);


        wword = findViewById(R.id.textViewWWord);
        wmistakes = findViewById(R.id.textViewWmistakes);
        tryagain = findViewById(R.id.buttonTryagain);

        wword.setText("Word: " + SessionInfo.word);
        wmistakes.setText("Mistakes: " + SessionInfo.mistakes);

        tryagain.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent c = new Intent(this, MainActivity.class);
        startActivity(c);

    }
}
