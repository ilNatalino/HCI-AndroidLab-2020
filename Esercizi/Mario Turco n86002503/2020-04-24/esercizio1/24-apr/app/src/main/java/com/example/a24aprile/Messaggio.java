package com.example.a24aprile;

import java.io.Serializable;

public class Messaggio implements Serializable {
    private String parametro1, parametro2;

    public Messaggio(String parametro1, String parametro2) {
        this.parametro1 = parametro1;
        this.parametro2 = parametro2;
    }

    public String getParametro1() {
        return parametro1;
    }

    public String getParametro2() {
        return parametro2;
    }

    public void setParametro1(String parametro1) {

        this.parametro1 = parametro1;
    }

    public void setParametro2(String parametro2) {
        this.parametro2 = parametro2;
    }
}
