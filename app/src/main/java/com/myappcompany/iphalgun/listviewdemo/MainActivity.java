package com.myappcompany.iphalgun.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.myListView);

        final ArrayList<String> myFriends = new ArrayList<>();
        //ArrayList<>(asList("". "","","");
        myFriends.add("Phalgun");
        myFriends.add("Shreya");
        myFriends.add("Tanish");
        myFriends.add("Muskan");
        myFriends.add("Mukul");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFriends);

        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Hello "+myFriends.get(i), Toast.LENGTH_SHORT).show();
            }
        });

       /* ListView myListView = findViewById(R.id.myListView);

        final ArrayList<String> myFamily = new ArrayList<String>();

        myFamily.add("Phalgun");
        myFamily.add("Sheru");
        myFamily.add("Muku");
        myFamily.add("Musk");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);

        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("person selected", myFamily.get(i));
            }
        });*/
    }
}
