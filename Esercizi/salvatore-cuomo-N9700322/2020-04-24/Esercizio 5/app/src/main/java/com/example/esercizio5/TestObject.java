package com.example.esercizio5;

import java.io.Serializable;

class TestObject implements Serializable {

    private String editText1, editText2;

    TestObject(String editText1, String editText2) {
        this.editText1 = editText1;
        this.editText2 = editText2;
    }

    String getEditText2() {
        return editText2;
    }

    String getEditText1() {
        return editText1;
    }
}
