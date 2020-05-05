package com.francescotrimarco.esercizio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.francescotrimarco.esercizio1.firstVersion.Act1;
import com.francescotrimarco.esercizio1.versionWithObject.ActWithObject1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button firstVersionActivityBtn = findViewById(R.id.firstVersionActivity);
        Button secondVersionActivityBtn = findViewById(R.id.secondVersionActivity);

        firstVersionActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Act1.class));
            }
        });

        secondVersionActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ActWithObject1.class));
            }
        });
    }
}
