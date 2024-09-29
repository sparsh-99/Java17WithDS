package OOPS.Polymorphism.RunTime;

public class TestDynamic {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Bird bird = new Bird();
        bird.eat();
    }
}
