package com.example.anderson.helloworldhackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.anderson.helloworldhackathon.R;

public class SearchPage extends AppCompatActivity {

    String searchWord;
    EditText searchInput;
    Button searchButton, switchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);

        searchInput = (EditText) findViewById(R.id.searchInput);
        searchButton = (Button) findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchWord = searchInput.getText().toString();
                showToast(searchWord);
            }
        });

        switchButton = (Button) findViewById(R.id.switchButton);
        switchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(SearchPage.this, ItemInfoBuyer.class);
                startActivity(in);
            }
        });

    }

    private void showToast(String text){
        Toast.makeText(SearchPage.this, text, Toast.LENGTH_SHORT).show();
    }
}
