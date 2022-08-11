package com.example.demojavaprojct;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "Name: "+name + " Age: "+age;
    }
}
