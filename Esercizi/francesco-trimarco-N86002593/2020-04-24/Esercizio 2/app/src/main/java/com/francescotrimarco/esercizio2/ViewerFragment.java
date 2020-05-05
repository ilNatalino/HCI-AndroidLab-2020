package com.francescotrimarco.esercizio2;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class ViewerFragment extends Fragment {

    private int mResource, mShownIndex = -1;

    public ViewerFragment() {}

    ViewerFragment(int resource, int index) {
        this.mResource = resource;
        this.mShownIndex = index;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewer_fragment_layout, container, false);

        ImageView imageView = view.findViewById(R.id.viewerImageView);
        if (getContext() != null && mShownIndex > -1)
            imageView.setImageDrawable(getContext().getDrawable(mResource));

        return view;
    }

    int getShownIndex() {
        return mShownIndex;
    }
}
