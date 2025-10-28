import java.util.regex.*;

public class Main2 {
    public static void main(String[] args) {
        String regex = "abcdefghijklmnopqrstuv18340";
        String[] tests = {
                "abcdefghijklmnopqrstuv18340",
                "abcdefghijklmnoasdfasdpqrstuv18340"
        };

        for (String s : tests) {
            System.out.println(s + " → " + s.matches(regex));
        }
    }
}
