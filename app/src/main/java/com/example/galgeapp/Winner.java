package com.example.galgeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.github.jinatonic.confetti.CommonConfetti;

public class Winner extends AppCompatActivity implements View.OnClickListener {

    TextView wword;
    TextView wmistakes;
    Button tryagain;
    ConstraintLayout confetti;

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

        //music yay!
        player = MediaPlayer.create(this, R.)


        //confetti

        Handler handler = new Handler();
        handler.postDelayed(task, 3000);




    }

    @Override
    public void onClick(View view) {
        Intent c = new Intent(this, MainActivity.class);
        startActivity(c);

    }

    private Runnable task = new Runnable() {
        public void run() {
            confetti = findViewById(R.id.winnerlayout);
            CommonConfetti.rainingConfetti(confetti, new int[] {Color.BLACK, Color.YELLOW, Color.GREEN }).infinite();
        }
    };



}
