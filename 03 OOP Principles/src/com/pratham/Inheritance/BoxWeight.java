package com.pratham.Inheritance;


public class BoxWeight extends Box {
    double weight;

//    @Override
//    static void greeting(){
//        System.out.println("Hey, I am in BoxWeight Class. Greetings");
//    }

    BoxWeight(){
        this.weight = weight;
    }

    BoxWeight(double l, double w, double h, double weight){
        super(l,w,h);   // this is calling the parent class constructor and using that it is setting the values of l,w,h
                        // it is used to initialise values present in parent class constructor
        System.out.println("Child class constructor called");
        this.weight = weight;
//        System.out.println(super.length);     // super keyword is also used to access members of the super class/parent class.

    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    BoxWeight(BoxWeight other) {
        super(other);
        this.weight = weight;
    }
}
