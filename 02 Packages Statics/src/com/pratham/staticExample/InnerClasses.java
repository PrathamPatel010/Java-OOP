package com.pratham.staticExample;

public class InnerClasses {
    static class Test{
        String name;

        public Test(String name){
            this.name = name;
        }

        @Override
        public String toString(){
            return name;
        }
    }


    public static void main(String[] args) {
        Test a = new Test("Pratham");
        Test b = new Test("Prachet");
        System.out.println(a);
//        System.out.println(a.name);
//        System.out.println(b.name);
    }
}
