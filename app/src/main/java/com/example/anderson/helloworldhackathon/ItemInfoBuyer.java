package com.example.anderson.helloworldhackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ItemInfoBuyer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_info_buyer);
    }

    public void buyNow(View view){
        Intent intent = new Intent(ItemInfoBuyer.this, ChooseDeliveryInfo.class);
        startActivity(intent);
    }
}
