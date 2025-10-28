import practice13.Address;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        String example = "Россия, Московская область; Москва. Тверская, 12, 1, 45,";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите адрес (через запятую, точку с запятой или пробел):");
        String text = sc.nextLine();
        String[] parts = text.split("[,;.]+");

        if (parts.length < 7) {
            System.out.println("Ошибка: введено недостаточно элементов адреса (нужно 7)");
            return;
        }

        Address address = new Address(
                parts[0].trim(), // страна
                parts[1].trim(), // регион
                parts[2].trim(), // город
                parts[3].trim(), // улица
                parts[4].trim(), // дом
                parts[5].trim(), // корпус
                parts[6].trim()  // квартира
        );

        System.out.println("\nРаспознанный адрес:");
        System.out.println(address);
    }
}
