package javaBasicsCodes;

public class throwExample {
    static void validate(int marks) {
        if (marks < 33)
            throw new ArithmeticException("not pass");
        else
            System.out.println("congrats you have passed");
    }

    public static void main(String args[]) {
        validate(50);
        System.out.println("rest of the code...");
    }
}
