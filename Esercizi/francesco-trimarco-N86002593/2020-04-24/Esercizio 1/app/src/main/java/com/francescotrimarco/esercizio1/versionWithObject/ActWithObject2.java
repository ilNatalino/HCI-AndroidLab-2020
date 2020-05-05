package com.francescotrimarco.esercizio1.versionWithObject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.francescotrimarco.esercizio1.R;

import java.io.Serializable;

public class ActWithObject2 extends AppCompatActivity {

    private TextView firstValueTextView, secondValueTextView;
    private Button finishActivityBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);

        initViews();

        setTitle("Object version");

        Intent lastIntent = getIntent();

        if (lastIntent.hasExtra("informationWrapper")) {
            Serializable serializableInformationWrapper = lastIntent.getSerializableExtra("informationWrapper");

            if (serializableInformationWrapper instanceof InformationWrapper) {
                InformationWrapper informationWrapper = (InformationWrapper) serializableInformationWrapper;

                firstValueTextView.setText(String.format(getString(R.string.firstValuePassedIs), informationWrapper.getFirstValueToPass()));
                secondValueTextView.setText(String.format(getString(R.string.secondValuePassedIs), informationWrapper.getSecondValueToPass()));
            }
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
