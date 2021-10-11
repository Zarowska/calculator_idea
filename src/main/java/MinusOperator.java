public class MinusOperator implements Operator {
    @Override
    public double operate(double left, double right) {
        return left-right;
    }

    @Override
    public String asString() {
        return "-";
    }
}
