package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class gameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public void backToHome(View v){
        Intent i=new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void restart(View v){
        Intent i=new Intent(this,gameActivity.class);
        startActivity(i);
    }
    int[] gameState={2,2,2,2,2,2,2,2,2,2};
    int player=0;
    public void imageClicked(View v){
        v.setEnabled(false);
        ImageView img=(ImageView) v;
        int tappedImage=Integer.parseInt(img.getTag().toString());
        if(gameState[tappedImage]==2){
            gameState[tappedImage]= player;
            if(player ==0){
                img.setImageResource(R.drawable.oig__1_);
                Intent i=getIntent();
                String playerMove1=i.getStringExtra("move");
                ((TextView)findViewById(R.id.textView5)).setText(playerMove1);
                player =1;





            }
            else{
                img.setImageResource(R.drawable.oig_removebg_preview);
                Intent i=getIntent();
                String playerMove2=i.getStringExtra("move2");
                ((TextView)findViewById(R.id.textView5)).setText(playerMove2);

                player =0;
            }
        }
        }

}
