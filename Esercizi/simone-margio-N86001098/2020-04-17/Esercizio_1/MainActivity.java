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
        TextView text2=(TextView) findViewById(R.id.textView2);
        TextView text3=(TextView) findViewById(R.id.textView3);
        TextView text4=(TextView) findViewById(R.id.textView4);
        TextView text5=(TextView) findViewById(R.id.textView5);
        setEmptyOrText(text2,"");
        setEmptyOrText(text3,"");
        setEmptyOrText(text4,"");
        setEmptyOrText(text5,"");
    }

    private void setEmptyOrText(TextView text, String s){
        if(s.equals("")){
            text.setText("");
        }else text.setText(s);
    }

    private boolean checkEmpty(TextView text){
        String s= (String) text.getText();
        return !s.equals("");
    }

    private String getText(TextView text){
        return  (String) text.getText();
    }

    public void changeVisibility(View v){
        TextView text1=(TextView) findViewById(R.id.textView1);
        TextView text2=(TextView) findViewById(R.id.textView2);
        TextView text3=(TextView) findViewById(R.id.textView3);
        TextView text4=(TextView) findViewById(R.id.textView4);
        TextView text5=(TextView) findViewById(R.id.textView5);

        if(checkEmpty(text1)){
            setEmptyOrText(text2,getText(text1));
            setEmptyOrText(text1,"");
        }else{
            if(checkEmpty(text2)){
                setEmptyOrText(text3,getText(text2));
                setEmptyOrText(text2,"");
            }else{
                if(checkEmpty(text3)){
                    setEmptyOrText(text4,getText(text3));
                    setEmptyOrText(text3,"");
                }else{
                    if(checkEmpty(text4)){
                        setEmptyOrText(text5,getText(text4));
                        setEmptyOrText(text4,"");
                    }else{
                        if(checkEmpty(text5)){
                            setEmptyOrText(text1,getText(text5));
                            setEmptyOrText(text5,"");
                        }
                    }
                }
            }
        }



    };
}
