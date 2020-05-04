package com.example.esercizio6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    public static final String IMAGE_RESOURCE_ID = "ImageResourceId";
    private static final String IMAGE_VIEW_FRAGMENT = "ImageViewFragment";

    ImageViewFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        if (intent != null) {
            // I'm from MainActivity
            int imageResourceId = intent.getIntExtra(IMAGE_RESOURCE_ID, R.drawable.any);
            fragment = new ImageViewFragment(imageResourceId);
            commitFragment();

        } else if (savedInstanceState != null) {
            // The orientation of the view changed
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragment = (ImageViewFragment) fragmentManager.getFragment(savedInstanceState, IMAGE_VIEW_FRAGMENT);
            commitFragment();

        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        getSupportFragmentManager().putFragment(outState, IMAGE_VIEW_FRAGMENT, fragment);
    }


    private void commitFragment() {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.fragmentContainer2, fragment);
        fragmentTransaction.commit();
    }
}
