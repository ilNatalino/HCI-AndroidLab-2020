package com.gdacciaro.esercizio1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Act1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Act1.this, Act2.class);
                String msg = ((EditText)findViewById(R.id.editText)).getText().toString();
                intent.putExtra("msg", msg);
                startActivity(intent);
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Act1.this, Act2.class);
                Employee employee = new Employee("Matteo", 12345);
                intent.putExtra("employee", employee);
                startActivity(intent);
            }
        });
    }
}
