package com.example.anderson.helloworldhackathon;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Xml;
import android.widget.Button;

import org.xmlpull.v1.XmlPullParser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

<<<<<<< HEAD
public class WelcomeScreen extends AppCompatActivity {
=======
    EditText UsernameEt, PasswordEt;
>>>>>>> 9779467d166d37b8a14a0ab019c477aad956833c

    EditText UsernameEt, PasswordEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

<<<<<<< HEAD
        UsernameEt = (EditText)findViewById(R.id.editText2);
        PasswordEt = (EditText)findViewById(R.id.editText);
=======
        UsernameEt = (EditText)findViewById(R.id.etUserName);
        PasswordEt = (EditText)findViewById(R.id.etPassword);
>>>>>>> 9779467d166d37b8a14a0ab019c477aad956833c
    }

    /** Called when the user taps the Send button */
        public void onLogin(View view) {
            System.out.println("Entered method");
            String username = UsernameEt.getText().toString();
            String password = PasswordEt.getText().toString();
            String type = "login";

<<<<<<< HEAD
            TextView invalidCredentials = (TextView) findViewById(R.id.invalid);

            BackgroundWorker backgroundWorker = new BackgroundWorker(this, invalidCredentials, WelcomeScreen.this);
            backgroundWorker.execute(type,username,password);
            System.out.println("found");

            System.out.println("result is: " + backgroundWorker.answer);

            String res = backgroundWorker.answer;

            System.out.println("RES is: " + res);
=======
    public void onLogin(View view) {
        String username = UsernameEt.getText().toString();
        String password = PasswordEt.getText().toString();
        String type = "login";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type,username,password);
>>>>>>> 9779467d166d37b8a14a0ab019c477aad956833c

//            if(res.equals("login success")){
//                Intent intent = new Intent(WelcomeScreen.this, BuySellPage.class);
//                startActivity(intent);
//            } else {
//                TextView invalidCredentials = (TextView) findViewById(R.id.invalid);
//                invalidCredentials.setVisibility((int) 1);
//            }




        }


    }


