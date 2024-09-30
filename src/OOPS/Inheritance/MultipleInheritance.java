package OOPS.Inheritance;

interface Animal1 {
    void sound();
}

interface Pet {
    void play();
}

class Cat implements Animal1, Pet {
    public void sound() {
        System.out.println("Cat meows.");
    }
    public void play() {
        System.out.println("Cat plays with ball.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.sound();
        myCat.play();
    }
}
