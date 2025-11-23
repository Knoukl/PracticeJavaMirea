package practice21;

public class GenericArray<T> {
    private T[] array;

    public GenericArray(int size) {
        array = (T[]) new Object[size];
    }

    public T get(int index) {
        return array[index];
    }

    public void set(int index, T value) {
        array[index] = value;
    }
}