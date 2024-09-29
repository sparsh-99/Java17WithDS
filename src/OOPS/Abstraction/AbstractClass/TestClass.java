package OOPS.Abstraction.AbstractClass;

public class TestClass {
    public static void main(String[] args) {
        Bird myBird = new Bird();
        myBird.label();
        myBird.eat();
        myBird.move();

        Fish myFish = new Fish();
        myFish.label();
        myFish.eat();
        myFish.move();
    }
}
