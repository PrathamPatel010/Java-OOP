package com.pratham;

public class Main {

    public static void main(String[] args) {
        // store 5 rollnos
        int[] number = new int[5];
        // store 5 names
        String[] name = new String[5];

        // Student pratham;    // here, you are declaring a reference variable to the object of the class type
        // pratham = new Student();
        Student pratham = new Student(140,"Pratham Patel",91.1f);
        Student prachet = new Student(138,"Prachet Patel",95.6f);
        
        Student random = new Student(pratham);
        Student random2 = new Student();

        Student one = new Student();
        Student two = one;
        one.name = "Something Something";
        System.out.println(two.name);
        
        // pratham.changeName("Coder");
        // pratham.greeting();
        // prachet.greeting();
        // pratham.display();
        // prachet.display();
        // random2.display();
    }
}
// create a class
class Student{
    int rno;
    String name;
    float marks;

    void display(){
        System.out.println(this.rno);
        System.out.println(this.name);
        System.out.println(this.marks);
    }
    void greeting(){
        System.out.println("Hello My name is " + this.name);
    }

    void changeName(String newName){
        this.name = newName;
    }


    // Default Constructor
    // Student(){
    //     // we need a way to add the values of above properties object by object
    //     // we need a one word to access every object 
    //     this.rno = 13;
    //     this.name = "Pratham Patel";
    //     this.marks = 91.1f;
    // }

    // to call a constructor through another constructor
    Student(){
        this(13,"Random Person",85.4f);
    }

    // Parametrised Constructor
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    // Copy Constructor
    Student(Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    
}
