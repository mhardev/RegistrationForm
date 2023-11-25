package com.dote.registrationform;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Intent intent = getIntent();
        String fName = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView mvRegister = findViewById(R.id.tvRegister);
        mvRegister.setText("Welcome to Google, " + fName + "!");
    }
}