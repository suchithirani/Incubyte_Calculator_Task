package CalculatorTesting;

import Calculator.StringCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void testAddSingleNumber() {
        StringCalculator calc = new StringCalculator();
        assertEquals(15, calc.add("15"));
    }
}
