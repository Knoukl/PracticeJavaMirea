package practice8;

public class Task4 {
    public static void recursion(int number, int k, int s) {
        int length = String.valueOf(number).length();
        if (length == k) {
            int sum = 0;
            int n = number;
            while (n > 0) {
                sum += n % 10;
                n = n / 10;
            }
            if (sum == s) {
                System.out.println(number);
            }
        }
        if (length <= k) {
            recursion(number + 1, k, s);
        }
        else {
            return;
        }
    }
}
