package com.francescotrimarco.esercizio2;

import android.content.ActivityNotFoundException;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.ListFragment;

public class ImagesFragment extends ListFragment {
    private static final String BACK_STACK_ROOT_TAG = "root_fragment";
    private boolean mDualPane;
    private int mCurrentPosition = 0;

    private final int[] images = {
            R.mipmap.ic_1,
            R.mipmap.ic_2,
            R.mipmap.ic_3
    };

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (getActivity() == null)
            throw new ActivityNotFoundException("Activity not found");

        setListAdapter(new ImageListAdapter(getActivity(), images));

        View detailsFrame = getActivity().findViewById(R.id.viewerFragment);

        mDualPane = detailsFrame != null
                && detailsFrame.getVisibility() == View.VISIBLE;

        if (savedInstanceState != null) {
            mCurrentPosition = savedInstanceState.getInt("currentPosition", 0);
        }

        if (mDualPane) {
            getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
            showDetails(mCurrentPosition);
        } else {
            getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
            getListView().setItemChecked(mCurrentPosition, true);
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("currentPosition", mCurrentPosition);
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        showDetails(position);
    }

    private void showDetails(int index) {
        mCurrentPosition = index;

        if (mDualPane) {
            getListView().setItemChecked(index, true);

            if (getFragmentManager() != null) {
                ViewerFragment viewerFragment = (ViewerFragment) getFragmentManager().findFragmentById(R.id.viewerFragment);
                if (viewerFragment == null || viewerFragment.getShownIndex() != index) {
                    viewerFragment = new ViewerFragment(images[index], index);

                    getFragmentManager().beginTransaction()
                        .replace(R.id.viewerFragment, viewerFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .commit();
                }
            }

        } else {
            if (getFragmentManager() != null) {
                getFragmentManager().popBackStack(BACK_STACK_ROOT_TAG, FragmentManager.POP_BACK_STACK_INCLUSIVE);

                ViewerFragment viewerFragment = new ViewerFragment(images[index], index);

                getFragmentManager().beginTransaction()
                        .replace(R.id.listFragment, viewerFragment)
                        .addToBackStack(BACK_STACK_ROOT_TAG)
                        .commit();
            }
        }
    }
}
