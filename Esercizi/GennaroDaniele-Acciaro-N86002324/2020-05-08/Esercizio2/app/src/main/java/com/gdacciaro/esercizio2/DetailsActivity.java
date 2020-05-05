package com.gdacciaro.esercizio2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        int id = getIntent().getIntExtra("id",0);
        if(id!=0){
            SinglePicFragment fragment = SinglePicFragment.newInstance(id);
            loadFragment(fragment);
        }
    }

    private void loadFragment(final Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frag_home, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
