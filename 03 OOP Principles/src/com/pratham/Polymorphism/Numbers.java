package com.pratham.Polymorphism;

public class Numbers {
    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    void sum(int a, String b){

    }

    void sum(String a, int b){

    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(2,3));
        System.out.println(obj.sum(1,2,3));
    }

}
