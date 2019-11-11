package com.example.galgeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Looser extends AppCompatActivity implements View.OnClickListener {

    TextView lword;
    TextView lmistakes;
    Button tryagain2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_looser);

        lword = findViewById(R.id.textViewWWord);
        lmistakes = findViewById(R.id.textViewWmistakes);
        tryagain2 = findViewById(R.id.buttonTryagain2);

        lword.setText("Word: " + SessionInfo.word);
        lmistakes.setText("Mistakes: " + SessionInfo.mistakes);

        tryagain2.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        Intent c = new Intent(this, MainActivity.class);
        startActivity(c);

    }
}
