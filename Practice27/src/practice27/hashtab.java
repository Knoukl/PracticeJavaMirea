package practice27;

public class hashtab {

    private static class Item {
        String key;
        String value;
        Item next;

        Item(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private Item[] table; // ячейка хеш таблицы

    public void hashtabInit(int size) { // создание таблицы заданного размера
        table = new Item[size];
    }

    public int hashtabHash(String key) {
        return Math.abs(key.hashCode()) % table.length; // переводим ключ с помощью хешфункции в индекс массива
    }

    public void hashtabAdd(String key, String value) {
        int index = hashtabHash(key);
        Item newItem = new Item(key, value);
        newItem.next = table[index]; // вставляем новый item в начало цепочки
        table[index] = newItem;
    }

    public String hashtabLookup(String key) { // поиск элемента
        int index = hashtabHash(key);
        Item current = table[index];

        while (current != null) {
            if (current.key.equals(key)) { // идём по бакету, ищем элемент
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void hashtabDelete(String key) {
        int index = hashtabHash(key);
        Item current = table[index];
        Item prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) { // для удаления первого
                    table[index] = current.next; // меняем ссылку бакета на следующий элемент
                } else {
                    prev.next = current.next; // для удаления посередине, или в конце
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }
}
