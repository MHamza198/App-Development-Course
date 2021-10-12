package com.example.massagedisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView v1;
    TextView v2;
    TextView v3;
    TextView v4;
    EditText n1,n2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toast.makeText(this, "Good Morning Friends!", Toast.LENGTH_SHORT).show();
        v1 = findViewById(R.id.v1);
        v2 = findViewById(R.id.v2);
        v3 = findViewById(R.id.v3);
        v4 = findViewById(R.id.v4);
//        text.setText("Good Morning!!");
            n1 = findViewById(R.id.n1);
            n2 = findViewById(R.id.n2);
            button = findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int sum = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
                    v1.setText("Sum: " + Integer.parseInt(n1.getText().toString()) + " + " + Integer.parseInt(n2.getText().toString()) + " = " + sum);
                    int multi = Integer.parseInt(n1.getText().toString()) * Integer.parseInt(n2.getText().toString());
                    v2.setText("Multiplication: " + Integer.parseInt(n1.getText().toString()) + " * " + Integer.parseInt(n2.getText().toString()) + " = " + multi);
                    double div = Integer.parseInt(n1.getText().toString()) / Integer.parseInt(n2.getText().toString());
                    v3.setText("Division: " + Integer.parseInt(n1.getText().toString()) + " / " + Integer.parseInt(n2.getText().toString()) + " = " + div);
                    int diff = Integer.parseInt(n1.getText().toString()) - Integer.parseInt(n2.getText().toString());
                    v4.setText("Difference: " + Integer.parseInt(n1.getText().toString()) + " - " + Integer.parseInt(n2.getText().toString()) + " = " + diff);
                }
            });

    }
}