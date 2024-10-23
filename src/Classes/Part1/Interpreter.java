package Classes.Part1;
import Interfaces.Part1.Expression;
import java.util.Stack;
public class Interpreter {

    public static int evaluate(String expression) {
        Stack<Expression> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i].trim();

            // Если токен — это оператор
            if (token.equals("+") || token.equals("-")) {
                Expression right = stack.pop();

                // Проверка, что следующий токен — число
                if (i + 1 >= tokens.length) {
                    throw new IllegalArgumentException("Expected a number after operator " + token);
                }

                Expression left = new NumberExpression(Integer.parseInt(tokens[++i].trim()));
                stack.push(new OperationExpression(right, left, token.charAt(0)));
            } else if (!token.isEmpty()) {
                try {
                    stack.push(new NumberExpression(Integer.parseInt(token)));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Invalid number format: " + token);
                }
            }
        }
        return stack.pop().interpret();
    }
}
