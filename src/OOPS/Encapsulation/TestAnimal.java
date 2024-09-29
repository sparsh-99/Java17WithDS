package OOPS.Encapsulation;

public class TestAnimal {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.setName("Lion");
        myAnimal.setAverageWeight(1.6);
        myAnimal.setNoOfLegs(2);
        System.out.println("Name: " + myAnimal.getName());
        System.out.println("Average Weight: " + myAnimal.getAverageWeight());
        System.out.println("Number of Legs: " + myAnimal.getNoOfLegs());
    }
}
