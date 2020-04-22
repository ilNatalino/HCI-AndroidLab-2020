package com.example.esercizio2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = findViewById(R.id.T1);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View view) {
                RelativeLayout.LayoutParams layoutParameters = (RelativeLayout.LayoutParams)textView.getLayoutParams();
                layoutParameters.topMargin = layoutParameters.topMargin == 0 ? 20 : 0;
                layoutParameters.setMarginStart(layoutParameters.topMargin);
                textView.setLayoutParams(layoutParameters);
            }
        });
    }
}