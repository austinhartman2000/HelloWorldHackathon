package com.example.anderson.helloworldhackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class WelcomeScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);


    }

    /** Called when the user taps the Send button */

    public void login(View view) {

        EditText username = (EditText) findViewById(R.id.editText);
        EditText password = (EditText) findViewById(R.id.editText2);

        String user = username.getText().toString();
        String pass = username.getText().toString();

        if((!user.matches("")) && (!pass.equals(""))){
            Intent intent = new Intent(WelcomeScreen.this, BuySellPage.class);
            startActivity(intent);
        }else {
            TextView noCredentials = (TextView) findViewById(R.id.textView13);
            noCredentials.setVisibility((int) 1);
        }





    }

}
