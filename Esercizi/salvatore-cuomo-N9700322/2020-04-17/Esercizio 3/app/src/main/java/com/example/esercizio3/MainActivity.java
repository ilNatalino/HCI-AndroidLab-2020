package com.example.esercizio3;

import android.app.Activity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;

import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private static final String TAG = "Esercizio3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickMove(View view) {
        TextView textView = findViewById(R.id.T1);
        RelativeLayout rl = findViewById(R.id.mainLayout);

        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();

        int marginStart = layoutParams.getMarginStart();

        Log.d(TAG, Integer.toString(marginStart));

        /*
         *  100 è il valore che aggiungo a marginStart per spostare la textView.
         *  150 è il valore dello spazio alla destra di T1, più la dimensione delle textView di T1 e T2
         */
        marginStart = (marginStart + 100)  % (rl.getWidth() - 150);

        Log.d(TAG, Integer.toString(marginStart));

        layoutParams.setMarginStart(marginStart);

        textView.setLayoutParams(layoutParams);

    }
}
