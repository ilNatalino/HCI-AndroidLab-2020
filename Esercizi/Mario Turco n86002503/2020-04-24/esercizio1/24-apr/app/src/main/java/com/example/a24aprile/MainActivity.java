package com.example.a24aprile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText testo1, testo2;

    private Button secondoEsercizio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        testo1 = findViewById(R.id.editText1);
        testo2 = findViewById(R.id.editText2);

        secondoEsercizio = findViewById(R.id.button2);
        addListener();
    }

    private void addListener() {


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence primoTesto = testo1.getText();
                CharSequence secondoTesto = testo2.getText();

                Intent secondActivity = new Intent(getApplicationContext(), Act2.class);

                if (primoTesto.length() > 0)
                    secondActivity.putExtra("testo1", testo1.getText().toString());
                if (secondoTesto.length() > 0)
                    secondActivity.putExtra("testo2", testo2.getText().toString());

                startActivity(secondActivity);
            }
        });


        secondoEsercizio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence primoTesto = testo1.getText();
                CharSequence secondoTesto = testo2.getText();
                Messaggio messaggio = new Messaggio(primoTesto.toString(), secondoTesto.toString());

                Intent sendObject = new Intent(getApplicationContext(), Act2.class);
                sendObject.putExtra("oggetto", messaggio);
                startActivity(sendObject);
            }
        });
    }
}
