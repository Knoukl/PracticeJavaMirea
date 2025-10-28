package practice8;

public class Task3 {
    public static void recursion(int a, int number, int b){
        if (number != b){
            if (a < b){
                System.out.println(number + " ");
                number += 1;
            }
            if (a > b){
                System.out.println(number + " ");
                number -= 1;
            }
        }
        else {
            return;
        }
        recursion(a, number, b);
    }
}
