package practice8;

public class Task1 {
    public static void recursion(int number, int printedCount, int n, int count){
        if (printedCount == n){
            return;
        }
        System.out.println(number + " ");

        if (count == number){
            recursion(number + 1, printedCount + 1, n, 1);
        }
        else {
            recursion(number, printedCount + 1, n, count + 1);
        }
    }
}
