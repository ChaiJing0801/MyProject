package com.swufestu.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SingleTeam extends AppCompatActivity {
    private static final String TAG = "SingleTeam";
    int score1 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_team);
    }
    public void click(View btn){
        Log.i(TAG, "click: ");
        if(btn.getId()==R.id.btn3){
            score1 += 3;
        }else if(btn.getId()==R.id.btn2){
            score1 += 2;
        }else if(btn.getId()==R.id.btn1){
            score1 ++;
        }else{
            score1 = 0;
        }

        TextView show = findViewById(R.id.score1);
        show.setText(String.valueOf(score1));

    }
}