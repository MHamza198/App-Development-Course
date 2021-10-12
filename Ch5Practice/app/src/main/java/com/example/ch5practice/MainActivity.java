package com.example.ch5practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Contact o1 = new Contact(1,"03046788768", "M.Hamza");
    Contact o2 = new Contact(1,"03046788768", "M.Hamza");
    Contact o3 = new Contact(1,"03046788768", "M.Hamza");
    Contact o4 = new Contact(1,"03046788768", "M.Hamza");
    Contact o5 = new Contact(1,"03046788768", "M.Hamza");
    Contact o6 = new Contact(1,"03046788768", "M.Hamza");
    Contact o7 = new Contact(1,"03046788768", "M.Hamza");
    Contact o8 = new Contact(1,"03046788768", "M.Hamza");
    Contact o9 = new Contact(1,"03046788768", "M.Hamza");
    Contact [] contacts = {o1, o2, o3, o4, o5, o6, o7, o8, o9};
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad = new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}