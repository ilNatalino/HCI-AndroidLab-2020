package com.example.esercizio5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Two putExtra
        Button sendButton1 = (Button) findViewById(R.id.sendButton1);
        sendButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Activity2.class);

                TextView first = findViewById(R.id.editText1);
                TextView second = findViewById(R.id.editText2);

                intent.putExtra(Activity2.FirstString, first.getText().toString());
                intent.putExtra(Activity2.SecondString, second.getText().toString());

                startActivity(intent);
            }
        });

        // One putExtra with an object
        Button sendButton2 = (Button) findViewById(R.id.sendButton2);
        sendButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Activity2.class);

                TextView first = findViewById(R.id.editText1);
                TextView second = findViewById(R.id.editText2);

                TestObject testObject = new TestObject(first.getText().toString(), second.getText().toString());
                intent.putExtra(Activity2.TestObj, testObject);

                startActivity(intent);
            }
        });
    }
}
