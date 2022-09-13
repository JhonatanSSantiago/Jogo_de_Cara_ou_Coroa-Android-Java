package com.jhonssantiago.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //
                Intent it = new Intent(getActivity(),
                        MainActivity.class);
                startActivity(it);
            }
        }, 3000);

    }//onCreate
    public Context getActivity(){
        return this;

    }
}