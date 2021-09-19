public class App {

    public static void main(String[] args) {
        Parser parser = new Parser();
        String  expression0 = Reader.read();
        Expression e0 = parser.splitStringByOperation(expression0);
        double r0 = e0.calculate();
       System.out.println(r0);


//        String expression = "-1";//?
//        Expression e = parser.splitStringByOperation(expression);
//        double r = e.calculate();
//        System.out.println("1= " +  r);
//
//        expression = "-1+1";//?
//        e = parser.splitStringByOperation(expression);
//        r = e.calculate();
//        System.out.println("0 = " + r);
//
//        expression = "2*2+1";
//        e = parser.splitStringByOperation(expression);
//        r = e.calculate();
//        System.out.println("5= " + r);
//
//        expression = "1+0*2-10*2/5+2";
//        e = parser.splitStringByOperation(expression);
//        r = e.calculate();
//        System.out.println("-1= " + r);

//        expression = "1+0*2-10*2/5+2+5/2-3*3+2/3";
//        e = parser.splitStringByOperation(expression);
//        r = e.calculate();
//        System.out.println("-6,8(3) = " + r);
    }
}
