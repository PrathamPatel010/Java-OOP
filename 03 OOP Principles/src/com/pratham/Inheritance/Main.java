package com.pratham.Inheritance;

public class Main {

    public static void main(String[] args) {
//        Box box = new Box(3);
//        Box box1 = new Box(1.2,2.3,3.4);
//        Box box2 = new Box(box1);
//        System.out.println(box1.length + " " + box1.width + " " + box1.height);
//        System.out.println(box2.length + " " + box2.width + " " + box2.height);

//        BoxWeight box3 = new BoxWeight();
//        System.out.println(box3.length + " " + box3.width + " " + box3.height + " " + box3.weight);
//
//        BoxWeight box4 = new BoxWeight(2,3,4,5);
//        System.out.println(box4.length + " " + box4.width + " " + box4.height + " " + box4.weight);
//
//        Box box5 = new BoxWeight(1,4,6,8);
//        It is actually the type of the reference variable that determines, and not the type of the object
//        what members /properties can be accessed.
//        System.out.println(box5.weight);  // error

//        there are many variables in parent and child classes
//        you are given access to variables that are of reference type i.e. here, BoxWeight
//        hence, you should have access to weight variable
//        this also means ones you are trying to access must be initialized.
//        but here, when the object is of type parent class, how can we call the constructor of child class.
//        BoxWeight box6 = new Box(1,2,3);    //        this is why error
//        BoxWeight box7 = new BoxWeight(5,6,7,8);
//        BoxPrice box8 = new BoxPrice();
//        box1.greeeting();
        BoxWeight box = new BoxWeight();
        BoxWeight.greeting();   // you can inherit, but you cannot override
        box.getLength();

    }
}
