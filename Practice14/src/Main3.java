
import java.util.regex.*;
import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 44 ERR, 0.004 EU, 11.5 EUR, 100 RUR.";

        Pattern pattern = Pattern.compile("\\b\\d+(\\.\\d{1,2})?\\s?(USD|RUR|EUR)\\b");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Найденные цены:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
