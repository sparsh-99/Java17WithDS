package OOPS.Abstraction.AbstractClass;

public class Fish extends Animal {
    @Override
    void eat() {
        System.out.println("Eats seafood.");
    }

    @Override
    void move() {
        System.out.println("Moves by swimming.");
    }
}
