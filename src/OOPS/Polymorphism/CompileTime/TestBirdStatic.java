package OOPS.Polymorphism.CompileTime;

public class TestBirdStatic {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.fly(2);
        bird.fly(10, 5);
    }
}
