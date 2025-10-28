import java.util.regex.*;

public class Main1 {
    public static void main(String[] args) {
        String text = "Java;Python, C++  Rust|Go";
        String[] words = text.split("[,;|\\s]+"); // делим по любому разделителю
        for (String w : words) {
            System.out.println(w);
        }
    }
}
