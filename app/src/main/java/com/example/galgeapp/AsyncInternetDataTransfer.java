package com.example.galgeapp;

import android.os.AsyncTask;


public class AsyncInternetDataTransfer extends AsyncTask<Galgelogik, Void, Void> {

    private Galgelogik logik;

    AsyncInternetDataTransfer(Galgelogik logik) {
        this.logik = logik;
    }


    protected Void doInBackground(Galgelogik[] params) {
        try {
            logik.hentOrdFraDr();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
