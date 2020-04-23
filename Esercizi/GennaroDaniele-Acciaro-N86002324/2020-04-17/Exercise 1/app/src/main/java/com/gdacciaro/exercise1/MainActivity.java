package com.gdacciaro.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Exercise1Controller controller;

    private TextView textView1,textView2,textView3,textView4,textView5;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        final TextView[] theArray = new TextView[]{textView1,textView2,textView3,textView4,textView5};
        controller =  Exercise1Controller.getInstance(theArray.length);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.rotateText(theArray);
            }
        });
    }

    private void initViews() {
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        button    = findViewById(R.id.button);
    }
}
