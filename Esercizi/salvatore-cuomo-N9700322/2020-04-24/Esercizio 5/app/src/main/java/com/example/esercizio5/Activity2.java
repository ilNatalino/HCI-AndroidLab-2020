package com.example.esercizio5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    public static final String FirstString = "FIRST_STRING";
    public static final String SecondString = "SECOND_STRING";

    public static final String TestObj = "TEST_OBJECT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // Back button listener
        Button back = findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();

        // Classic intent with 2 putExtra
        if(intent.hasExtra(FirstString)){
            String first = intent.getStringExtra(FirstString);
            String second = intent.getStringExtra(SecondString);

            TextView textView1 = findViewById(R.id.resultTextView1);
            TextView textView2 = findViewById(R.id.resultTextView2);

            textView1.setText(first);
            textView2.setText(second);
        }

        // Classic intent with 1 Object
        if(intent.hasExtra(TestObj)){
            TestObject testObject = (TestObject) intent.getSerializableExtra(TestObj);

            TextView textView1 = findViewById(R.id.resultTextView1);
            TextView textView2 = findViewById(R.id.resultTextView2);
            TextView infoTextView = findViewById(R.id.infoTextView);

            textView1.setText(testObject.getEditText1());
            textView2.setText(testObject.getEditText2());

            infoTextView.setVisibility(View.VISIBLE);
        }

    }
}
