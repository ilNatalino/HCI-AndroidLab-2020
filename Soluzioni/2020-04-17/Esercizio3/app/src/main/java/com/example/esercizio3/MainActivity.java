package com.example.esercizio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActiviy";
    private RadioGroup rg;
    private int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = findViewById(R.id.main_radio_group);

        findViewById(R.id.button_add_radio).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton rb = new RadioButton(rg.getContext());
                rb.setText("radio " + count);
                count++;
                rg.clearCheck();
                rg.addView(rb);
                rb.setChecked(true);
            }
        });
    }
}
