import java.util.ArrayList;
import java.util.List;

public class App {



    public static void main(String[] args) {

        List<Operator> supportedOperation = new ArrayList<>();
        supportedOperation.add(new PlusOperator()) ;
        supportedOperation.add(new MinusOperator());
        supportedOperation.add(new MultiplyOperator());
        supportedOperation.add(new DivideOperator());
        supportedOperation.add(new ExponentiationOperator());

        Parser parser = new Parser(supportedOperation);


//        String  expression0 = Reader.read();
//        Expression e0 = parser.splitStringByOperation(expression0);
//        double r0 = e0.calculate();
//       System.out.println(r0);

        String expression = "-1";
        Expression expressionParsed = parser.splitStringByOperation(expression);
        double result = expressionParsed.calculate();
        System.out.println("-1= " +  result);

        expression = "-1+1";
        expressionParsed = parser.splitStringByOperation(expression);
        result = expressionParsed.calculate();
        System.out.println("0 = " + result);

        expression = "2*2+1";
        expressionParsed = parser.splitStringByOperation(expression);
        result = expressionParsed.calculate();
        System.out.println("5= " + result);

        expression = "1+0*2-10*2/5+2";
        expressionParsed = parser.splitStringByOperation(expression);
        result = expressionParsed.calculate();
        System.out.println("-1= " + result);

        expression = "1+0*2-10*2/5+2+5/2-3*3+2/3";
        expressionParsed = parser.splitStringByOperation(expression);
        result = expressionParsed.calculate();
        System.out.println("-6,8(3) = " + result);


        expression = "2^3";
        expressionParsed = parser.splitStringByOperation(expression);
        result = expressionParsed.calculate();
        System.out.println("8 " + result);

        expression = "1-2^3";
        expressionParsed = parser.splitStringByOperation(expression);
        result = expressionParsed.calculate();
        System.out.println("-7= " + result);

        expression = "-2^3";
        expressionParsed = parser.splitStringByOperation(expression);
        result = expressionParsed.calculate();
        System.out.println("-8= " + result);
    }
}
