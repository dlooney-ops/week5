package com.example.jokesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_Joke1, btn_Joke2, btn_Joke3, btn_Joke4, btn_Joke5, btn_Joke6;

    TextView tv_message;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Joke1 = findViewById(R.id.btn_Joke1);
        btn_Joke2 = findViewById(R.id.btn_Joke2);
        btn_Joke3 = findViewById(R.id.btn_Joke3);
        btn_Joke4 = findViewById(R.id.btn_Joke4);
        btn_Joke5 = findViewById(R.id.btn_Joke5);
        btn_Joke6 = findViewById(R.id.btn_Joke6);


        tv_message = findViewById(R.id.tv_message);

        //create click listener
        btn_Joke1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "To get to the other side.", Toast.LENGTH_SHORT).show();
            }

        });

        btn_Joke2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Reality", Toast.LENGTH_SHORT).show();
            }
        });

        btn_Joke3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ground Beef", Toast.LENGTH_SHORT).show();
            }
        });

        // jokes 4 5 and 6 use the textview

        btn_Joke4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_message.setText("B");
            }
        });

        btn_Joke5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_message.setText("Slap!");
            }
        });

        btn_Joke6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_message.setText("Ouch!");
            }
        });
    }
}
