package javaBasicsCodes;

public class finallyExample {
    int num = 50;

    void divide() {
        try {
            int ans = num / 0;
        } catch (Exception e) {

        } finally {
            System.out.println("finally block will run no matter what");
        }
        System.out.println("Exception is not handled");


    }

    public static void main(String[] args) {
        finallyExample obj = new finallyExample();
        obj.divide();
    }

}
