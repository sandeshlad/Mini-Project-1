package com.example.miniproject1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ContextMenu extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);
        getSupportActionBar().setTitle("ContextMenu Activity");

        textView=findViewById(R.id.contexttext);

        registerForContextMenu(textView);


    }

    @Override
    public void onCreateContextMenu(android.view.ContextMenu menu, View v, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.android:
                Toast.makeText(getApplicationContext(), "Android", Toast.LENGTH_LONG).show();
                break;

            case R.id.java:
                Toast.makeText(getApplicationContext(), "Java", Toast.LENGTH_LONG).show();
                break;

            case R.id.php:
                Toast.makeText(getApplicationContext(), "PHP", Toast.LENGTH_LONG).show();
                break;


        }
        return super.onContextItemSelected(item);
    }



}
