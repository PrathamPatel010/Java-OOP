package com.pratham.staticExample;

public class Main {
    public static void main(String[] args) {
        Human pratham = new Human(18,"Pratham Patel", 1000000, false);
        Human prachet = new Human(17,"Prachet Patel", 1000000, false);
        Human prashant = new Human(17,"Prashant Patel",100000, false);
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

    }

    // this is independent of object
    static void fun(){
//        greeting();
    }

    // this belongs to the object, hence it depends on object
    void greeting() {
        System.out.println("Hello there");
    }

}
