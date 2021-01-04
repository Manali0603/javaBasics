package javaBasicsCodes;

abstract class Base {
    abstract void fun();  //abstract function

    //normal function
    void add(int a, int b) {
        System.out.println(a + b);
    }
}

class Derived extends Base {
    void fun() {
        System.out.println("Derived fun() called");
    }
}

public class abstractExample {
    public static void main(String[] args) {
        Base b = new Derived();
        b.add(5, 10);
        b.fun();
    }
}
