package com.gdacciaro.esercizio1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Act2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = findViewById(R.id.textView);

        String msg = getIntent().getStringExtra("msg");
        if(msg!=null && !msg.isEmpty())
            textView.setText(msg);

        Employee employee = (Employee) getIntent().getSerializableExtra("employee");
        if(employee!=null)
            textView.append(employee.toString());

    }
}
