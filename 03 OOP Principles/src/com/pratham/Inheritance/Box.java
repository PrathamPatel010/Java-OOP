package com.pratham.Inheritance;

public class Box {
    private double length;
    double width;
    double height;

    static void greeting() {
        System.out.println("Hey, I am in the Box class. Greetings");
    }

    public double getLength() {
        return length;
    }

    Box(){
        super();
        this.length = 0;
        this.width = 0;
        this.height =0;
    }

    // cube
    Box(double side){
        this.length = side;
        this.width = side;
        this.height = side;
    }

    Box(double l,double w, double h){
        System.out.println("Parent class constructor called");
        this.length = l;
        this.width = w;
        this.height = h;
    }

    Box(Box old){
        this.length = old.length;
        this.width = old.width;
        this.height = old.height;
    }

    void information(){
        System.out.println("Running the box");
    }


}
