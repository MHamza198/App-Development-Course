package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String arr[] = {"My Name is ", "Hamza ", "My passion is Developing", "I am studing Software Engineering"
    , "My best Way to learn with codewithharry", "Hello Friends!", "My faviout coding is Android Developing."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        //ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, arr);
        //listView.setAdapter(ad);

        HamzaAdapter ad = new HamzaAdapter(this, R.layout.hamzalayout, arr);
        listView.setAdapter(ad);
    }
}