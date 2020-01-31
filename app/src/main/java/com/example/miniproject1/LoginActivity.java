package com.example.miniproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    Button login;
    TextView attempt;
    int count = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login Activity");


        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.buttonLogin);
        attempt = findViewById(R.id.attempt);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // convert value into String
                String USERNAME = username.getText().toString();
                String PASSWORD = password.getText().toString();

                if (USERNAME.equals("sandesh") && PASSWORD.equals("123456")) {
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                } else {
                    count--;
                    attempt.setText(String.valueOf(count));
                    Toast.makeText(LoginActivity.this, "Wrong user or pass, Attemp Left " + String.valueOf(count),Toast.LENGTH_LONG).show();

                    if(count==0){
                        login.setEnabled(false);
                    }
                }

            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
