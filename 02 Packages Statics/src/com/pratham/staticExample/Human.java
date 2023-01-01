package com.pratham.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void greeting(){
        System.out.println("Hello World");
//        System.out.println(this.age);     // cannot use over here
    }
    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
//        this.population += 1;
        Human.population += 1;
    }
}
