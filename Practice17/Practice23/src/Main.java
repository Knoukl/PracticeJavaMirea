import practice23.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ЗАДАНИЕ 1 ===");
        System.out.println("\n=== Тестирование ArrayQueueModule ===");
        testModuleQueue();

        System.out.println("\n=== Тестирование ArrayQueueADT ===");
        testADTQueue();

        System.out.println("\n=== Тестирование ArrayQueue ===");
        testClassQueue();

        System.out.println("\n=== Тестирование LinkedQueue ===");
        testLinkedQueue();
    }

    private static void testModuleQueue() {
        ArrayQueueModule.clear();
        System.out.println("Очередь пуста: " + ArrayQueueModule.isEmpty());

        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);
        System.out.println("Размер очереди: " + ArrayQueueModule.size());
        System.out.println("Первый элемент: " + ArrayQueueModule.element());

        System.out.println("Удален элемент: " + ArrayQueueModule.dequeue());
        System.out.println("Удален элемент: " + ArrayQueueModule.dequeue());
        System.out.println("Размер очереди: " + ArrayQueueModule.size());

        ArrayQueueModule.enqueue(4);
        ArrayQueueModule.enqueue(5);
        ArrayQueueModule.enqueue(6);
        System.out.println("Первый элемент: " + ArrayQueueModule.element());

        ArrayQueueModule.clear();
        System.out.println("Очередь пуста после очистки: " + ArrayQueueModule.isEmpty());
    }

    private static void testADTQueue() {
        ArrayQueueADT queue = new ArrayQueueADT(3);
        System.out.println("Очередь пуста: " + ArrayQueueADT.isEmpty(queue));

        ArrayQueueADT.enqueue(queue, 10);
        ArrayQueueADT.enqueue(queue, 20);
        ArrayQueueADT.enqueue(queue, 30);
        System.out.println("Размер очереди: " + ArrayQueueADT.size(queue));
        System.out.println("Первый элемент: " + ArrayQueueADT.element(queue));

        System.out.println("Удален элемент: " + ArrayQueueADT.dequeue(queue));
        System.out.println("Размер очереди: " + ArrayQueueADT.size(queue));

        ArrayQueueADT.enqueue(queue, 40);
        System.out.println("Первый элемент: " + ArrayQueueADT.element(queue));

        ArrayQueueADT.clear(queue);
        System.out.println("Очередь пуста после очистки: " + ArrayQueueADT.isEmpty(queue));
    }

    private static void testClassQueue() {
        ArrayQueue queue = new ArrayQueue(3);
        System.out.println("Очередь пуста: " + queue.isEmpty());

        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        System.out.println("Размер очереди: " + queue.size());
        System.out.println("Первый элемент: " + queue.element());

        System.out.println("Удален элемент: " + queue.dequeue());
        System.out.println("Размер очереди: " + queue.size());

        queue.enqueue(400);
        System.out.println("Первый элемент: " + queue.element());

        queue.clear();
        System.out.println("Очередь пуста после очистки: " + queue.isEmpty());
    }

    private static void testLinkedQueue() {
        Queue queue = new LinkedQueue();
        System.out.println("Очередь пуста: " + queue.isEmpty());

        queue.enqueue(1000);
        queue.enqueue(2000);
        queue.enqueue(3000);
        System.out.println("Размер очереди: " + queue.size());
        System.out.println("Первый элемент: " + queue.element());

        System.out.println("Удален элемент: " + queue.dequeue());
        System.out.println("Размер очереди: " + queue.size());

        queue.enqueue(4000);
        System.out.println("Первый элемент: " + queue.element());

        queue.clear();
        System.out.println("Очередь пуста после очистки: " + queue.isEmpty());
    }
}