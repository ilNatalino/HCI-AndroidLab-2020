package com.gdacciaro.esercizio2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadDetail(Integer i) {
        if (isTablet(this)) {
            SinglePicFragment singlepic = (SinglePicFragment) getSupportFragmentManager().findFragmentById(R.id.singlepic);
            singlepic.changePic(i);
        } else {
            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra("id", i );
            startActivity(intent);
        }
    }

    public static boolean isTablet(Context ctx){
        return (ctx.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) >= Configuration.SCREENLAYOUT_SIZE_LARGE;
    }
}
