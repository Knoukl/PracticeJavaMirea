import practice8.Task4;

public class Main4 {
    public static void main(String[] args){
        int k = 3;
        int s = 10;
        System.out.println("Вот ваши " + k + "-значные числа с суммой цифр " + s);
        Task4.recursion(1, k, s);
    }
}
