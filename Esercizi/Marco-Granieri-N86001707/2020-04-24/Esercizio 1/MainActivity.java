package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import java.util.Date;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        getSupportActionBar().setTitle("MainActivity");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity = new Intent(getApplicationContext(), Main2Activity.class); // Crea l'intent per la seconda activity.
                EditText textInput1 = findViewById(R.id.textInput1); // Ottieni il primo campo di testo.
                EditText textInput2 = findViewById(R.id.textInput2); // Ottieni il secondo campo di testo.
                activity.putExtra("textInput1", textInput1.getText().toString()); // Passa alla seconda activity il contenuto del primo campo di testo.
                activity.putExtra("textInput2", textInput2.getText().toString()); // Passa alla seconda activity il contenuto del secondo campo di testo.
                Date date = new Date(); // Crea un oggetto da passare alla seconda activity (come richiesto dall'esercizio). Ho scelto l'oggetto di tipo Date.
                activity.putExtra("date", date); // Passa l'oggetto date alla seconda activity.
                startActivity(activity); // Avvia l'activity.
            }
        });
    }
}
