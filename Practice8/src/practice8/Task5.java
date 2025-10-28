package practice8;

public class Task5 {
    public static int recursion(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        return recursion(n / 10, sum + n % 10);
    }
}
