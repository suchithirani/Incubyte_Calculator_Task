package CalculatorTesting;

import Calculator.StringCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {


    @Test
    public void testAddNumbersWithCalledCounter() {
        StringCalculator calc = new StringCalculator();
        assertEquals(0, calc.getCalledCount());

        // After 1 call
        calc.add("15,78");
        assertEquals(1, calc.getCalledCount());

        // After 2nd call
        calc.add("89");
        assertEquals(2, calc.getCalledCount());
    }

}
