package com.example.esercizio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity";

    private TextView t1;
    private TextView t2;
    private Random rand = new Random(); //per creare un numero random

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recupero le due textview
        t1 = findViewById(R.id.T1);
        t2 = findViewById(R.id.T2);


        //imposto l'evento sul clic
        findViewById(R.id.main_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RelativeLayout.LayoutParams param = (RelativeLayout.LayoutParams) t1.getLayoutParams();
                param.topMargin = rand.nextInt(500);
                t1.setLayoutParams(param);

            }
        });
    }
}
