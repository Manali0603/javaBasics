package javaBasicsCodes;

class Parent {
    void show() {
        System.out.println("My parents are tall");
    }
}


class Child extends Parent {

    @Override
    void show() {
        System.out.println("But I am taller");
    }
}

public class overridingExample {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.show();
        Parent obj2 = new Child();
        obj2.show();
    }

}
