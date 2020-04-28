package com.example.esercizio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Prima finestra");
        setContentView(R.layout.activity_main);

    }

    public void goNext(View v){
        EditText username = findViewById(R.id.editTextUsername);
        EditText password = findViewById(R.id.editTextPassword);;
        Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
        intent.putExtra("username",username.getText().toString());
        intent.putExtra("password",password.getText().toString());
        startActivity(intent);

    }
}
