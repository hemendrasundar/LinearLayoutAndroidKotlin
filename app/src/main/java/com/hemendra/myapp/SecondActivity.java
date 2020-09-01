package com.hemendra.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i("Create-Activity2","onCreate is called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Start-Activity2","onStart is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Resume-Activity2","onResume is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Pause-Activity2","onPause is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Stop-Activity2","onStop is called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Restart-Activity2","onRestart is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Destroy-Activity2","onDestroy is called");
    }
}