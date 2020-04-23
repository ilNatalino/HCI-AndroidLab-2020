package com.gdacciaro.exercise2;

import android.widget.RelativeLayout;
import android.widget.TextView;

class Exercise2Controller {

    private Exercise2Controller(){}
    private static Exercise2Controller instance;

    static Exercise2Controller getInstance() {
        if(instance == null)
            instance = new Exercise2Controller();
        return instance;
    }

    void changeMargin(TextView textView1) {
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams)textView1.getLayoutParams();
        params.setMargins(42, 42, 0, 0);
        textView1.setLayoutParams(params);
    }
}
