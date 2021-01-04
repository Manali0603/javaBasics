package javaBasicsCodes;

public class continueAndBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; ++i) {

            // if the value of i is 5 the loop terminates
            if (i == 5) {
                break;
            }
            System.out.println(i);

        }
        System.out.println(".......BREAK POINT.......");

        //continue example
        for (int i = 1; i <= 10; ++i) {

            // if value of i is between 4 and 9
            // continue is executed
            if (i > 4 && i < 9) {
                continue;
            }
            System.out.println(i);
        }
    }
}
