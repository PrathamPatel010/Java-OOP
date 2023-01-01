package com.pratham;

class WrapperExample {
    public static void main(String[] args) {
        Integer number = 45;
        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
        
        final int c = 2;
        final A pratham = new A("Pratham Patel");
        pratham.name = "coder"; 

        // when a non-primitive is final, you cannot reassign it
        // pratham = new A("new object"); // we cannot do this

        A obj;
        for (int i = 0; i < 10000; i++) {
            obj = new A("Random object");
        }
    }

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
    
}

class A{
    String name;
    A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}