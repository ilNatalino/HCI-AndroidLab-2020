package com.francescotrimarco.esercizio1.firstVersion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.francescotrimarco.esercizio1.R;

public class Act1 extends AppCompatActivity {

    private EditText editText1, editText2;
    private Button nextActivityBtn, closeActivityBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act1);

        setTitle("First version");

        initViews();

        nextActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.getText().toString().isEmpty() || editText2.getText().toString().isEmpty()) {
                    if (editText1.getText().toString().isEmpty())
                        editText1.setError("This field cannot be empty");

                    if (editText2.getText().toString().isEmpty())
                        editText2.setError("This field cannot be empty");
                } else {
                    String firstValueToPass = editText1.getText().toString();
                    String secondValueToPass = editText2.getText().toString();

                    Intent intent = new Intent(getApplicationContext(), Act2.class);

                    intent.putExtra("firstValueToPass", firstValueToPass);
                    intent.putExtra("secondValueToPass", secondValueToPass);

                    startActivity(intent);
                }
            }
        });

        closeActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initViews() {
        editText1 = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);

        nextActivityBtn = findViewById(R.id.nextActivityBtn);
        closeActivityBtn = findViewById(R.id.closeActivityBtn);
    }
}
