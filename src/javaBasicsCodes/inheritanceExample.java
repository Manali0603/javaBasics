package javaBasicsCodes;

public class inheritanceExample {
    void animal() {
        System.out.println("animal walks");
    }

}

class dog extends inheritanceExample {
    void sound() {
        System.out.println("dog barks");
    }

    public static void main(String[] args) {

        dog d = new dog();
        d.animal();
        d.sound();
    }
}



