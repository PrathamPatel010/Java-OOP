package com.pratham.Polymorphism;

public class ObjectPrint {
    int num;

    ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num + " ";
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(140);
        System.out.println(obj);
    }
}
