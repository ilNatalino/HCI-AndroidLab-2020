package com.gdacciaro.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Exercise2Controller controller = Exercise2Controller.getInstance();

    private TextView textView1;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.changeMargin(textView1);
            }
        });
    }

    private void initViews() {
        textView1 = findViewById(R.id.T1);
        button    = findViewById(R.id.button);
    }
}