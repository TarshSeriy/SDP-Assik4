package Classes.Part1;
import Interfaces.Part1.Expression;
public class OperationExpression implements Expression {
    private Expression left;
    private Expression right;
    private char operator;

    public OperationExpression(Expression left, Expression right, char operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public int interpret() {
        switch (operator) {
            case '+':
                return left.interpret() + right.interpret();
            case '-':
                return left.interpret() - right.interpret();
            default:
                System.out.println("Invalid operator found: [" + operator + "]");
                throw new UnsupportedOperationException("Operator not supported: " + operator);
        }
    }
}
