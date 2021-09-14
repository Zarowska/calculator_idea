
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OperationParser {

    private final Pattern compiledPattern;

    public OperationParser(String operation) {
        compiledPattern = Pattern.compile("\\" + operation);
    }

    public boolean matches(String expression) {
        //    ...
        return false;
    }

    public Expression parseLeft(String expression, OperationParser oParser) {
        Pattern compiledPattern = Pattern.compile("\\" + oParser);
        Matcher matcher = compiledPattern.matcher(expression);
        String leftPart = expression.substring(0, matcher.start());
        Expression left = Parser.splitStringByOperation(leftPart);
        return left;
    }

    public Expression parseRight(String expression, OperationParser oParser) {
        Pattern compiledPattern = Pattern.compile("\\" + oParser);
        Matcher matcher = compiledPattern.matcher(expression);
        String rightPart = expression.substring(matcher.end(), expression.length()); //?
        Expression right = Parser.splitStringByOperation(rightPart);
        return right;
    }
}



