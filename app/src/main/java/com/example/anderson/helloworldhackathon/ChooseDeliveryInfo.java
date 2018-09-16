package com.example.anderson.helloworldhackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.regex.Pattern;



public class ChooseDeliveryInfo extends OrdersArray {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_delivery_info);


    }

    public void toConfirm(View view){
        EditText email = (EditText) findViewById(R.id.editText3);
        String emailAddr = email.getText().toString();

        if(isValid(emailAddr)){
            Intent in = new Intent(ChooseDeliveryInfo.this, ConfirmPurchase.class);
            startActivity(in);
            Order newOrder = new Order(emailAddr);
            orders.add(newOrder);
            //also need to save email
        }else {
            email.clearComposingText();
            TextView noEmailMessage = (TextView) findViewById(R.id.textView12);
            noEmailMessage.setVisibility((int) 1);
        }


    }

    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
}
