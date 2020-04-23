package com.example.esercizio1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private final static String LOG ="APPANDROID";
    public boolean checkVisibility(int currentTextView, int nextTextView) {
        TextView text = findViewById(currentTextView);
        if (text.isShown()) {
            text.setVisibility(TextView.INVISIBLE);
            findViewById(nextTextView).setVisibility(TextView.VISIBLE);
            return true;
        }
        return false;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Esercizio1 - MARCO GRANIERI");
        Button botton = findViewById(R.id.button);
        botton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(LOG, "Rilevata pressione sul bottone");
                int[] textViews = new int[] {R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4, R.id.textView5};
                int length = textViews.length;
                for (int i = 0; i < length; i++) {
                    if (checkVisibility(textViews[i], textViews[(i+1) % length]))
                        break;
                }
            }
        });
    }
}
