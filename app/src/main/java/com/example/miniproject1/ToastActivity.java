package com.example.miniproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {

    Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        getSupportActionBar().setTitle("Toast Activity");

        show=findViewById(R.id.showToast);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Welcome TO Android",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
