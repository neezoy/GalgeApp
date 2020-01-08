package com.example.galgeapp;


import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class SessionInfo {

    //private static SessionInfo sessionInfo = new SessionInfo();

    public static boolean gameActive;
    public static int mistakes = 0;
    public static String word;
    public static ArrayList<String> highscoreAL = new ArrayList<>();



    public static void save(int failures, String answer){
        mistakes = failures;
        word = answer;

        String temp = "Word: " + answer + " | " + failures + " failures";
        highscoreAL.add(temp);



        //String json = new Gson().toJson(highscoreAL);

    }








}
