import practice28.MyHashMap;
import practice28.Task2;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map2 = Task2.createMap();

        int sameFirstNames = Task2.getSameFirstNameCount(map2);
        int sameLastNames = Task2.getSameLastNameCount(map2);

        System.out.println("===Задание 2===");
        System.out.println("Количесвто людей с одинаковой фамилией:");
        System.out.println(sameLastNames);
        System.out.println("Количесвто людей с одинаковым именем:");
        System.out.println(sameFirstNames);
        // Задание 3
        MyHashMap map3 = new MyHashMap(10);

        map3.put(1.25, "first");
        map3.put(2.50, "second");
        map3.put(3.75, "third");
        map3.put(1.30, "collision example");

        String v1 = map3.get(1.25);
        String v2 = map3.get(3.75);
        String v3 = map3.get(1.30);

        System.out.println("\n===Задание 3===");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
