package Calculator;

import java.util.ArrayList;
import java.util.List;
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
        List<Integer> negatives = new ArrayList<>();

        for (String part : parts) {
            int num = Integer.parseInt(part.trim());
            if (num < 0) {
                negatives.add(num);
            } else {
                sum += num;
            }
        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("negatives not allowed: " + negatives.toString().replaceAll("[\\[\\]]", ""));
        }

        return sum;
    }

}
