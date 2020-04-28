package com.example.esercizio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Seconda finestra");
        setContentView(R.layout.activity_main2);
        Intent intentAttuale = getIntent();
        TextView T1 = findViewById(R.id.textViewUsernameOttenuto);
        TextView T2 = findViewById(R.id.textViewPasswordOttenuta);
        T1.setText(intentAttuale.getStringExtra("username"));
        T2.setText(intentAttuale.getStringExtra("password"));

    }
}
