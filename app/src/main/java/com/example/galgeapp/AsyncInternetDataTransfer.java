package com.example.galgeapp;

import android.os.AsyncTask;
import android.widget.TextView;


public class AsyncInternetDataTransfer extends AsyncTask<Galgelogik, Void, Void> {

    private Galgelogik logik;
    private TextView word;

    AsyncInternetDataTransfer(Galgelogik logik, TextView word) {
        this.logik = logik;
        this.word = word;
    }


    protected Void doInBackground(Galgelogik[] params) {
        try {
            logik.hentOrdFraDr();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    protected void onPostExecute(Void param) {
        word.setText(logik.getSynligtOrd());
    }



}



