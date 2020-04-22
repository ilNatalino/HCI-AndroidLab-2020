package com.example.eserciziolinearlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeVisibility(View v){
        TextView text1=(TextView) findViewById(R.id.textView1);
        TextView text2=(TextView) findViewById(R.id.textView2);
        TextView text3=(TextView) findViewById(R.id.textView3);
        TextView text4=(TextView) findViewById(R.id.textView4);
        TextView text5=(TextView) findViewById(R.id.textView5);

        if(text1.isShown()){
            text1.setVisibility(TextView.INVISIBLE);
            text2.setVisibility(TextView.VISIBLE);
        } else{
            if(text2.isShown()){
                text2.setVisibility(TextView.INVISIBLE);
                text3.setVisibility(TextView.VISIBLE);
            }else{
                if(text3.isShown()){
                    text3.setVisibility(TextView.INVISIBLE);
                    text4.setVisibility(TextView.VISIBLE);
                }else{
                    if(text4.isShown()){
                        text4.setVisibility(TextView.INVISIBLE);
                        text5.setVisibility(TextView.VISIBLE);
                    }else{
                        if(text5.isShown()){
                            text5.setVisibility(TextView.INVISIBLE);
                            text1.setVisibility(TextView.VISIBLE);
                        }
                    }
                }
            }
        }
    };
}
