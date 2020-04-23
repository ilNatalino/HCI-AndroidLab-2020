package com.example.esercizio2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView tx1, tx2, tx3, tx4, tx5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String temp = tx1.getText().toString();

                tx1.setText(tx2.getText().toString());
                tx2.setText(tx3.getText().toString());
                tx3.setText(tx4.getText().toString());
                tx4.setText(tx5.getText().toString());
                tx5.setText(temp);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        tx1 = findViewById(R.id.textView1);
        tx2 = findViewById(R.id.textView2);
        tx3 = findViewById(R.id.textView3);
        tx4 = findViewById(R.id.textView4);
        tx5 = findViewById(R.id.textView5);
    }
}
