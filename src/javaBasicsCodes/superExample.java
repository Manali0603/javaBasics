package javaBasicsCodes;

class Manali {
    Manali() {
        System.out.println("Manali is sleeping");
    }

    void listen() {
        System.out.println("and is listening to music");
    }
}

public class superExample extends Manali {
    superExample() {
        super.listen();
        System.out.println("Manali is running");
    }

    public static void main(String[] args) {
        superExample obj1 = new superExample(); //parent class constructor will be called first

    }
}
