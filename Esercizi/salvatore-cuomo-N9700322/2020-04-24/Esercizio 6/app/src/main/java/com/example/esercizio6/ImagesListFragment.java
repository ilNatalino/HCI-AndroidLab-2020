package com.example.esercizio6;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;


public class ImagesListFragment extends Fragment {

    public ImagesListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_images_list, container, false);
        setImageView(view);

        return view;
    }

    private void setImageView(View view) {

        GridLayout grid = view.findViewById(R.id.imageGrid);

        int imageViewCount = grid.getChildCount();

        for (int i = 0; i < imageViewCount; i++) {
            ImageView imageView = (ImageView) grid.getChildAt(i);

            final Images images = Images.images[i % Images.images.length];
            imageView.setImageResource(images.getResourceId());

            // For each imageView inside the grid, i set an onClickListener
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // The listener will call back the implementation of onClick inside MainActivity
                    // with the resourceId of the correct image
                    listener.onClick(images.getResourceId());
                }
            });
        }
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        listener = (Listener) context;
    }

    // This is the listener that will be implemented by MainActivity
    private Listener listener;

    interface Listener {
        void onClick(int id);
    }

}
