package practice28;

import java.util.HashSet;
import java.util.TreeSet;

public class Hash_to_tree {
    public static void main(String[] args) {

        // создаем HashSet
        HashSet<String> set = new HashSet<String>();

        // добавляем элементы
        set.add("Work");
        set.add("practice");
        set.add("hash");
        set.add("table");

        System.out.println("Original HashSet: " + set);

        // преобразуем HashSet в TreeSet
        TreeSet<String> treeSet = new TreeSet<String>(set); //
        // после преобразования элементы сортируются по коду символов unicode

        System.out.println("TreeSet (sorted): " + treeSet);
    }
}

