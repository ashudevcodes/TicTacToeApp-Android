package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void multi(View v){
        Intent i= new Intent(this, multiplayerActivity.class);
        startActivity(i);
    }



    public void start(View view) {
        Intent i= new Intent(this, gameActivity.class);
        startActivity(i);
    }
}