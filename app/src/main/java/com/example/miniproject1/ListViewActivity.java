package com.example.miniproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    ListView listView;
    String string []={"Android","Java","PHP","HTML","JQuery","Jsp"};
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        getSupportActionBar().setTitle("ListView Activity");

        listView=findViewById(R.id.listview);
        arrayAdapter=new ArrayAdapter(ListViewActivity.this,android.R.layout.simple_list_item_1,string);
        listView.setAdapter(arrayAdapter);
    }
}
