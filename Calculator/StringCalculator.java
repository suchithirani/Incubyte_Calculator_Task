package Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    int callCount=0;

    public int add(String numbers) {
        callCount++;

        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        String delimiterRegex = ",|\n"; // default

        if (numbers.startsWith("//")) {
            int newlineIndex = numbers.indexOf("\n");
            String delimiterSection = numbers.substring(2, newlineIndex);

            List<String> delimiters = new ArrayList<>();

            // Case 1: Multiple delimiters like //[***][%%]
            if (delimiterSection.startsWith("[") && delimiterSection.contains("]")) {
                Matcher matcher = Pattern.compile("\\[(.*?)]").matcher(delimiterSection);
                while (matcher.find()) {
                    delimiters.add(Pattern.quote(matcher.group(1)));
                }
            } else {
                // Case 2: Single-char delimiter like //;\n
                delimiters.add(Pattern.quote(delimiterSection));
            }

            delimiterRegex = String.join("|", delimiters);
            numbers = numbers.substring(newlineIndex + 1);
        }

        String[] parts = numbers.split(delimiterRegex);
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

    public int getCalledCount() {
        return callCount;
    }
}
