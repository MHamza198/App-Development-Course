package com.example.sharedprefrence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textTview);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = editText.getText().toString();
                SharedPreferences sp = getSharedPreferences("MyPref", MODE_PRIVATE);
                SharedPreferences.Editor ed = sp.edit();
                ed.putString("Name", val);
                ed.apply();
                textView.setText(val);

            }
        });
        SharedPreferences sp = getSharedPreferences("MyPref", MODE_PRIVATE);
        String editVal = sp.getString("Name", "No value!");
        textView.setText(editVal);

    }
}