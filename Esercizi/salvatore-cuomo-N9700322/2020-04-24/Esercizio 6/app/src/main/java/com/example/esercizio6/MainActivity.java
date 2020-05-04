package com.example.esercizio6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements ImagesListFragment.Listener {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(int imageResourceId) {

        if(findViewById(R.id.imageViewContainer) != null){
            // Tablet view
            commitFragment(imageResourceId);
        }else{
            // Phone view, go to SecondActivity
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra(SecondActivity.IMAGE_RESOURCE_ID, imageResourceId);

            startActivity(intent);
        }
    }

    private void commitFragment(int imageResourceId){

        ImageViewFragment fragment = new ImageViewFragment(imageResourceId);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.imageViewContainer, fragment);
        fragmentTransaction.commit();
    }
}
