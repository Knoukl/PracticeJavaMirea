import practice8.Task3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите A: ");
        int a = sc.nextInt();
        System.out.print("Введите B: ");
        int b = sc.nextInt();
        Task3.recursion(a, a, b);
        System.out.print("Вот ваша последовательность: ");
    }
}
