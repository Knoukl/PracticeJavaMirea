import practice8.Task1;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = sc.nextInt();
        Task1.recursion(1, 0, n, 1);
    }
}
