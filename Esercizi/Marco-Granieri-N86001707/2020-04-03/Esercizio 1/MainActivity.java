package com.example.esercizioiumandroid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private void saveLog(String str) {
        Log.i("Messaggio di log", str); // Mostra nel logcat il messaggio di log.
        TextView textView = (TextView)findViewById(R.id.textView); // Trova la vista tra quelle definite nel file XML.
        if (textView != null) { // Se ho trovato la vista..
            String oldText = textView.getText().toString(); // Ottieni il testo corrente nella vista appena trovata.
            String currentTime = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); // Calcola la data attuale nel formato definito.
            String log = "[" + currentTime + "] " + str; // Crea il log aggiungendoci come prefisso la data.
            textView.setText(oldText != null ? oldText + "\n" + log : log); // Se esiste già del testo, accoda il nuovo log ai vecchi, altrimenti aggiungi semplicemente il log.
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater(); // ottieni la lista dei menu
        inflater.inflate(R.menu.menu, menu); // aggiungi il menu.
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem paramMenuItem) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this); // Costruisci una nuova finestra di dialogo.
        builder.setTitle("EsercizioIUMAndroid"); // Imposta il titolo.
        builder.setMessage("Simone Margio e Marco Granieri"); // Imposta il messaggio.
        builder.show(); // Mostra la finestra di dialogo
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Fase di creazione dell'activity.
        setContentView(R.layout.activity_main); // Imposta la view nell'activity.
    }
    @Override
    protected void onStart() {
        super.onStart(); // Metodo chiamato quando l'activity diventa visibile all'utente.
        saveLog("Applicazione aperta");
    }

    @Override
    protected void onResume() {
        super.onResume(); // Metodo chiamato quando l'activity inizia ad interagire con l'utente.
        saveLog("Applicazione ripresa");
    }

    @Override
    protected void onRestart() {
        super.onRestart(); // Metodo chiamato dopo aver riaperto l'app a seguito di una sospensione.
        saveLog("Applicazione rilanciata");
    }

    @Override
    protected void onPause() {
        super.onPause(); // Metodo chiamato quando l'applicazione passa da uno stato foreground ad uno background.
        saveLog("Applicazione messa in pausa");
    }

    @Override
    protected void onStop() {
        super.onStop(); // Metodo chiamato quando l'activity non è più visibile all'utente (magari quando viene presentata una seconda activity)
        saveLog("Applicazione messa in stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy(); // Metodo chiamato quando si richiede la chiusura dell'applicazione (o applicazione va in chiusura forzata). Qui l'activity viene distrutta.
        saveLog("Applicazione chiusa");
    }
}
