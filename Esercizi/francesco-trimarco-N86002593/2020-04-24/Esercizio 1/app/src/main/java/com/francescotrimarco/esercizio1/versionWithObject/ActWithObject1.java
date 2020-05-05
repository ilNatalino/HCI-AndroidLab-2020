package com.francescotrimarco.esercizio1.versionWithObject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.francescotrimarco.esercizio1.R;

public class ActWithObject1 extends AppCompatActivity {

    private EditText editText1, editText2;
    private Button nextActivityBtn, closeActivityBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act1);

        setTitle("Object version");

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
                    InformationWrapper informationWrapper = new InformationWrapper(editText1.getText().toString(), editText2.getText().toString());

                    Intent intent = new Intent(getApplicationContext(), ActWithObject2.class);

                    intent.putExtra("informationWrapper", informationWrapper);

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
