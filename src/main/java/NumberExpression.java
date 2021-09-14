

public final class NumberExpression implements Expression {

    private final String number;

    public NumberExpression(String number) {
        this.number = number;
    }

    @Override
    public double calculate() {
        return Double.parseDouble(number);
    }

}
