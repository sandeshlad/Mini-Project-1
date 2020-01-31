package com.example.miniproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast);
        getSupportActionBar().setTitle("CustomToast Activity");


        Toast toast=new Toast(getApplicationContext());
        View view= LayoutInflater.from(this).inflate(R.layout.toast_layout,null);
        TextView toastTextView=view.findViewById(R.id.textToastView);
        toastTextView.setText("Welcome to Android");
        toast.setView(view);
        toast.setDuration(toast.LENGTH_LONG);
        // toast.setGravity(Gravity.BOTTOM | Gravity.END,0,32);
        toast.show();
    }
}
