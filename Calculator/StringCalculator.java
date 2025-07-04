package Calculator;

public class StringCalculator {

    public int add(String numbers){

        String[] parts = numbers.split(",");

        int sum = 0;
        for (String part : parts) {
            sum += Integer.parseInt(part.trim());
        }

        return sum;
    }

}
