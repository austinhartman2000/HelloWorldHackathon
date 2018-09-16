package com.example.anderson.helloworldhackathon;

import android.content.Intent;
import android.os.Bundle;

import android.app.Activity;

import android.os.Environment;
import android.util.Log;

import android.view.Menu;

import android.view.View;

import android.widget.Button;

import android.widget.Toast;



public class ConfirmPurchase extends OrdersArray {

    Button send;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_confirm_purchase);

        Order newestOrder = orders.get(orders.size() - 1);
        final String email = newestOrder.getEmail();
        System.out.println(email);



        send = (Button) findViewById(R.id.BuyNowButton);

        send.setOnClickListener(new View.OnClickListener() {



            public void onClick(View v) {

                // TODO Auto-generated method stub

                new Thread(new Runnable() {

                    public void run() {

                        try {

                            GMailSender sender = new GMailSender(

                                    "mrmail12345678@gmail.com",

                                    "MrMail12345678!");




                            sender.sendMail("Thank You for Your Order!", "Thank you for your order! You will receive an email from your seller shortly regarding pickup information.\n\nThanks for choosing The 'Ket!",

                                    "mrmail12345678@gmail.com",

                                    email);
                            System.out.println("success");

                            Intent intent = new Intent(ConfirmPurchase.this, ThankYouPage.class);
                            startActivity(intent);







                        } catch (Exception e) {

                            Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();



                        }

                    }

                }).start();

            }

        });



    }



}
