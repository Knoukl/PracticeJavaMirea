import practice20.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 1 & 2 ===");
        TripleContainer<String, Integer, Boolean> container1 = new TripleContainer<>("Hello", 42, true);
        System.out.println("Value1: " + container1.getValue1());
        System.out.println("Value2: " + container1.getValue2());
        System.out.println("Value3: " + container1.getValue3());
        container1.printClassNames();

        System.out.println("\n=== Задание 3 ===");
        Dog myDog = new Dog("Buddy");
        TripleContainerUpdate<String, Dog, Double> container2 = new TripleContainerUpdate<>("World", myDog, 3.14);
        System.out.println("Value1: " + container2.getValue1());
        System.out.println("Value2: " + container2.getValue2());
        System.out.println("Value3: " + container2.getValue3());
        container2.printClassNames();
    }
}