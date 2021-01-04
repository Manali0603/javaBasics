package javaBasicsCodes;

public class variablesAndDataTypes {
    int num = 20; //instance
    static int num1 = 30;  //static

    static void forVariables() {

        int num2 = 10;  //local
        System.out.println(num2);  //we can access the local variable inside the method only
    }

    static void forDataTypeExample() {
        boolean d1 = true;
        byte d2 = 127;
        short d3 = 34;
        int d4 = 60000;
        long d5 = 200000000;
        float d6 = 87.4f;
        double d7 = 138276483.6;
        char d8 = 'a';
        System.out.println(d1 + "\n" + d2 + "\n" + d3 + "\n" + d4 + "\n" + d5 + "\n" + d6 + "\n" + d7 + "\n" + d8);

    }

    public static void main(String[] args) {
        var v = new variablesAndDataTypes();
        System.out.println("first number = " + v.num + "\nsecond number =  " + num1);
        forDataTypeExample();

    }
}
