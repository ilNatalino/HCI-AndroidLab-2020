package com.example.eserciziointent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Act2 extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);

        TextView textUser=(TextView) findViewById(R.id.textView3);
        TextView textPass=(TextView) findViewById(R.id.textView4);

        Intent intent=getIntent();
        if(intent.hasExtra("User")) textUser.setText("Username: " + intent.getStringExtra("User"));
        if(intent.hasExtra("Pass")) textPass.setText("Password: " + intent.getStringExtra("Pass"));
        if(intent.hasExtra("Obj")){
            Obj object=(Obj) intent.getSerializableExtra("Obj");
            assert object != null;
            TextView textUserObj=(TextView) findViewById(R.id.textView);
            TextView textPassObj=(TextView) findViewById(R.id.textView2);
            textUserObj.setText("Username obj: " + object.getUser());
            textPassObj.setText("Password obj: " + object.getPass());
        }
    }
}
