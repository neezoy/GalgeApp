package com.example.galgeapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Game extends AppCompatActivity implements View.OnClickListener {
    Galgelogik galgelogik = new Galgelogik();
    TextView wordtoguess;
    EditText guessbox;
    Button guessbutton;
    ImageView hangman;
    TextView info;
    boolean gameActive = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.game);

        //setup views
        guessbox = findViewById(R.id.guessingbox);
        guessbutton = findViewById(R.id.guessbutton);
        hangman = findViewById(R.id.hangman);
        wordtoguess = findViewById(R.id.wordtoguess);
        info = findViewById(R.id.infoview);

        //Get ord fra dr
        //galgelogik.hentOrdFraDr();
        AsyncInternetDataTransfer internetOrd = new AsyncInternetDataTransfer(galgelogik);
        internetOrd.execute();


        //initialization
        wordtoguess.setText(galgelogik.getSynligtOrd());
        hangman.setImageResource(R.drawable.galge);



        //Guess word
        guessbutton.setOnClickListener(this);




    }



    public void update() {

        //get base state
        wordtoguess.setText(galgelogik.getSynligtOrd());
        info.setText("Used: " + galgelogik.getBrugteBogstaver());

        if (galgelogik.erSpilletVundet()) {
            //info.setText("You won!");
            SessionInfo.save(galgelogik.getAntalForkerteBogstaver(), galgelogik.getOrdet());
            Intent win = new Intent(this, Winner.class);
            startActivity(win);
        }
        if (galgelogik.erSpilletTabt()) {
            //info.setText("You lost! The word was: " + galgelogik.getOrdet());
            SessionInfo.save(galgelogik.getAntalForkerteBogstaver(), galgelogik.getOrdet());
            Intent lost = new Intent(this, Looser.class);
            startActivity(lost);
        }

        switch (galgelogik.getAntalForkerteBogstaver()){

            case 1:
                hangman.setImageResource(R.drawable.forkert1);
                break;

            case 2:
                hangman.setImageResource(R.drawable.forkert2);
                break;

            case 3:
                hangman.setImageResource(R.drawable.forkert3);
                break;

            case 4:
                hangman.setImageResource(R.drawable.forkert4);
                break;

            case 5:
                hangman.setImageResource(R.drawable.forkert5);
                break;

            case 6:
                hangman.setImageResource(R.drawable.forkert6);
                break;

            default:
                break;
        }



    }



    @Override
    public void onClick(View view) {
        String guess = guessbox.getText().toString();
        galgelogik.gætBogstav(guess);
        guessbox.setText("");
        update();



    }

    public void load() {



    }



}
