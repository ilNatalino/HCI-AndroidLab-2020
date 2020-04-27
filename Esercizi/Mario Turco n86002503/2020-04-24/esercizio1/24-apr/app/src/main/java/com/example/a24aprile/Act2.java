package com.example.a24aprile;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Act2 extends AppCompatActivity {
    private static final String TAG = "Act2";
    TextView testo1, testo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);

        testo1 = findViewById(R.id.textView1);
        testo2 = findViewById(R.id.textView2);

        setTextFromPreviousActivity();
    }

    private void setTextFromPreviousActivity() {
        Intent intent = getIntent();

        if (intent.hasExtra("testo1")) {
            String testoRicevuto1 = intent.getStringExtra("testo1");
            testo1.setText(testoRicevuto1);
            Log.d(TAG, "setTextFromPreviousActivity: ricevuto " + testoRicevuto1);
        } else
            testo1.setText("Testo non ricevuto");

        if (intent.hasExtra("testo2")) {
            String testoRicevuto2 = intent.getStringExtra("testo2");
            testo2.setText((CharSequence) testoRicevuto2);
            Log.d(TAG, "setTextFromPreviousActivity: ricevuto " + testoRicevuto2);
        } else
            testo2.setText("Testo non ricevuto");

        if (intent.hasExtra("oggetto")) {
            String primoTesto, secondoTesto;
            Messaggio messaggio;

            messaggio = (Messaggio) getIntent().getSerializableExtra("oggetto");
            primoTesto = messaggio.getParametro1();
            secondoTesto = messaggio.getParametro2();

            if (primoTesto.length() < 0)
                testo1.setText(primoTesto);
            else
                testo1.setText("Non ricevuto");
            if (secondoTesto.length() < 0)
                testo2.setText(secondoTesto);
            else
                testo1.setText("Non ricevuto");
        }
    }
}
