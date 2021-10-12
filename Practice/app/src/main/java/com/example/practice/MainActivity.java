package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] question = {"1. Java is a Person?",
            "2. Was Java introduce in 1980?",
            "3. Java was created using Python?",
            "4. Java has attribute classes?",
            "5. Java supports Interface?"};
    private boolean[] answers = {false, false, false, true, true};
    private int score = 0;
    private int index = 0;
    Button yes;
    Button no;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        textView2 = findViewById(R.id.textView2);
        textView2.setText(question[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=question.length - 1){
                    if(answers[index]== true)
                        score++;
                }
                index++;
                if(index<=question.length - 1){
                    textView2.setText(question[index]);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Your Score = " + score, Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=question.length - 1){
                    if(answers[index]== false)
                        score++;
                }
                index++;
                if(index<=question.length - 1){
                    textView2.setText(question[index]);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Your Score = " + score, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}