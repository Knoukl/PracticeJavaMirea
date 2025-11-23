package practice23;

public class ArrayQueueADT {
    private int[] elements;
    private int front;
    private int rear;
    private int size;
    private final int initialCapacity;

    public ArrayQueueADT(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        elements = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
        initialCapacity = capacity;
    }

    public static void enqueue(ArrayQueueADT queue, int element) {
        if (queue.size == queue.elements.length) {
            ensureCapacity(queue);
        }

        if (isEmpty(queue)) {
            queue.front = 0;
        }

        queue.rear = (queue.rear + 1) % queue.elements.length;
        queue.elements[queue.rear] = element;
        queue.size++;
    }

    public static int dequeue(ArrayQueueADT queue) {
        int value = element(queue);
        queue.front = (queue.front + 1) % queue.elements.length;
        queue.size--;

        if (isEmpty(queue)) {
            queue.front = -1;
            queue.rear = -1;
        }

        return value;
    }

    public static int element(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.elements[queue.front];
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static void clear(ArrayQueueADT queue) {
        queue.front = -1;
        queue.rear = -1;
        queue.size = 0;
    }

    private static void ensureCapacity(ArrayQueueADT queue) {
        int newCapacity = queue.elements.length * 2;
        int[] newArray = new int[newCapacity];

        // Копируем элементы в новом порядке
        for (int i = 0; i < queue.size; i++) {
            newArray[i] = queue.elements[(queue.front + i) % queue.elements.length];
        }

        queue.elements = newArray;
        queue.front = 0;
        queue.rear = queue.size - 1;
    }
}