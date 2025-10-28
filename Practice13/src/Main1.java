import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("1. " + text);
        System.out.println("2. " + text.charAt(text.length()-1));
        System.out.println("3. " + text.endsWith("!!!"));
        System.out.println("4. " + text.startsWith("I like"));
        System.out.println("5. " + text.contains("Java"));
        System.out.println("6. " + text.lastIndexOf("Java"));
        System.out.println("7. " + text.replace("a", "o"));
        System.out.println("8. " + text.toUpperCase());
        System.out.println("9. " + text.toLowerCase());
        System.out.println("10. " + text.substring(7, 11));
    }
}