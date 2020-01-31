package com.example.miniproject1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Home Activity");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item_toast:
                startActivity(new Intent(HomeActivity.this,ToastActivity.class));
                Toast.makeText(getApplicationContext(), "Open Toast Activity", Toast.LENGTH_LONG).show();
                break;

            case R.id.item_c_toast:
                startActivity(new Intent(HomeActivity.this,CustomToastActivity.class));
                Toast.makeText(getApplicationContext(), "Open Custom Toast Activity", Toast.LENGTH_LONG).show();
                break;

            case R.id.item_popup:
                startActivity(new Intent(HomeActivity.this,PopUpActivity.class));
                Toast.makeText(getApplicationContext(), "Open PopUp Activity", Toast.LENGTH_LONG).show();
                break;

            case R.id.item_context:
                startActivity(new Intent(HomeActivity.this,ContextMenu.class));
                Toast.makeText(getApplicationContext(), "Open Context Activity", Toast.LENGTH_LONG).show();
                break;

            case R.id.item_list:
                startActivity(new Intent(HomeActivity.this,ListViewActivity.class));
                Toast.makeText(getApplicationContext(), "Open ListView Activity", Toast.LENGTH_LONG).show();
                break;

            case R.id.item_spinner:
                startActivity(new Intent(HomeActivity.this,SpinnerActivity.class));
                Toast.makeText(getApplicationContext(), "Open Spinner Activity", Toast.LENGTH_LONG).show();
                break;

            case R.id.item_autocomplete:
                startActivity(new Intent(HomeActivity.this,AutoCompleteActivity.class));
                Toast.makeText(getApplicationContext(), "Open AutoComplete Activity", Toast.LENGTH_LONG).show();
                break;

            case R.id.item_multiautocomplete:
                startActivity(new Intent(HomeActivity.this,MultiAutoCompleteActivity.class));
                Toast.makeText(getApplicationContext(), "Open MultiAtoComplete Activity", Toast.LENGTH_LONG).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }



}

