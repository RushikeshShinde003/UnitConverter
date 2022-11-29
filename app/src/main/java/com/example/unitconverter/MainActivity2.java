package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    private TextView textView2;
    private EditText editTextTextPersonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = findViewById(R.id.button);
        textView2 = findViewById(R.id.textView2);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = editTextTextPersonName.getText().toString();
                double cm = Integer.parseInt(a);
                double m = cm / 100;
                textView2.setText("Value from cm to m is : "+m);
            }
        });

        button2 = findViewById(R.id.button2);
        textView2 = findViewById(R.id.textView2);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = editTextTextPersonName.getText().toString();
                double m = Integer.parseInt(b);
                double km = m / 1000;
                textView2.setText("Value from m to km is : "+km);
            }
        });

        button3 = findViewById(R.id.button3);
        textView2 = findViewById(R.id.textView2);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = editTextTextPersonName.getText().toString();
                double x = Integer.parseInt(c);
                double z = x * 1000;
                textView2.setText("Value from km to m is : "+z);
            }
        });

        button4 = findViewById(R.id.button4);
        textView2 = findViewById(R.id.textView2);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String d = editTextTextPersonName.getText().toString();
                double i = Integer.parseInt(d);
                double j = i * 100000;
                textView2.setText("Value from km to cm is : "+j);
            }
        });

        button5 = findViewById(R.id.button5);
        textView2 = findViewById(R.id.textView2);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e = editTextTextPersonName.getText().toString();
                double l = Integer.parseInt(e);
                double n = l / 100000;
                textView2.setText("Value from cm to km is : "+n);
            }
        });
    }
}