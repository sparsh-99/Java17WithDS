package OOPS.Inheritance;

class Animal {
    void sound() {
        System.out.println("Has a high-pitched whistling sound.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class SingleInheritance {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(); // subclass method
        dog.sound(); // inherited method
    }
}
