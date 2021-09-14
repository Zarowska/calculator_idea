

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {


    public Expression splitStringByOperation(String expression) {

        List<String> operations = new ArrayList<>();
        operations.add("+");
        operations.add("-");
        operations.add("*");
        operations.add("/");

        for (String operation : operations) {
            Pattern compiledPattern = Pattern.compile("\\" + operation);
            Matcher matcher = compiledPattern.matcher(expression);
            if (matcher.find()) {
                String leftPart = expression.substring(0, matcher.start());
                String rightPart = expression.substring(matcher.end());
                Expression left = splitStringByOperation(leftPart);
                Expression right = splitStringByOperation(rightPart);
                return new SimpleExpression(operation, left, right);
            }
        }

        return new NumberExpression(expression);
    }

}
