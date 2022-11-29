package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    private TextView textView7;
    private EditText editTextTextPersonName6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        button1 = findViewById(R.id.button1);
        textView7 = findViewById(R.id.textView7);
        editTextTextPersonName6 = findViewById(R.id.editTextTextPersonName6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = editTextTextPersonName6.getText().toString();
                double cm = Integer.parseInt(a);
                double m = cm / (1e+6)  ;
                textView7.setText("Value from sq.m to sq.km is : "+m);
            }
        });

        button2 = findViewById(R.id.button2);
        textView7 = findViewById(R.id.textView7);
        editTextTextPersonName6 = findViewById(R.id.editTextTextPersonName6);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = editTextTextPersonName6.getText().toString();
                double m = Integer.parseInt(b);
                double km = m*(1.076e+7) ;
                textView7.setText("Value from sq.km to sq.ft is : "+km);
            }
        });

        button3 = findViewById(R.id.button3);
        textView7 = findViewById(R.id.textView7);
        editTextTextPersonName6 = findViewById(R.id.editTextTextPersonName6);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = editTextTextPersonName6.getText().toString();
                double x = Integer.parseInt(c);
                double z = x / (1.076e+7);
                textView7.setText("Value from sq.ft to sq.km is : "+z);
            }
        });

        button4 = findViewById(R.id.button4);
        textView7 = findViewById(R.id.textView7);
        editTextTextPersonName6 = findViewById(R.id.editTextTextPersonName6);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String d = editTextTextPersonName6.getText().toString();
                double i = Integer.parseInt(d);
                double j = (i / 10.764) ;
                textView7.setText("Value from sq.ft to sq.m is : "+j);
            }
        });

        button5 = findViewById(R.id.button5);
        textView7 = findViewById(R.id.textView7);
        editTextTextPersonName6 = findViewById(R.id.editTextTextPersonName6);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e = editTextTextPersonName6.getText().toString();
                double l = Integer.parseInt(e);
                double n = (l * 10.764) ;
                textView7.setText("Value from sq.m to sq.ft is : "+n);
            }
        });



    }
}