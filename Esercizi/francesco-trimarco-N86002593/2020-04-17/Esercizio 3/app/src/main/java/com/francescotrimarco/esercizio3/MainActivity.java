package com.francescotrimarco.esercizio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private static String LOGTAG = "MainActivity";

    private RadioGroup radioGroup;

    private Button addRadioBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        addRadioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioGroup.addView(new RadioButton(MainActivity.this));
                selectLastRadio();
            }
        });
    }

    private void selectLastRadio() {
        if (radioGroup.getChildCount() > 0) {
            View view = radioGroup.getChildAt(radioGroup.getChildCount() - 1);
            if (view instanceof RadioButton)
                ((RadioButton) view).setChecked(true);
        }
    }

    private void initViews() {
        radioGroup = findViewById(R.id.radioGroup);

        addRadioBtn = findViewById(R.id.addRadioBtn);
    }
}
