package com.example.anderson.helloworldhackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BuySellPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_sell_page);
    }

    public void sell(View view){
       Intent intent = new Intent(BuySellPage.this, EnterProductInfo.class);
       startActivity(intent);
    }

    public void buy(View view){
        Intent intent = new Intent(BuySellPage.this, SearchPage.class);
        startActivity(intent);
}
}
