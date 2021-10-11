public class PlusOperator implements Operator{

    public double operate(double left, double right) {
        return left+right;
    }

    @Override
    public String asString() {
        return "+";
    }
}
