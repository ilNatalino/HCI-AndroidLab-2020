package com.example.eserciziointent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Act1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act1);
    }

    public void sendInfo(View v){
        Obj object=new Obj("SimoneMargio","whatsappSucks");
        EditText User=(EditText) findViewById(R.id.editText1);
        EditText Pass=(EditText) findViewById(R.id.editText2);
        Intent Act2=new Intent(this,Act2.class);
        Act2.putExtra("User",User.getText().toString());
        Act2.putExtra("Pass",Pass.getText().toString());
        Act2.putExtra("Obj",object);
        startActivity(Act2);
    }
}
