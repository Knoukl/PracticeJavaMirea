package practice23;

public interface Queue {
    void enqueue(int element);
    int dequeue();
    int element();
    boolean isEmpty();
    int size();
    void clear();
}