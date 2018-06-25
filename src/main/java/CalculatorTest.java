import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() { calculator = new Calculator(); }

    @Test
    public void canAdd() { assertEquals (4, calculator.add(2,2));}

    @Test
    public void canSubtract() {
        assertEquals(4, calculator.subtract(7,3));
    }

    @Test
    public void canMultiply(){
        assertEquals(4, calculator.multiply(2,2));
    }

    @Test
    public void canDivide(){
        assertEquals(5, calculator.divide(10,2));
    }


}
