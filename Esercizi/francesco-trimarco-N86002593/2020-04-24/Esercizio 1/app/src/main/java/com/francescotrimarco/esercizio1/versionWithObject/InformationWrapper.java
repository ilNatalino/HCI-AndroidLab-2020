package com.francescotrimarco.esercizio1.versionWithObject;

import java.io.Serializable;

public class InformationWrapper implements Serializable {
    private String firstValueToPass;
    private String secondValueToPass;

    InformationWrapper(String firstValueToPass, String secondValueToPass) {
        this.firstValueToPass = firstValueToPass;
        this.secondValueToPass = secondValueToPass;
    }

    String getFirstValueToPass() {
        return firstValueToPass;
    }

    public void setFirstValueToPass(String firstValueToPass) {
        this.firstValueToPass = firstValueToPass;
    }

    String getSecondValueToPass() {
        return secondValueToPass;
    }

    public void setSecondValueToPass(String secondValueToPass) {
        this.secondValueToPass = secondValueToPass;
    }
}