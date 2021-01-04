package javaBasicsCodes;

import java.util.Scanner;

public class javaOperators {
    static void arithmaticOperators() {
        int a = 10, b = 15;
        System.out.println("a + b = " + (a + b));
        // subtraction operator
        System.out.println("a - b = " + (a - b));
        // multiplication operator
        System.out.println("a * b = " + (a * b));
        // division operator
        System.out.println("a / b = " + (a / b));
        // modulo operator
        System.out.println("a % b = " + (a % b));
    }

    static void assignmentOperators() {
        int a = 4;
        int var;
        // assign value using =
        var = a;
        System.out.println("var using =: " + var);
        // assign value using =+
        var += a;
        System.out.println("var using +=: " + var);
        // assign value using =*
        var *= a;
        System.out.println("var using *=: " + var);
    }

    static void relationalOperators() {
        int a = 7, b = 11;

        // value of a and b
        System.out.println("a is " + a + " and b is " + b);
        // == operator
        System.out.println(a == b);  // false
        // != operator
        System.out.println(a != b);  // true
        // > operator
        System.out.println(a > b);  // false
        // < operator
        System.out.println(a < b);  // true
        // >= operator
        System.out.println(a >= b);  // false
        // <= operator
        System.out.println(a <= b);  // true
    }

    static void logicalOperators() {
        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false
        // || operator
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false
        // ! operator
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false
    }

    static void unaryOperators() {
        int a = 12, b = 12;
        int result1, result2;
        // original value
        System.out.println("Value of a: " + a);
        // increment operator
        result1 = ++a;
        System.out.println("After increment: " + result1);
        System.out.println("Value of b: " + b);
        // decrement operator
        result2 = --b;
        System.out.println("After decrement: " + result2);
    }

    static void bitwiseOperators() {
        int a = 5;
        int b = 7;

        // bitwise and
        System.out.println("a&b = " + (a & b));
        // bitwise or
        System.out.println("a|b = " + (a | b));
        // bitwise xor
        System.out.println("a^b = " + (a ^ b));
        // bitwise and
        System.out.println("~a = " + ~a);

    }

    static void ternaryOperator() {
        Scanner input = new Scanner(System.in);
        double marks = input.nextDouble();

        // ternary operator checks if
        // marks is greater than 40
        String result = (marks > 40) ? "pass" : "fail";

        System.out.println(result);
    }

    public static void main(String[] args) {
        arithmaticOperators();
        assignmentOperators();
        relationalOperators();
        logicalOperators();
        unaryOperators();
        bitwiseOperators();
        ternaryOperator();
    }
}
