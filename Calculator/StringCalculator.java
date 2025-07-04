package Calculator;

import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        String delimiter = ",|\n";

        if (numbers.startsWith("//")) {
            int newlineIndex = numbers.indexOf("\n");
            delimiter = Pattern.quote(numbers.substring(2, newlineIndex));
            numbers = numbers.substring(newlineIndex + 1);
        }


        String[] parts = numbers.split(delimiter);

        int sum = 0;
        for (String part : parts) {
            sum += Integer.parseInt(part.trim());
        }

        return sum;
    }

}
