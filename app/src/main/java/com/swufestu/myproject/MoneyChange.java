package com.swufestu.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MoneyChange extends AppCompatActivity {
    EditText dollarText;
    EditText euroText;
    EditText wonText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_change);

        Intent intent = getIntent();

        dollarText = (EditText)findViewById(R.id.dollar_rate_new);
        euroText = (EditText)findViewById(R.id.euro_rate_new);
        wonText = (EditText)findViewById(R.id.won_rate_new);

        dollarText.setText(String.valueOf(intent.getFloatExtra("dollar_rate",0.35f)));
        euroText.setText(String.valueOf(intent.getFloatExtra("euro_rate",0.28f)));
        wonText.setText(String.valueOf(intent.getFloatExtra("won_rate",501)));
    }

    public void save(View btn){
        float newDollar = Float.parseFloat(dollarText.getText().toString());
        float newEuro = Float.parseFloat(euroText.getText().toString());
        float newWon = Float.parseFloat(wonText.getText().toString());

        Intent intent = getIntent();

        Bundle bdl = new Bundle();
        bdl.putFloat("dollar_key",newDollar);
        bdl.putFloat("euro_key",newEuro);
        bdl.putFloat("won_key",newWon);

        intent.putExtras(bdl);

        setResult(5,intent);

        finish();
    }
}