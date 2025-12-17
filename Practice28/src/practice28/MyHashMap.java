package practice28;

public class MyHashMap {

    // элемент хеш-таблицы (узел цепочки)
    private static class Item {
        double key;
        String value;
        Item next;

        Item(double key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    // массив бакетов
    private Item[] table;

    // конструктор — инициализация таблицы
    public MyHashMap(int size) {
        table = new Item[size];
    }

    // хеш-функция для вещественного ключа
    private int hash(double key) {
        return Math.abs((int) (key * 100)) % table.length;
    }

    // добавление элемента
    public void put(double key, String value) {
        int index = hash(key);

        Item item = new Item(key, value);
        item.next = table[index];
        table[index] = item;
    }

    // поиск по ключу
    public String get(double key) {
        int index = hash(key);
        Item current = table[index];

        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }
}
