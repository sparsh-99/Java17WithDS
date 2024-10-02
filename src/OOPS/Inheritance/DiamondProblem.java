package OOPS.Inheritance;

class A {
    void display() {
        System.out.println("A");
    }
}

class B extends A {
    void display() {
        System.out.println("B");
    }
}

class C extends A {
    void display() {
        System.out.println("C");
    }
}

/**
 * This code will result in a compilation error because Java does not allow a class (D) to extend more than one class (B and C).
 */
//class D extends B,C {
//
//}

public class DiamondProblem {
    public static void main(String[] args) {

    }
}
