package practice23;

public class ArrayQueue {
    private int[] elements;
    private int front;
    private int rear;
    private int size;
    private final int initialCapacity;

    public ArrayQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        elements = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
        initialCapacity = capacity;
    }

    public void enqueue(int element) {
        if (size == elements.length) {
            ensureCapacity();
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % elements.length;
        elements[rear] = element;
        size++;
    }

    public int dequeue() {
        int value = element();
        front = (front + 1) % elements.length;
        size--;

        if (isEmpty()) {
            front = -1;
            rear = -1;
        }

        return value;
    }

    public int element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void clear() {
        front = -1;
        rear = -1;
        size = 0;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        int[] newArray = new int[newCapacity];

        // Копируем элементы в новом порядке
        for (int i = 0; i < size; i++) {
            newArray[i] = elements[(front + i) % elements.length];
        }

        elements = newArray;
        front = 0;
        rear = size - 1;
    }
}