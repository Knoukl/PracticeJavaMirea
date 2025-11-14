import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Практическая работа 18 ===");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    // Задание 1
    public static void task1() {
        System.out.println("\n=== Задание 1 ===");
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
        System.out.println("2.0 / 0.0 = " + (2.0 / 0.0));
    }

    // Задание 2
    public static void task2() {
        System.out.println("\n=== Задание 2 ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = sc.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println("Result: " + (2 / i));
        } catch (NumberFormatException e) {
            System.out.println("Not an integer!");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    // Задание 3
    public static void task3() {
        System.out.println("\n=== Задание 3 ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = sc.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println("Result: " + (2 / i));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }

    // Задание 4
    public static void task4() {
        System.out.println("\n=== Задание 4 ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = sc.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println("Result: " + (2 / i));
        } catch (NumberFormatException e) {
            System.out.println("Not an integer!");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        } finally {
            System.out.println("Finally block executed");
        }
    }

    // Задание 5
    public static void task5() {
        System.out.println("\n=== Задание 5 ===");

        try {
            getDetails(null);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        System.out.println("Key: " + key);
    }

    // Задание 6
    public static void task6() {
        System.out.println("\n=== Задание 6 ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key: ");
        String key = sc.next();

        try {
            printMessage(key);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public static void printMessage(String key) throws Exception {
        try {
            if (key.equals("")) {
                throw new Exception("Key set to empty string");
            }
            System.out.println("Data for key: " + key);
        } catch (Exception e) {
            System.out.println("Exception caught inside printMessage, rethrowing...");
            throw e;
        }
    }
}
