package com.example.anderson.helloworldhackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.anderson.helloworldhackathon.R;

public class EnterProductInfo extends AppCompatActivity {

    String name, description, pickupaddress, pickupinfo, email;

    EditText nameInput, descriptionInput, pickupaddressInput, pickupinfoInput, emailInput;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_product_info);

        nameInput = (EditText) findViewById(R.id.nameInput);
        descriptionInput = (EditText) findViewById(R.id.descriptionInput);
        pickupaddressInput = (EditText) findViewById(R.id.pickupaddressInput);
        pickupinfoInput = (EditText) findViewById(R.id.pickupinfoInput);
        emailInput = (EditText) findViewById(R.id.emailInput);
        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameInput.getText().toString();
                description = descriptionInput.getText().toString();
                pickupaddress = pickupaddressInput.getText().toString();
                pickupinfo = pickupinfoInput.getText().toString();
                email = emailInput.getText().toString();
                showToast(name);
                showToast(description);
                showToast(pickupaddress);
                showToast(pickupinfo);
                showToast(email);
            }
        });

        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(EnterProductInfo.this, TakePhoto.class);
                startActivity(in);
            }
        });
    }
    private void showToast(String text){
        Toast.makeText(EnterProductInfo.this, text, Toast.LENGTH_SHORT).show();
    }
}
