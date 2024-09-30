package OOPS.Inheritance;

class Vehicle {
    void sound() {
        System.out.println("Has a high-pitched vibration sound.");
    }
}

class Car extends Vehicle {
    void color() {
        System.out.println("Car is red.");
    }
}

class Audi extends Car {
    void engine() {
        System.out.println("Has a 1.8 litre engine.");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {
        Audi myAudi = new Audi();
        myAudi.color();
        myAudi.engine();
        myAudi.sound();
    }
}
