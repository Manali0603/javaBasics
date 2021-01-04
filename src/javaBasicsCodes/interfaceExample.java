package javaBasicsCodes;


interface Interface1 {
    final int a = 10;

    void display();
}

public class interfaceExample implements Interface1 {
    public void display() {
        System.out.println("Maersk");
    }

    public static void main(String[] args) {


        interfaceExample t = new interfaceExample();
        t.display();
        System.out.println(a);
    }
}

//multiple inheritance
interface parent1 {
    void cook();

}

interface parent2 {
    void cook();
}

class child implements parent1, parent2 {
    public void cook() {
        System.out.println("the child can cook well");
    }

    public static void main(String[] args) {
        child c = new child();
        c.cook();
    }
}
