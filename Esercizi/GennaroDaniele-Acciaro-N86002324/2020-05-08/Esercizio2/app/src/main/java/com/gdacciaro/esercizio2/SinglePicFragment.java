package com.gdacciaro.esercizio2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class SinglePicFragment extends Fragment {
    private static final String ARG_PARAM1 = "id";
    private ImageView imageView;
    public SinglePicFragment() {}

    public static SinglePicFragment newInstance(Integer param1) {
        SinglePicFragment fragment = new SinglePicFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imageView = view.findViewById(R.id.imageView2);

        if (getArguments() != null) {
            int mParam1 = getArguments().getInt(ARG_PARAM1);
            changePic(mParam1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_single_pic, container, false);
    }

    public void changePic(Integer i) {
        if(imageView!=null)
            imageView.setImageResource(i);
    }
}
