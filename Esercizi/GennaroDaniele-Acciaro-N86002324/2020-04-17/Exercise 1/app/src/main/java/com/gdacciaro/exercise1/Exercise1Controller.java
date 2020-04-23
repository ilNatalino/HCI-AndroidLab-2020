package com.gdacciaro.exercise1;

import android.widget.TextView;

class Exercise1Controller {

    private int currentTextView;

    private Exercise1Controller(int currentTextView) {
        this.currentTextView = currentTextView;
    }
    private static Exercise1Controller instance;

    static Exercise1Controller getInstance(int size) {
        if(instance == null)
            instance = new Exercise1Controller(size-1);
        return instance;
    }

    void rotateText(TextView[] theArray) {
        int newIndex = Math.floorMod((currentTextView-1), theArray.length);
        TextView newTextView = theArray[newIndex];
        TextView oldTextView = theArray[currentTextView];
        swapTexts(newTextView,oldTextView);
        clearTextView(oldTextView);
        currentTextView = newIndex;
    }

    private void swapTexts(TextView newTextView, TextView oldTextView){
        if(newTextView==null || oldTextView==null)
            throw new IllegalArgumentException();
        newTextView.setText(oldTextView.getText());
    }

    private void clearTextView(TextView theTextView){
        if(theTextView==null)
            throw new IllegalArgumentException();
        theTextView.setText("");
    }
}
