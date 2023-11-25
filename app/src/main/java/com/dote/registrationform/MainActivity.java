package com.dote.registrationform;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.registration.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText firstName = findViewById(R.id.fstName);

        Button register = findViewById(R.id.btnCreate);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegisterActivity();
            }
            public void openRegisterActivity() {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);

                String fName = firstName.getText().toString();
                intent.putExtra(EXTRA_MESSAGE, fName);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "You've been registered! ",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}

