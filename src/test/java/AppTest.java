import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }


//    expression = "-1+1";
//    expressionParsed = parser.splitStringByOperation(expression);
//    result = expressionParsed.calculate();
//        System.out.println("0 = " + result);

    @Test
    public void example1(){
        Parser parser = new Parser(App.createSupportedOperation());
        assertEquals(0,parser.splitStringByOperation("1-1").calculate(),0);
    }
}
