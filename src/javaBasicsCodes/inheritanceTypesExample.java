package javaBasicsCodes;


//single inheritance
class Animal1 {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("barking...");
    }
}

class TestInheritance {
    public static void main(String args[]) {
        Dog1 d = new Dog1();
        d.bark();
        d.eat();
    }
}


//multi-level inheritance
class Animal2 {
    void eat() {
        System.out.println("eating");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("barking");
    }
}

class babyDog extends Dog2 {
    void weep() {
        System.out.println("weeping");
    }
}

class TestInheritance2 {
    public static void main(String args[]) {
        babyDog d = new babyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}


//heirarchical inheritance
class Animal3 {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog3 extends Animal3 {
    void bark() {
        System.out.println("barking...");
    }
}

class Cat extends Animal3 {
    void meow() {
        System.out.println("meowing...");
    }
}

class TestInheritance3 {
    public static void main(String args[]) {
        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}

public class inheritanceTypesExample {
    public static void main(String[] args) {
        System.out.println("all types of inheritance");
    }
}
