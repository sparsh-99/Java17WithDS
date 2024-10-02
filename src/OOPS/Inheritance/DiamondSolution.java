package OOPS.Inheritance;

interface X {
    default void display() {
        System.out.println("X");
    }
}

interface Y extends X {
    default void display() {
        System.out.println("Y");
    }
}

interface Z extends X {
    default void display() {
        System.out.println("Z");
    }
}

class Solution implements Y, Z {
    public void display() {
        // Explicitly choosing which display method to call
        Y.super.display();
    }
}


public class DiamondSolution {
    public static void main(String[] args) {
        Solution mySolution = new Solution();
        mySolution.display();
    }
}
