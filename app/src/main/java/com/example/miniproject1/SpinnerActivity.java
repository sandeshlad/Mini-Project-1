package com.example.miniproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpinnerActivity extends AppCompatActivity {

    Spinner spinner;
    String string []={"Android","Java","JQuery","Node","HTML"};
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        getSupportActionBar().setTitle("Spinner Activity");

        spinner=findViewById(R.id.spinner1);
        arrayAdapter=new ArrayAdapter(SpinnerActivity.this,android.R.layout.simple_list_item_1,string);
        spinner.setAdapter(arrayAdapter);
    }
}
