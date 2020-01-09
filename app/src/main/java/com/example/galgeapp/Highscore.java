package com.example.galgeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Highscore extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);




        // Preference manager
        SharedPreferences pref = getSharedPreferences("FILE", MODE_PRIVATE);

        //load previous data
        String scoreData = pref.getString("saveData", "empty");




        String[] highscore = SessionInfo.highscoreAL.toArray(new String[SessionInfo.highscoreAL.size()]);





        ListAdapter hsadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, highscore);





        ListView highscorelist = findViewById(R.id.list);
        highscorelist.setAdapter(hsadapter);






    }
}
