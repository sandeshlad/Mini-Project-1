package com.example.miniproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    String string []={"Pune","mumbai","konkan","Kerala","Manipur","Ahmdabad","Beed","Chhatisghar","Daund"};
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);
        getSupportActionBar().setTitle("AutoComplete Activity");

        autoCompleteTextView=findViewById(R.id.city);
        arrayAdapter=new ArrayAdapter(AutoCompleteActivity.this,android.R.layout.simple_list_item_1,string);
        autoCompleteTextView.setAdapter(arrayAdapter);
        autoCompleteTextView.setThreshold(1);
    }
}
