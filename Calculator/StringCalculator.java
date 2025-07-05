package Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StringCalculator {

    int callCount=0;
    public int add(String numbers) {
        callCount++;

        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        String delimiter = ",|\n";

        // custom delimiter: //[delimiter]\n
        if (numbers.startsWith("//")) {
            int newlineIndex = numbers.indexOf("\n");

            String delimiterSection = numbers.substring(2, newlineIndex);
            if (delimiterSection.startsWith("[") && delimiterSection.endsWith("]")) {
                delimiter = Pattern.quote(delimiterSection.substring(1, delimiterSection.length() - 1));
            } else {
                delimiter = Pattern.quote(delimiterSection); // support single-char delimiters too
            }

            numbers = numbers.substring(newlineIndex + 1);
        }

        String[] parts = numbers.split(delimiter);
        int sum = 0;
        List<Integer> negatives = new ArrayList<>();

        for (String part : parts) {
            int num = Integer.parseInt(part.trim());

            if (num < 0) {
                negatives.add(num);
            } else if (num <= 1000) {
                sum += num;
            }
        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("negatives not allowed: " + negatives.toString().replaceAll("[\\[\\]]", ""));
        }

        return sum;
    }


}
