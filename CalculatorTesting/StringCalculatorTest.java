package CalculatorTesting;

import Calculator.StringCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {


    @Test
    public void testAddNumbersGreaterThanThousandIgnore() {
        StringCalculator calc = new StringCalculator();
        assertEquals(45, calc.add("1986,45"));
    }

}
