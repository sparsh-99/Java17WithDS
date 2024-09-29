package OOPS.Polymorphism.CompileTime;

/**
 * Method Overloading
 */
public class Bird {
    public void fly() {
        System.out.println("Bird is flying.");
    }

    public void fly(int distance) {
        System.out.println("Bird flies " + distance + " meters.");
    }

    public void fly(int distance, int time) {
        System.out.println("Bird flies " + distance + " meters in " + time + " seconds.");
    }
}
