

public class ExponentiationOperator implements Operator  {

    @Override
    public  double operate(double left, double right) {

        return Math.pow(left, right);
    }

    @Override
    public String asString() {

        return "^";
    }
}
