package com.example.galgeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Highscore extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);

    //demo data
        SessionInfo.highscoreAL.add("Word: Cykel | 3 Failures");
        SessionInfo.highscoreAL.add("Word: bus | 3 Failures");
        SessionInfo.highscoreAL.add("Word: tog | 5 Failures");
        SessionInfo.highscoreAL.add("Word: hat | 1 Failures");
        SessionInfo.highscoreAL.add("Word: hat | 1 Failures");
        SessionInfo.highscoreAL.add("Word: hat | 1 Failures");
        SessionInfo.highscoreAL.add("Word: hat | 1 Failures");
        SessionInfo.highscoreAL.add("Word: hat | 1 Failures");
        SessionInfo.highscoreAL.add("Word: hat | 1 Failures");
        SessionInfo.highscoreAL.add("Word: hat | 1 Failures");
        SessionInfo.highscoreAL.add("Word: hat | 1 Failures");
        SessionInfo.highscoreAL.add("Word: hat | 1 Failures");
        SessionInfo.highscoreAL.add("Word: hat | 1 Failures");




        String[] highscore = SessionInfo.highscoreAL.toArray(new String[SessionInfo.highscoreAL.size()]);





        ListAdapter hsadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, highscore);





        ListView highscorelist = findViewById(R.id.list);
        highscorelist.setAdapter(hsadapter);






    }
}
