package CalculatorTesting;

import Calculator.StringCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {


    @Test
    public void testDelimiterOfAnyLength() {
        StringCalculator calc = new StringCalculator();
        assertEquals(400, calc.add("//[@][)]\n321@23)56"));
        assertEquals(907, calc.add("//[^^][&&&]\n34^^87&&&786"));
        assertEquals(162, calc.add("//[--][::][!@]\n76--54::2322!@32"));
    }


}
