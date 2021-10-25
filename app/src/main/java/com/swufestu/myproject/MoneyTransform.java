package com.swufestu.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MoneyTransform extends AppCompatActivity {
    private static final String TAG = "money";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_transform);
    }
    public void click(View btn){
        Log.i(TAG, "click: ");
        EditText rmb = findViewById(R.id.input_rmb);
        TextView result = findViewById(R.id.hello);
        String inp = rmb.getText().toString();
        Log.i(TAG, "click: inp=" + inp);
        if(inp.length()>0){
            float num = Float.parseFloat(inp);
            float r = 0;
            if(btn.getId()==R.id.btn_dollar){
                r = num * 0.35f;
            }else if(btn.getId()==R.id.btn_euro){
                r = num * 0.28f;
            }else{
                r = num * 501;
            }
            Log.i(TAG, "click: r=" + r);
            result.setText(String.valueOf(r));
        }else {
            Toast.makeText(this, "请输入金额后再进行转换", Toast.LENGTH_SHORT).show();
        }
    }
}