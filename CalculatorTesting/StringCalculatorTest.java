package CalculatorTesting;

import Calculator.StringCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void testAddEmptyStringReturnsZero() {
        StringCalculator calc = new StringCalculator();
        assertEquals(0, calc.add(""));
    }
}
