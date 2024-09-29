package OOPS.Abstraction.AbstractClass;

public class Bird extends Animal {
    @Override
    void eat() {
        System.out.println("Eats birdfood.");
    }

    @Override
    void move() {
        System.out.println("Moves by flying.");
    }
}
