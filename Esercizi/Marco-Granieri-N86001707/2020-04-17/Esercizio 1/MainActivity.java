package com.example.esercizio1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private final static String LOG ="APPANDROID";
    public boolean checkTextView(int currentTextView, int previousTextView) {
        TextView textView = findViewById(currentTextView);
        if (!textView.getText().toString().equals("")) {
            String str = textView.getText().toString();
            textView.setText("");
            textView = findViewById(previousTextView);
            textView.setText(str);
            return true;
        }
        return false;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Esercizio1 - MARCO GRANIERI");
        Button button = findViewById(R.id.button);
        final int[] textViews = new int[] {R.id.textView5, R.id.textView4, R.id.textView3, R.id.textView2, R.id.textView1};
        final int length = textViews.length;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(LOG, "Rilevata pressione sul bottone");
                for (int i = 0; i < length ; i++) {
                    if (checkTextView(textViews[i], textViews[(i+1) % length]))
                        break;
                }
            }
        });
    }
}
