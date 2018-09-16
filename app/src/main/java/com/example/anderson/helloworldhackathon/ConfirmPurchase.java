package com.example.anderson.helloworldhackathon;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class ConfirmPurchase extends OrdersArray {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_purchase);




    }

    public void confirmPurchase(View view){
        TextView itemName = (TextView) findViewById(R.id.textView);
        final String item = itemName.getText().toString();
        TextView itemPrice = (TextView) findViewById(R.id.textView6);
        final String price = itemPrice.getText().toString();

        final Order newestOrder = orders.get(orders.size() - 1);
        newestOrder.setPrice(price);
        newestOrder.setName(item);

//        new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                try {
//                    GMailSender sender = new GMailSender("mrmail12345678@gmail.com",
//                            "MrMail1234567!");
//                    sender.sendMail("Thank you for your order", "Thank you for ordering " + item + "from The 'Ket at Purdue University. Your order cost " + "$" + price + ". You will receive an email from your seller shortly with instructions regarding how to pick up your order. \n\nThanks,\nThe Team at The 'Ket",
//                            "mrmail12345678@gmail.com", newestOrder.getEmail());
//                } catch (Exception e) {
//                    Log.e("SendMail", e.getMessage(), e);
//                }
//            }
//
//        }).start();

        Intent intent = new Intent(ConfirmPurchase.this, ThankYouPage.class);
        startActivity(intent);
    }



}
