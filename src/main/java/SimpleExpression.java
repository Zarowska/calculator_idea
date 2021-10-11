import java.util.Objects;

public final class SimpleExpression implements Expression {

    private final Operator operator;
    private final Expression left;
    private final Expression right;

    public SimpleExpression(Operator operator, Expression left, Expression right) {
        this.operator = operator;
        this.left = left;
        this.right = right;

    }

    @Override
    public double calculate() {
      return operator.operate(left.calculate(),right.calculate());
     }

}
