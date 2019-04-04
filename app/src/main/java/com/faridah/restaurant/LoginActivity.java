package com.faridah.restaurant;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    final String TAG = "States";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.d(TAG, "MainActivity: onCreate()");

        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,ListFoodActivity.class);
                startActivity(intent);

            }
        });


            }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_item,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.list1:
                Intent intent = new Intent(LoginActivity.this,ListFoodActivity.class);
                startActivity(intent);
                return true;

            case R.id.list2:
                Intent inten= new Intent(LoginActivity.this,LoginActivity.class);
                startActivity(inten);
                return true;

            case R.id.list3:
                Intent inte= new Intent(LoginActivity.this,AboutusActivity.class);
                startActivity(inte);
                return true;
            default:

                return super.onOptionsItemSelected(item);
        }


    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "MainActivity: onRestart()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity: onStart()");
    }
}

