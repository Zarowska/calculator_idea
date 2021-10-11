

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Parser {


    private final List<Operator> operations = new ArrayList<>();

    public Parser(List<Operator> supportedOperations) {
        operations.addAll(supportedOperations);
    }

    public Parser() {
    }

    public Expression splitStringByOperation(String expression) {
        for (Operator operation : operations) {
            Pattern compiledPattern = Pattern.compile( "\\d" + "\\" + operation.asString() + "\\d");
            int indexOfOperation = expression.indexOf(operation.asString());
            Matcher matcher = compiledPattern.matcher(expression);
            if (matcher.find()) {
                String leftPart = expression.substring(0, indexOfOperation );
                String rightPart = expression.substring(indexOfOperation+1);
                Expression left = splitStringByOperation(leftPart);
                Expression right = splitStringByOperation(rightPart);
                return new SimpleExpression(operation, left, right);
            }
        }

        return new NumberExpression(expression);
    }

}
