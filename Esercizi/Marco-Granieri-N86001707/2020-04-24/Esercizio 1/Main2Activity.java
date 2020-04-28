package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent activity = getIntent();
        getSupportActionBar().setTitle("Main2Activity");
        if (activity.hasExtra("textInput1")) {
            String text1 = activity.getStringExtra("textInput1"); // Ottieni la prima stringa passata dalla prima activity.
            String textToView = text1 != null && text1.length() > 0 ? "Primo campo di testo: " + text1 : "Primo campo di testo: VUOTO";
            TextView textView = findViewById(R.id.textView);
            textView.setText(textToView); // Mostra la stringa.

        }
        if (activity.hasExtra("textInput2")) {
            String text2 = activity.getStringExtra("textInput2"); // Ottieni la seconda stringa passata dalla prima activity.
            String textToView = text2 != null && text2.length() > 0 ? "Secondo campo di testo: " + text2 : "Secondo campo di testo: VUOTO";
            TextView textView = findViewById(R.id.textView);
            String oldText = textView.getText().toString();
            textView.setText(oldText != null ? oldText + "\n" + textToView : textToView); // Mostra la stringa.
        }
        if (activity.hasExtra("date")) {
            Date date = (Date)activity.getSerializableExtra("date"); // Ottieni l'oggetto passato dalla prima activity.
            String currentPassedTime = "Object data: " + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(date);
            TextView textView = findViewById(R.id.textView);
            String oldText = textView.getText().toString();
            textView.setText(oldText != null ? oldText + "\n\n" + currentPassedTime : currentPassedTime); // Mostra una rappresentazione dell'oggetto.
        }
    }
}
