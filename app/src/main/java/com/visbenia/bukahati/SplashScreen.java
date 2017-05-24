package com.visbenia.bukahati;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import java.util.HashMap;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(0x321fffff);

        Thread myThread = new Thread(){
            @Override
            public void run() {
            try{
                sleep(2000);
                Intent intent;
                intent = new Intent(getApplicationContext(), MainActivity.class);
            finish();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            }
        };
        myThread.start();
    }
}