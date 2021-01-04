package javaBasicsCodes;

public class customExceptionExample {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("cannot vote");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]) {
        try {
            validate(25);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("rest of the code");
    }
}
