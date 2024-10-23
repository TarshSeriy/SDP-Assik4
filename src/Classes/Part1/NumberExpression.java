package Classes.Part1;
import Interfaces.Part1.Expression;

public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number){
        this.number = number;
    }

    @Override
    public int interpret(){
        return this.number;
    }
}
