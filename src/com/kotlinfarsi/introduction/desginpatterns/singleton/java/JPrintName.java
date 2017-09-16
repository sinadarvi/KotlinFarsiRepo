package com.kotlinfarsi.introduction.desginpatterns.singleton.java;

public class JPrintName {

    private static JPrintName instance = null;

    private String name ;

    private JPrintName(String name) {
        this.name = name;
    }

    public static JPrintName getInstance(String name) {
        if(instance == null)
            instance = new JPrintName(name);
        return instance;
    }

    public void printName(){
        System.out.println("Name is :" + name);
    }
}
