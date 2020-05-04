package com.example.esercizio6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageViewFragment extends Fragment {

    private static final String IMAGE_RESOURCE_ID = "ImageResourceId";

    private int imageResourceId = R.drawable.any;

    public ImageViewFragment() {
        // Required empty public constructor
    }

    public ImageViewFragment(int imageResourceId) {
        super();

        this.imageResourceId = imageResourceId;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            imageResourceId = savedInstanceState.getInt(IMAGE_RESOURCE_ID);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_image_view, container, false);
        ImageView imageView = view.findViewById(R.id.imageViewContainer);
        imageView.setImageResource(imageResourceId);

        return view;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt(IMAGE_RESOURCE_ID, imageResourceId);
    }

}
