package practice21;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {
    public static <T> List<T> convertArrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T item : array) {
            list.add(item);
        }
        return list;
    }

    public static <T> T getElement(T[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Неверный индекс: " + index);
        }
        return array[index];
    }
}