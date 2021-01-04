package javaBasicsCodes;

public class constructorExample {
    int a;

    //default constructor
    constructorExample() {
        a = 10;
        System.out.println("default constructor" + a);
    }

    //below is the example of parameterized constructor
    //area of square
    constructorExample(int length) {
        System.out.println(length * length);
    }

    //area of rectangle
    constructorExample(int length, int breadth) {
        System.out.println(length * breadth);
    }

    //area of cuboid
    constructorExample(int length, int breadth, int height) {
        System.out.println(length * breadth * height);
    }

    public static void main(String[] args) {
        constructorExample nobj = new constructorExample();
        constructorExample obj = new constructorExample(5);
        constructorExample obj1 = new constructorExample(4, 2);
        constructorExample obj2 = new constructorExample(2, 2, 4);
    }
}