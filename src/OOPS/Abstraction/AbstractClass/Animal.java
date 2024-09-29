package OOPS.Abstraction.AbstractClass;

public abstract class Animal {
    // abstract methods
    abstract void eat();
    abstract void move();

    // concrete method
    void label() {
        System.out.println("Animal's data:");
    }
}
