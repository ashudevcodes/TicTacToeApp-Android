package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicked(View view){
        TextView t=findViewById(R.id.player1);
        String player1=t.getText().toString();
        TextView x=findViewById(R.id.player2);
        String player2=x.getText().toString();
        Toast.makeText(this, "Let Go...", Toast.LENGTH_SHORT).show();
        Intent i=new Intent(this, gameActivity.class);
        i.putExtra("move",player1);
        i.putExtra("move2",player2);
        startActivity(i);

    }

    public void meme(View v){
        Intent i= new Intent(this, multiplayerActivity.class);
        startActivity(i);
    }
}