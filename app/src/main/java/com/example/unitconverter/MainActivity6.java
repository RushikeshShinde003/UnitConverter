package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    private TextView textView6;
    private EditText editTextTextPersonName5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        button1 = findViewById(R.id.button1);
        textView6 = findViewById(R.id.textView6);
        editTextTextPersonName5 = findViewById(R.id.editTextTextPersonName5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = editTextTextPersonName5.getText().toString();
                double cm = Integer.parseInt(a);
                double m = (cm / 60) ;
                textView6.setText("Value from sec to min is : "+m);
            }
        });

        button2 = findViewById(R.id.button2);
        textView6 = findViewById(R.id.textView6);
        editTextTextPersonName5 = findViewById(R.id.editTextTextPersonName5);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = editTextTextPersonName5.getText().toString();
                double m = Integer.parseInt(b);
                double km = (m / 60) ;
                textView6.setText("Value from min to hr is : "+km);
            }
        });

        button3 = findViewById(R.id.button3);
        textView6 = findViewById(R.id.textView6);
        editTextTextPersonName5 = findViewById(R.id.editTextTextPersonName5);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = editTextTextPersonName5.getText().toString();
                double x = Integer.parseInt(c);
                double z = (x * 60) ;
                textView6.setText("Value from hr to min is : "+z);
            }
        });

        button4 = findViewById(R.id.button4);
        textView6 = findViewById(R.id.textView6);
        editTextTextPersonName5 = findViewById(R.id.editTextTextPersonName5);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String d = editTextTextPersonName5.getText().toString();
                double i = Integer.parseInt(d);
                double j = (i * 3600) ;
                textView6.setText("Value hr to sec is : "+j);
            }
        });

        button5 = findViewById(R.id.button5);
        textView6 = findViewById(R.id.textView6);
        editTextTextPersonName5 = findViewById(R.id.editTextTextPersonName5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e = editTextTextPersonName5.getText().toString();
                double l = Integer.parseInt(e);
                double n = ( l / 3600 ) ;
                textView6.setText("Value from sec to hr is : "+n);
            }
        });


    }
}