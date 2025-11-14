import practice19.InvalidInnException;
import practice19.OnlineStore;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Практическая работа 19: Задание 1 ===");

        OnlineStore store = new OnlineStore();
        try {
            store.makePurchase();
        } catch (InvalidInnException e) {
            System.out.println("\nОшибка: " + e.getMessage());
            System.out.println("Покупка не может быть завершена.");
        }

        System.out.println("\nРабота программы завершена.");
    }
}
