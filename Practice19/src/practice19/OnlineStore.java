package practice19;

import java.util.Scanner;

public class OnlineStore {
    public void makePurchase() throws InvalidInnException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ФИО покупателя: ");
        String fullName = sc.nextLine();
        System.out.print("Введите номер ИНН: ");
        String inn = sc.nextLine();

        if (!isValidInn(inn)) {
            throw new InvalidInnException("Недействительный ИНН: " + inn);
        }

        System.out.println("\nПокупка оформлена успешно!");
        System.out.println("ФИО: " + fullName);
        System.out.println("ИНН: " + inn);
    }
    private boolean isValidInn(String inn) {
        // Проверка по количеству символов в ИНН
        if (inn == null) return false;
        if (!inn.matches("\\d{10}|\\d{12}")) return false;
        return true;
    }
}