
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        // Примеры для тестирования
        String[] testExpressions = {
                "3 4 + 2 * 7 /", "2 3 + 4 5 * +", "5 1 2 + 4 * + 3 -", "1 2 + *", "2 0 /"
        };

        System.out.println("=== RPN Калькулятор ===");
        System.out.println("Доступные операции: +, -, *, /");

        // Тестируем выражения
        for (String expr : testExpressions) {
            System.out.println("Выражение: " + expr);
            try {
                double result = evaluateRpn(expr);
                System.out.println("Результат: " + result);
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
            System.out.println();
        }
    }

    private static double evaluateRpn(String expression) {
        Stack<Double> stack = new Stack<>();
        StringTokenizer tokens = new StringTokenizer(expression, " ");

        while (tokens.hasMoreTokens()) {
            String token = tokens.nextToken();

            try {
                // Пытаемся разобрать как число
                double number = Double.parseDouble(token);
                stack.push(number);
            } catch (NumberFormatException e) {
                // Если не число, то оператор
                if (isOperator(token)) {
                    processOperator(token, stack);
                } else {
                    throw new IllegalArgumentException("Неверный символ: " + token);
                }
            }
        }
        if (stack.size() != 1) {
            throw new IllegalArgumentException("Некорректное выражение. " +
                    "Ожидалось 1 элемент в стеке, но получено: " + stack.size());
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static void processOperator(String operator, Stack<Double> stack) {
        if (stack.size() < 2) {
            throw new IllegalArgumentException("Недостаточно операндов для операции " + operator);
        }
        double b = stack.pop();
        double a = stack.pop();
        double result;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Деление на ноль");
                }
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Неизвестная операция: " + operator);
        }
        stack.push(result);
    }
}