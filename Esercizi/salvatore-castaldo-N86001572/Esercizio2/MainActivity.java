package com.example.testapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {

    private static final String tag = "Android App: ";
    private TextView temp;
    private Button button;
    private RelativeLayout rl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "On Create.");
        rl = findViewById(R.id.relative_layout);
        hor = rl.getWidth();
        vert = rl.getHeight();
        temp = findViewById(R.id.textView1);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams)temp.getLayoutParams();
                lp.setMarginStart(new Random().nextInt(500));
                lp.topMargin = new Random().nextInt(1500);
                temp.setLayoutParams(lp);
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(tag, "On Start.");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(tag, "On Pause");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(tag, "On Resume");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(tag, "On Stop");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(tag, "On Restart");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(tag, "On Destroy");
    }

}
