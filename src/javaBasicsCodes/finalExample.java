package javaBasicsCodes;

//FINAL VARIABLE
public class finalExample {
    final static int a = 20;

    void add() {
        //a=30;  //will throw error as a is declared as final
    }

    public static void main(String[] args) {
        System.out.println(a);
    }
}

//FINAL METHOD
class car {
    final void run() {
        System.out.println("car starts");
    }
}

class maruti extends car {
//    public void run()
//    {
//        System.out.println("car is running");
//    }

    public static void main(String[] args) {
        car c = new car();
        c.run();

    }
}

//FINAL CLASS
class vehicle {
    void types() {
        System.out.println("vehicle can be 2-wheeler or 4-wheeler");
    }
}

class bike extends vehicle {
    void wheel() {
        System.out.println("bike has 2 wheels");
    }

    public static void main(String[] args) {
        System.out.println("we cannot extend a final class");
    }
}

