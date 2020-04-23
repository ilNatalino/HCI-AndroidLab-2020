package com.gdacciaro.exercise3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private Exercise3Controller controller = Exercise3Controller.getInstance();

    private Button button;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.addRadioButton(MainActivity.this,radioGroup);
            }
        });
    }

    private void initViews() {
        button      = findViewById(R.id.button);
        radioGroup  = findViewById(R.id.radioGroup);
    }
}
