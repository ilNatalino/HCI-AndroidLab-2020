package com.example.esercizioradiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addRadioButton(View view) {
        RadioGroup radioLayout = findViewById(R.id.RadioLayout);
        RadioButton radioB = new RadioButton(this);
        radioB.setText("🐱");
        radioLayout.addView(radioB);
        radioB.setChecked(true);
    }
}
