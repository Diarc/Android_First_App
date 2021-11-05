package com.example.zadanie1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {
                button1.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.VISIBLE);
                button1.setClickable(false);
                button2.setClickable(true);
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {
                button1.setVisibility(View.VISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button1.setClickable(true);
                button2.setClickable(false);
            }
        });
    }
}