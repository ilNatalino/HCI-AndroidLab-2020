package com.example.eserciziorelativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView T1=(TextView) findViewById(R.id.T1);
        TextView T2=(TextView) findViewById(R.id.T2);
        T1.setText("T1");
        T2.setText("T2");
    }

    private boolean checkMove=true;

    public void moveText1(View view){
        TextView T1=(TextView) findViewById(R.id.T1);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) T1.getLayoutParams();
        if(checkMove){
            layoutParams.setMarginStart(300);
            layoutParams.topMargin = (300);
            T1.setLayoutParams(layoutParams);
            checkMove=false;
        }else{
            layoutParams.setMarginStart(0);
            layoutParams.topMargin = (0);
            T1.setLayoutParams(layoutParams);
            checkMove=true;
        }
    }
}
