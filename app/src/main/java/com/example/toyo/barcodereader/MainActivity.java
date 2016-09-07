package com.example.toyo.barcodereader;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
//Test github
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logo);

        final Thread ThBienvenue = new Thread() {
            public void run() {

                try {
                    sleep(5000);

                } catch (InterruptedException e) {
                    e.printStackTrace();

                } finally {
                    Intent i = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        ThBienvenue.start();

}}
