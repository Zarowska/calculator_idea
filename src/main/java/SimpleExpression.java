import java.util.Objects;

public final class SimpleExpression implements Expression {

    private final String operator;
    private final Expression left;
    private final Expression right;

    public SimpleExpression(String operator, Expression left, Expression right) {
        this.operator = operator;
        this.left = left;
        this.right = right;

    }

    @Override
    public double calculate() {

        if (Objects.equals(operator, "+")) {
            return left.calculate() + right.calculate();
        }
        if (Objects.equals(operator, "-")) {
            return left.calculate() - right.calculate();
        }
        if (Objects.equals(operator, "*")) {
            return left.calculate() * right.calculate();
        }
        if (Objects.equals(operator, "/")) {
            return left.calculate() / right.calculate();
        }
        throw new UnsupportedOperationException(operator);
    }

}
