import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ExponentiationOperatorTest {

  @Test
  public void  exponentiationOfPositiveNumbers() {
    ExponentiationOperator testClass = new ExponentiationOperator();
    assertEquals(1,testClass.operate(1,1),0);
    assertEquals(9,testClass.operate(3,2),0);
    assertEquals(8,testClass.operate(2,3),0);
  }

  @Test
  public void  exponentiationOfNegativeNumbers() {
    ExponentiationOperator testClass = new ExponentiationOperator();
    assertEquals(-1,testClass.operate(-1,1),0);
    assertEquals(9,testClass.operate(-3,2),0);
    assertEquals(-8,testClass.operate(-2,3),0);
  }
}
