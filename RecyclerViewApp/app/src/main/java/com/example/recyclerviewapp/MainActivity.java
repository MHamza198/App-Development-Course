package com.example.recyclerviewapp;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String [] arr = {"M.Hamza", "2019-ag-6162", "BS(Software Engeering", "University Of Agriculture Faisalabad",
            "4th Semester","M.Hamza", "2019-ag-6162", "BS(Software Engeering", "University Of Agriculture Faisalabad",
            "4th Semester","M.Hamza", "2019-ag-6162", "BS(Software Engeering", "University Of Agriculture Faisalabad",
            "4th Semester","M.Hamza", "2019-ag-6162", "BS(Software Engeering", "University Of Agriculture Faisalabad",
            "4th Semester",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter c = new CustomAdapter(arr);
        recyclerView.setAdapter(c);
    }
}