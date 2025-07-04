package CalculatorTesting;

import Calculator.StringCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {


    @Test
    public void testAddNumbersWithNewlinesAndCommas() {
        StringCalculator calc = new StringCalculator();
        assertEquals(1719, calc.add("105\n56,3,97\n5,890\n563"));
    }

}
