import practice27.hashtab;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // Задание 2
        hashtab table = new hashtab();
        table.hashtabInit(10);

        table.hashtabAdd("one", "1");
        table.hashtabAdd("two", "2");
        table.hashtabAdd("three", "3");
        table.hashtabAdd("four", "4");
        table.hashtabAdd("five", "5");
        table.hashtabAdd("six", "6");
        table.hashtabAdd("seven", "7");
        table.hashtabAdd("eight", "8");
        table.hashtabAdd("nine", "9");
        table.hashtabAdd("ten", "10");


        //Задание 3

        System.out.println("Поиск элемента с ключом five:");
        System.out.println(table.hashtabLookup("five"));

        System.out.println("Удаление элемента с ключом five");
        table.hashtabDelete("five");

        System.out.println("Повторный поиск элемента five:");
        System.out.println(table.hashtabLookup("five"));


        // Задание 4
        PriorityQueue<Integer> queue = new PriorityQueue<>(); // мы рандомно добавляем числа но они сами выдаются по порядку, так как заложен приоритет

        queue.add(10);
        queue.add(5);
        queue.add(3);
        queue.add(8);
        queue.add(1);
        queue.add(7);
        queue.add(2);
        queue.add(9);
        queue.add(4);
        queue.add(6);

        System.out.println("Извлечение элементов из очереди с приоритетом:");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
