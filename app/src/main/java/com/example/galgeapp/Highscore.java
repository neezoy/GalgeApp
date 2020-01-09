package com.example.galgeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Highscore extends AppCompatActivity {

    private ArrayList<String> word = new ArrayList<>();
    private ArrayList<String> mistakes = new ArrayList<>();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);




        // Preference manager
        SharedPreferences pref = getSharedPreferences("FILE", MODE_PRIVATE);

        //load previous data
        String scoreData = pref.getString("saveData", "empty empty");


        Log.d("test", scoreData);


        //Read string into arraylist
        String[] listItem = scoreData.split(",");
        for (String s : listItem){
            String[] t = s.split(" ");
            word.add(t[0]);
            mistakes.add("mistakes: " + t[1]);
        }



        //init list
        RecyclerView list = findViewById(R.id.recyclerview);
        RecyclerListAdapter adapter = new RecyclerListAdapter(word, mistakes, this);
        list.setAdapter(adapter);
        list.setLayoutManager(new LinearLayoutManager(this));




    }
}
