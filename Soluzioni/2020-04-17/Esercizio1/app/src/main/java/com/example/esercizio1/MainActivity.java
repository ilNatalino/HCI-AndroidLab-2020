package com.example.esercizio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private LinearLayout ll= null; //variabile che conterrà il layout
    private int currentTextView = 0;
    private int counter = 0;
    private int textViewCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recupero del layout
        ll = (LinearLayout) findViewById(R.id.main_linear_layout);
        textViewCount = ll.getChildCount() -1;
        //recupero il bottone
        Button shiftButton = (Button) findViewById(R.id.shift_button);

        //imposto l'azione da compiere sul clic
        shiftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView cur = (TextView) ll.getChildAt(currentTextView); // prendo la textview corrente
                CharSequence text = cur.getText(); //salvo il testo
                cur.setText(""); // svuoto la text view
                currentTextView = (5 - (counter % textViewCount) - 1)  ; // calcolo la textview corrente
                Log.d(TAG, "corrente " + currentTextView);
                cur = (TextView) ll.getChildAt(currentTextView); // recupero la nuova textview
                cur.setText(text);
                counter ++;
            }
        });

    }
}
