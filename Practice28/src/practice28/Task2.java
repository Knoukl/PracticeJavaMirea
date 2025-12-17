package practice28;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    // c) создать и вернуть HashMap из 10 записей (фамилия, имя)
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();

        map.put("Ivanov", "Ivan");
        map.put("Petrov", "Ivan");
        map.put("Sidorov", "Alex");
        map.put("Smirnov", "Alex");
        map.put("Volkov", "Max");
        map.put("Fedorov", "Max");
        map.put("Orlov", "Max");
        map.put("Kuznetsov", "Pavel");
        map.put("Popov", "Pavel");
        map.put("Semenov", "Ivan");

        return map;
    }

    // d) количество людей с одинаковыми именами
    public static int getSameFirstNameCount(Map<String, String> map) {
        int count = 0;

        for (String name1 : map.values()) {
            for (String name2 : map.values()) {
                if (name1.equals(name2)) {
                    count++;
                }
            }
            break; // считаем только один раз
        }

        return count;
    }

    // e)количество людей с одинаковыми фамилиями
    public static int getSameLastNameCount(Map<String, String> map) {
        // фамилии — ключи Map, ключи уникальны, поэтому не можем найти людей с одинаковыми фамилиями
        return 0;
    }
}