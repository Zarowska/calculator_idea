
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;

public class Parser {
    private static List<OperationParser> parsers = createListOperationParser();

    public static List<OperationParser> createListOperationParser() {
        List<OperationParser> parsers = new ArrayList<>();
        //OperationParser opOp = new OperationParser("?");
        OperationParser opPlus = new OperationParser("+");
        OperationParser opMinus = new OperationParser("-");
        OperationParser opMul = new OperationParser("*");
        OperationParser opDiv = new OperationParser("/");
        //parsers.add(opOp);
        parsers.add(opPlus);
        parsers.add(opMinus);
        parsers.add(opMul);
        parsers.add(opDiv);

        return parsers;
    }


    public static Expression splitStringByOperation(String expression) {

        for (OperationParser parser : parsers) {
            //System.out.println("splitStringByOperation parser");
            if (parser.matches(expression)) {
                //System.out.println("splitStringByOperation if");
                Expression left = parser.parseLeft(expression, parser);
                Expression right = parser.parseRight(expression, parser);
                return new SimpleExpression(parser.toString(), left, right);
            }
            //else {
            //	System.out.println("splitStringByOperation else");
            //}
        }

        return new NumberExpression(expression);
    }

//	public Expression splitStringByOperationOld(String expression, String operation) {
//		Pattern compiledPattern = Pattern.compile("\\" + operation);
//		Matcher matcher = compiledPattern.matcher(expression);
//		if (matcher.find()) {
//			String leftPart = expression.substring(0, matcher.start());
//			String rightPart = expression.substring(matcher.end(), expression.length());
//			Expression left = splitStringByOperationOld(leftPart, "+" );
//			Expression right = splitStringByOperationOld(rightPart, "+" );
//			return new SimpleExpression(operation, left, right);
//		}
//
//
//		String operationPlus = "+";
//		Pattern compiledPatternPlus = Pattern.compile("\\" + operationPlus);
//		Matcher matcherPlus = compiledPatternPlus.matcher(expression);
//		if (matcherPlus.find()) {
//			String leftPart = expression.substring(0, matcherPlus.start());
//			String rightPart = expression.substring(matcherPlus.end(), expression.length());
//			Expression left = splitStringByOperationOld(leftPart, "+" );
//			Expression right = splitStringByOperationOld(rightPart, "+" );
//			return new SimpleExpression(operationPlus, left, right);
//		}
//
//		String operationMinus = "-";
//		Pattern compiledPatternMinus = Pattern.compile("\\" + operationMinus);
//		Matcher matcherMinus = compiledPatternMinus.matcher(expression);
//		if (matcherMinus.find()) {
//			String leftPart = expression.substring(0, matcherMinus.start());
//			String rightPart = expression.substring(matcherMinus.end(), expression.length());
//			Expression left = splitStringByOperationOld(leftPart, "+" );
//			Expression right = splitStringByOperationOld(rightPart, "+" );
//			return new SimpleExpression(operationMinus, left, right);
//		}
//
//		String operationMultiplicat = "*";
//		Pattern compiledPatternMultiplicationSign = Pattern.compile("\\" + operationMultiplicat);
//		Matcher matcherMultiplicationSign = compiledPatternMultiplicationSign.matcher(expression);
//		if (matcherMultiplicationSign.find()) {
//			String leftPart = expression.substring(0, matcherMultiplicationSign.start());
//			String rightPart = expression.substring(matcherMultiplicationSign.end(), expression.length());
//			Expression left = splitStringByOperationOld(leftPart, "+" );
//			Expression right = splitStringByOperationOld(rightPart, "+" );
//			return new SimpleExpression(operationMultiplicat, left, right);
//		}
//
//		String string = "/";
//		Pattern compiledPatternDivisionSign = Pattern.compile("\\" + string);
//		Matcher matcherDivisionSign = compiledPatternDivisionSign.matcher(expression);
//		if (matcherDivisionSign.find()) {
//			String leftPart = expression.substring(0, matcherDivisionSign.start());
//			String rightPart = expression.substring(matcherDivisionSign.end(), expression.length());
//			Expression left = splitStringByOperationOld(leftPart, "+" );
//			Expression right = splitStringByOperationOld(rightPart, "+" );
//			return new SimpleExpression(string, left, right);
//		}
//
//		return new NumberExpression(expression);
//	}

}
