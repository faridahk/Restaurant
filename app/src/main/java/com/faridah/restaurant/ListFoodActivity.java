package com.faridah.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListFoodActivity extends AppCompatActivity {

    int[] IMAGES={R.drawable.meals1,R.drawable.meals2,R.drawable.meals3,R.drawable.meals4,R.drawable.meals5,R.drawable.meals6,R.drawable.melas7,R.drawable.drink1,R.drawable.drink2,R.drawable.drink3,R.drawable.drink4};
    String[] NAMES={"Good meal","Nice meal","Hot meal","Flavored meal","Wonderful food","Mixed food","Weel prepared food","Soft drink","Soft drink","Cool drink","Energy drink"};
    String[] DESCRIPTION={"10,000shs","20,000shs","30,0000shs","10,000shs","40,000shs","50,000shs","60,000shs","1000shs","2000shs","1500shs","3000shs"};


    final String TAG = "States";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_food);

        Log.d(TAG, "MainActivity: onCreate()");

        ListView listView=(ListView)findViewById(R.id.listview);

        //setting a custom adapter for the listview
        CustomAdapter customAdapter= new CustomAdapter();
        listView.setAdapter(customAdapter);



    }
    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.image_item, null);

            ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
            TextView textView_name = (TextView) convertView.findViewById(R.id.textView_name);
            TextView textview_description = (TextView) convertView.findViewById(R.id.textView_description);

            imageView.setImageResource(IMAGES[position]);
            textView_name.setText(NAMES[position]);
            textview_description.setText(DESCRIPTION[position]);


            /*convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(MainActivity.this,NextActivity.class);
                    startActivity(intent);
                }
            });*/
            return convertView;
        }
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
                   case R.id.list2:
                    Intent inten= new Intent(ListFoodActivity.this,LoginActivity.class);
                    startActivity(inten);
                    return true;

                case R.id.list3:
                    Intent inte= new Intent(ListFoodActivity.this,AboutusActivity.class);
                    startActivity(inte);
                    return true;
                default:

                    return super.onOptionsItemSelected(item);
            }


        }
        @Override
        protected void onPause() {
            super.onPause();
            Log.d(TAG, "ListFoodActivity: onRestart()");
        }

    }








