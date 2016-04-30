package com.example.azisrahmadian.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    //Opsi 1
    private static final String TAG = "MainActivity";
    //Opsi 2
    //private final String TAG = this.getClass().getSimpleName();
    int a =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("coba","oncreate terpanggil");
    }

    @Override
    protected void onStart(){
        int a = 1;
        Log.d(TAG, "onStart: terpanggil");
        Log.d(TAG, "onStart: A = "+String.valueOf(a));
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: terpanggil");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: terpanggil");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop: terpanggil");
    }
    
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy: terpanggil");
    }
}


