package javaBasicsCodes;

public class staticExample {
    int count = 0;

    staticExample() {
        count++;
        System.out.println(count);
    }

    //here the variable count is not static
    public static void main(String args[]) {
        staticExample c1 = new staticExample();
        staticExample c2 = new staticExample();

    }
}

class Counter extends staticExample {
    static int count = 0;//will get memory only once and retain its value

    Counter() {
        count++;
        System.out.println(count);
    }

    //here the variable count is declared static
    public static void main(String args[]) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();

    }
}
