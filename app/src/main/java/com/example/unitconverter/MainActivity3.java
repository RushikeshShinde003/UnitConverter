package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    private TextView textView3;
    private EditText editTextTextPersonName2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button1 = findViewById(R.id.button1);
        textView3 = findViewById(R.id.textView3);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = editTextTextPersonName2.getText().toString();
                double cm = Integer.parseInt(a);
                double m = cm / 1000;
                textView3.setText("Value from gm to kg is : "+m);
            }
        });

        button2 = findViewById(R.id.button2);
        textView3 = findViewById(R.id.textView3);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = editTextTextPersonName2.getText().toString();
                double m = Integer.parseInt(b);
                double km = m * 2.205;
                textView3.setText("Value from kg to lb is : "+km);
            }
        });

        button3 = findViewById(R.id.button3);
        textView3 = findViewById(R.id.textView3);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = editTextTextPersonName2.getText().toString();
                double x = Integer.parseInt(c);
                double z = x / 2.205;
                textView3.setText("Value from lb to kg is : "+z);
            }
        });

        button4 = findViewById(R.id.button4);
        textView3 = findViewById(R.id.textView3);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String d = editTextTextPersonName2.getText().toString();
                double i = Integer.parseInt(d);
                double j = i * 453.6;
                textView3.setText("Value from lb to gm is : "+j);
            }
        });

        button5 = findViewById(R.id.button5);
        textView3 = findViewById(R.id.textView3);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e = editTextTextPersonName2.getText().toString();
                double l = Integer.parseInt(e);
                double n = l / 453.6;
                textView3.setText("Value from gm to lb is : "+n);
            }
        });



    }
}