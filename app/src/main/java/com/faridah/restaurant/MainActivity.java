package com.faridah.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*NAME:KYAKUHAIRE FARIDAH
COURSE: BIT
REGNO:2017/BIT/174*/




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread thread = new Thread()
        {
            @Override
            public void run()
            {

                try
                {
                    sleep(3000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    Intent welcomeIntent = new Intent(MainActivity.this,LoginActivity.class);
                    startActivity(welcomeIntent);

                }
            }
        };
        thread.start();
    }

    @Override
    protected void onPause() {

        super.onPause();
        finish();
    }
}

