package com.example.esercizio3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import androidx.appcompat.app.AlertDialog;

public class MainActivity extends AppCompatActivity {
    public static final String LOG = "APPANDROID";
    public static int count = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Esercizio3 - MARCO GRANIERI");
        final Button button = findViewById(R.id.button);
        final RadioGroup radioGroup = findViewById(R.id.radiogroup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(LOG, "Rilevata pressione sul bottone");
                if (count < 15) {
                    RadioButton newButton = new RadioButton(getApplicationContext());
                    String title = "Button " + String.valueOf(count);
                    newButton.setText(title);
                    radioGroup.addView(newButton);
                    newButton.setChecked(true);
                    count++;
                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(button.getContext());
                    builder.setTitle("Impossibile eseguire l'azione");
                    builder.setMessage("Ci sono troppi RadioButton!");
                    builder.show();
                }
            }
        });
    }
}
