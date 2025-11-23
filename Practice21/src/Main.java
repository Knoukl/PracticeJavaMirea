import practice21.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n=== Задание 1 ===");
        String[] stringArray = {"Яблоко", "Банан", "Апельсин"};
        List<String> stringList = ArrayUtils.convertArrayToList(stringArray);
        System.out.println("Список строк: " + stringList);
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = ArrayUtils.convertArrayToList(intArray);
        System.out.println("Список чисел: " + intList);

        System.out.println("\n=== Задание 2 ===");
        GenericArray<String> stringArrayContainer = new GenericArray<>(3);
        stringArrayContainer.set(0, "Первый");
        stringArrayContainer.set(1, "Второй");
        stringArrayContainer.set(2, "Третий");
        System.out.println("Элемент массива [0]: " + stringArrayContainer.get(0));
        System.out.println("Элемент массива [1]: " + stringArrayContainer.get(1));

        System.out.println("\n=== Задание 3 ===");
        String thirdElement = ArrayUtils.getElement(stringArray, 2);
        System.out.println("Третий элемент массива: " + thirdElement);

        System.out.println("\n=== Задание 4 ===");
        DirectoryUtils.getDirectoryContents(".");
    }
}