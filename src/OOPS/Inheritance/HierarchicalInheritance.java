package OOPS.Inheritance;

class School {
    void schoolName() {
        System.out.println("School Name: ABC");
    }
}

class RainbowSchool extends School {
    void board() {
        System.out.println("Board: CBSE");
    }
}

class PinewoodSchool extends School {
    void facilities() {
        System.out.println("Facilities: Library, Auditorium, Playground");
    }
}


public class HierarchicalInheritance {
    public static void main(String[] args) {
        RainbowSchool myRainbowSchool = new RainbowSchool();
        myRainbowSchool.board(); // own method
        myRainbowSchool.schoolName(); // inherited method

        PinewoodSchool myPinewoodSchool = new PinewoodSchool();
        myPinewoodSchool.facilities(); // own method
        myPinewoodSchool.schoolName(); // inherited method
    }
}
