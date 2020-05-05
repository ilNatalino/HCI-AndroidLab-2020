package com.francescotrimarco.esercizio2;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

public class FragmentLayout extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // root view inflated
        setContentView(R.layout.fragment_layout);
    }
}
