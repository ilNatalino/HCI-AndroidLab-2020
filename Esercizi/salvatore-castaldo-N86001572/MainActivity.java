package com.example.testapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private static final String tag = "Android App: ";
    private int[] ids = new int[5];
    private int n = 0;
    private TextView temp;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "On Create.");
        ids[0] = R.id.textView5;
        ids[1] = R.id.textView4;
        ids[2] = R.id.textView3;
        ids[3] = R.id.textView2;
        ids[4] = R.id.textView1;
        n = 0;
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                flipText();
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

    protected void flipText(){
        temp = (TextView)findViewById(ids[n]);
        temp.setText("");
        n = ((n+1) % ids.length);
        temp = (TextView)findViewById(ids[n]);
        temp.setText(R.string.flipping_text);
    }
}
