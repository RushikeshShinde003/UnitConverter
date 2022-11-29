package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    private TextView textView4;
    private EditText editTextTextPersonName3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        button1 = findViewById(R.id.button1);
        textView4 = findViewById(R.id.textView4);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = editTextTextPersonName3.getText().toString();
                double cm = Integer.parseInt(a);
                double m = cm * 3.6;
                textView4.setText("Value from m/s to km/hr is : "+m);
            }
        });

        button2 = findViewById(R.id.button2);
        textView4 = findViewById(R.id.textView4);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = editTextTextPersonName3.getText().toString();
                double m = Integer.parseInt(b);
                double km = m / 3.6;
                textView4.setText("Value from km/hr to m/s is : "+km);
            }
        });

        button3 = findViewById(R.id.button3);
        textView4 = findViewById(R.id.textView4);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = editTextTextPersonName3.getText().toString();
                double x = Integer.parseInt(c);
                double z = x * 1.609 ;
                textView4.setText("Value from mph to km/hr is : "+z);
            }
        });

        button4 = findViewById(R.id.button4);
        textView4 = findViewById(R.id.textView4);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String d = editTextTextPersonName3.getText().toString();
                double i = Integer.parseInt(d);
                double j = i * 2.237;
                textView4.setText("Value from m/s to mph is : "+j);
            }
        });

        button5 = findViewById(R.id.button5);
        textView4 = findViewById(R.id.textView4);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e = editTextTextPersonName3.getText().toString();
                double l = Integer.parseInt(e);
                double n = l / 1.609;
                textView4.setText("Value from km/hr to mph is : "+n);
            }
        });








    }
}