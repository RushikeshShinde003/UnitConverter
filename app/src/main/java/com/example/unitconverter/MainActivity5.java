package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    private TextView textView5;
    private EditText editTextTextPersonName4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        button1 = findViewById(R.id.button1);
        textView5 = findViewById(R.id.textView5);
        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = editTextTextPersonName4.getText().toString();
                double cm = Integer.parseInt(a);
                double m = (cm * 1.8)+32 ;
                textView5.setText("Value from C to F is : "+m);
            }
        });

        button2 = findViewById(R.id.button2);
        textView5 = findViewById(R.id.textView5);
        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = editTextTextPersonName4.getText().toString();
                double m = Integer.parseInt(b);
                double km = (m - 32)*0.556;
                textView5.setText("Value from F to C is : "+km);
            }
        });

        button3 = findViewById(R.id.button3);
        textView5 = findViewById(R.id.textView5);
        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = editTextTextPersonName4.getText().toString();
                double x = Integer.parseInt(c);
                double z = (x-273.15);
                textView5.setText("Value from K to C is : "+z);
            }
        });

        button4 = findViewById(R.id.button4);
        textView5 = findViewById(R.id.textView5);
        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String d = editTextTextPersonName4.getText().toString();
                double i = Integer.parseInt(d);
                double j = i + 273.15;
                textView5.setText("Value from C to K is : "+j);
            }
        });

        button5 = findViewById(R.id.button5);
        textView5 = findViewById(R.id.textView5);
        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e = editTextTextPersonName4.getText().toString();
                double l = Integer.parseInt(e);
                double n = ((l-273.15)*1.8)+32;
                textView5.setText("Value from K to F is : "+n);
            }
        });





    }
}