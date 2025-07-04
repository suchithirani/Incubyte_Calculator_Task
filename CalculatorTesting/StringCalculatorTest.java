package CalculatorTesting;

import Calculator.StringCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {


    @Test
    public void testAddTwoNumbers() {
        StringCalculator calc = new StringCalculator();
        assertEquals(147, calc.add("69,78"));
    }
}
