package com.francescotrimarco.esercizio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private static String LOGTAG = "MainActivity";

    private String[] texts = {"", "", "", "", "Hello world"};

    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;

    private Button shiftBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        updateTextViews();

        shiftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shiftArray();
                updateTextViews();
            }
        });
    }

    private void updateTextViews() {
        textView1.setText(texts[0]);
        textView2.setText(texts[1]);
        textView3.setText(texts[2]);
        textView4.setText(texts[3]);
        textView5.setText(texts[4]);
    }

    private void initViews() {
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);

        shiftBtn = findViewById(R.id.shiftBtn);
    }

    private void shiftArray() {
        String first = texts[0];
        for (int i = 1; i < texts.length; i++) {
            texts[i-1] = texts[i];
        }
        texts[texts.length-1] = first;

        Log.d(LOGTAG, Arrays.toString(texts));
    }
}
