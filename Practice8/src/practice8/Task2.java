package practice8;

public class Task2 {
    public static void recursion(int number, int n) {
        System.out.print(number + " ");
        if (number == n){
            return;
        }
        recursion(number + 1, n);
    }
}
