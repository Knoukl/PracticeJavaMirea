import java.util.regex.*;


public class Main4 {
    public static void main(String[] args) {
        String regex = "\\d+(?!\\+)"; // цифра, за которой нет +
        String[] tests = {
                "(1 + 8) – 9 / 4",
                "6 / 5 – 2 * 9"
        };

        for (String text : tests) {
            Matcher matcher = Pattern.compile(regex).matcher(text);
            System.out.println("Текст: " + text);
            if (matcher.find()) {
                System.out.println("→ Есть цифра без знака +");
            } else {
                System.out.println("→ Все цифры сопровождаются знаком +");
            }
        }
    }
}
