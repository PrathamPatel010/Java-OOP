package com.pratham.singleton;

public class Singleton {
    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton getInstance(){
        // check whether 1 object only is already created or not
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
