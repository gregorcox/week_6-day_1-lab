import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() { calculator = new Calculator(); }

    @Test
    public void add() { assertEquals (4, calculator.add(2,2));}
}
