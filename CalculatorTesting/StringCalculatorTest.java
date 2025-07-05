package CalculatorTesting;

import Calculator.StringCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {


    @Test
    public void testDelimiterOfAnyLength() {
        StringCalculator calc = new StringCalculator();
        assertEquals(383, calc.add("//[@#&]\n98@#&82@#&203"));
        assertEquals(990, calc.add("//[petra]\n89petra901petra2398"));
    }


}
