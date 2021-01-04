package javaBasicsCodes;

public class whileLoopExample {
    public static void main(String[] args) {
        int i = 1, n = 5;

        // while loop from 1 to 5
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        //do-while loop from 21 to 30
        int j = 21;
        do {
            System.out.println(j);
            j++;
        } while (j != 31);
    }
}
