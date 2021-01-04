package javaBasicsCodes;

public class tryCatchExample {
    int a = 40;

    void divide() {
        try {
            int ans = a / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Rest will run fine");

    }

    public static void main(String[] args) {
        tryCatchExample obj = new tryCatchExample();
        obj.divide();
    }
}
