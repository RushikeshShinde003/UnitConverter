package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton imgButton1;
    ImageButton imgButton2;
    ImageButton imgButton3;
    ImageButton imgButton4;
    ImageButton imgButton5;
    ImageButton imgButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgButton1 = findViewById(R.id.imageButton1);
        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Length Converter Selected", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent1);
            }
        });

        imgButton2 = findViewById(R.id.imageButton2);
        imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Mass Converter Selected", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(intent2);
            }
        });

        imgButton3 = findViewById(R.id.imageButton3);
        imgButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Speed Converter Selected", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(getApplicationContext(),MainActivity4.class);
                startActivity(intent3);
            }
        });

        imgButton4 = findViewById(R.id.imageButton4);
        imgButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Temperature Converter Selected", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(getApplicationContext(),MainActivity5.class);
                startActivity(intent4);
            }
        });

        imgButton5 = findViewById(R.id.imageButton5);
        imgButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Time Converter Selected", Toast.LENGTH_SHORT).show();
                Intent intent5 = new Intent(getApplicationContext(),MainActivity6.class);
                startActivity(intent5);
            }
        });

        imgButton6 = findViewById(R.id.imageButton6);
        imgButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Area Converter Selected", Toast.LENGTH_SHORT).show();
                Intent intent6 = new Intent(getApplicationContext(),MainActivity7.class);
                startActivity(intent6);
            }
        });
    }
}