package practice23;

public class LinkedQueue extends AbstractQueue {
    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head; // начало очереди (для удаления)
    private Node tail; // конец очереди (для добавления)

    public LinkedQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void enqueue(int element) {
        Node newNode = new Node(element);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        int value = head.value;
        head = head.next;
        size--;

        if (isEmpty()) {
            tail = null;
        }

        return value;
    }

    @Override
    public int element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return head.value;
    }
}