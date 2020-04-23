package com.example.esercizio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ESERCIZIO4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioGroup radioGroup = findViewById(R.id.radioGroup);
                int numChildren = radioGroup.getChildCount();

                RadioButton radioButton = new RadioButton(radioGroup.getContext());

                radioButton.setText("RadioButton" + numChildren);

                if(numChildren > 0){
                    RadioButton lastChild = (RadioButton) radioGroup.getChildAt(numChildren - 1);
                    lastChild.setChecked(false);
                }

                // Toggle the last radio button
                radioButton.setChecked(true);
                radioGroup.addView(radioButton);
            }
        });
    }
}
