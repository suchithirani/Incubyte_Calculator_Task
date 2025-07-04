package Calculator;

public class StringCalculator {

    public int add(String numbers){
        if (!numbers.contains(",")) {
            return Integer.parseInt(numbers.trim());
        }

        // For future use (like two numbers)
        return -1;
    }

}
