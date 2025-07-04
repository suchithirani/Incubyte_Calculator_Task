package CalculatorTesting;

import Calculator.StringCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {


    @Test
    public void testAddNumbersWithNewlinesAndCommas() {
        StringCalculator calc = new StringCalculator();
        assertEquals(256, calc.add("//$\n98$70$56\n$32"));
    }

}
