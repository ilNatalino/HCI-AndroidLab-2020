package com.example.eserciziointent;
import java.io.Serializable;

/* Oggetto da passare tramite intent */
public class Obj implements Serializable {
    private String name_user;
    private String name_password;

    Obj(String name_user, String name_password){
        this.name_user=name_user;
        this.name_password=name_password;
    }

    public String getUser(){
        return name_user;
    }

    public String getPass(){
        return name_password;
    }
}
