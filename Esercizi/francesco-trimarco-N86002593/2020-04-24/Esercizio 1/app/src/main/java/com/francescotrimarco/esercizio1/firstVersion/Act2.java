package com.francescotrimarco.esercizio1.firstVersion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.francescotrimarco.esercizio1.R;

public class Act2 extends AppCompatActivity {

    private TextView firstValueTextView, secondValueTextView;
    private Button finishActivityBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);

        setTitle("First version");

        initViews();

        Intent lastIntent = getIntent();

        if (lastIntent.hasExtra("firstValueToPass") && lastIntent.hasExtra("secondValueToPass")) {
            String firstValuePassed = lastIntent.getStringExtra("firstValueToPass");
            String secondValuePassed = lastIntent.getStringExtra("secondValueToPass");

            firstValueTextView.setText(String.format(getString(R.string.firstValuePassedIs), firstValuePassed));
            secondValueTextView.setText(String.format(getString(R.string.secondValuePassedIs), secondValuePassed));
        }

        finishActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initViews() {
        firstValueTextView = findViewById(R.id.firstValueTextView);
        secondValueTextView = findViewById(R.id.secondValueTextView);

        finishActivityBtn = findViewById(R.id.finishActivityBtn);
    }
}
