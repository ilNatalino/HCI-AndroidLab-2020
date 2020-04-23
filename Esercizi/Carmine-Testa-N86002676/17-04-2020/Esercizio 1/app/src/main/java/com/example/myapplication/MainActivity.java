package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView T1 = (TextView)findViewById(R.id.textView1);
        final TextView T2 = (TextView)findViewById(R.id.textView2);
        final TextView T3 = (TextView)findViewById(R.id.textView3);
        final TextView T4 = (TextView)findViewById(R.id.textView4);
        final TextView T5 = (TextView)findViewById(R.id.textView5);

        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                float x = T1.getX();//Salvo i valori di x e y altrimenti li perdo dopo il primo swap
                float y = T1.getY();

                swap(T1,T2.getX(),T2.getY());
                swap(T2,T3.getX(),T3.getY());
                swap(T3,T4.getX(),T4.getY());
                swap(T4,T5.getX(),T5.getY());
                swap(T5,x,y);

            }
        });


    }

    public void swap(TextView T , float x , float y){
        T.setY(y);
        T.setX(x);
    }




}
