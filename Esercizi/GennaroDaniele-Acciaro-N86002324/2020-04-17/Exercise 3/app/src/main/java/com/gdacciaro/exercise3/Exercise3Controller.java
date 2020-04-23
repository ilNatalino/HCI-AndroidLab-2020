package com.gdacciaro.exercise3;

import android.content.Context;
import android.widget.RadioButton;
import android.widget.RadioGroup;

class Exercise3Controller {

    private Exercise3Controller(){}
    private static Exercise3Controller instance;

    static Exercise3Controller getInstance() {
        if(instance == null)
            instance = new Exercise3Controller();
        return instance;
    }


    void addRadioButton(Context context, RadioGroup radioGroup) {
        RadioButton radioButton = new RadioButton(context);
        radioButton.setText(context.getString(R.string.very_bad_joke));
        radioButton.setChecked(true);
        radioGroup.addView(radioButton);

        deselectOtherButton(radioGroup);
    }

    private void deselectOtherButton(RadioGroup radioGroup) {
        int size = radioGroup.getChildCount();
        for(int index = 0;index<size-1;index++){
            RadioButton radioButton = (RadioButton) radioGroup.getChildAt(index);
            radioButton.setChecked(false);
        }
    }
}
