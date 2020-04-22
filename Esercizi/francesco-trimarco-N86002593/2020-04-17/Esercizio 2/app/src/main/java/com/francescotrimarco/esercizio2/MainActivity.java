package com.francescotrimarco.esercizio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static String LOGTAG = "MainActivity";

    private TextView T1;
    private boolean toggle = false;

    private Button moveT1Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        moveT1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggle = !toggle;
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) T1.getLayoutParams();
                int margins = toggle ? 30 : 0;
                layoutParams.setMarginStart(margins);
                layoutParams.topMargin = margins;
                T1.setLayoutParams(layoutParams);
            }
        });
    }

    private void initViews() {
        T1 = findViewById(R.id.T1);

        moveT1Btn = findViewById(R.id.moveT1Btn);
    }
}
