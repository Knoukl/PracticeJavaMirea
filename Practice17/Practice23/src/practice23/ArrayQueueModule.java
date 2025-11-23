package practice23;

public class ArrayQueueModule {
    private static final int DEFAULT_CAPACITY = 10;
    private static int[] elements = new int[DEFAULT_CAPACITY];
    private static int front = -1;
    private static int rear = -1;
    private static int size = 0;

    public static void enqueue(int element) {
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

    public static int dequeue() {
        int value = element();
        front = (front + 1) % elements.length;
        size--;

        if (isEmpty()) {
            front = -1;
            rear = -1;
        }

        return value;
    }

    public static int element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[front];
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static int size() {
        return size;
    }

    public static void clear() {
        front = -1;
        rear = -1;
        size = 0;
    }

    private static void ensureCapacity() {
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
