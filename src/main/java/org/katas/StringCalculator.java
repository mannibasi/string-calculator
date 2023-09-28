package org.katas;

import java.util.Arrays;

public class StringCalculator {
    private static final String CUSTOM_DELIMITER_MARKER = "//";

    public void setDelimiters(String delimiters) {
        this.delimiters = delimiters;
    }

    private String delimiters = "[,\n]";

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        if (numbers.startsWith(CUSTOM_DELIMITER_MARKER)) {
            setDelimiters(numbers.substring(CUSTOM_DELIMITER_MARKER.length(), numbers.indexOf("\n")));
            return add(numbers.substring(numbers.indexOf("\n") + 1));
        }

        String[] numbersArray = numbers.split(this.delimiters);

        int[] negativeNumbersArray = Arrays.stream(numbersArray)
                .mapToInt(Integer::parseInt)
                .filter(number -> number < 0).toArray();

        if (negativeNumbersArray.length > 0) {
            String negativeNumbers = Arrays.toString(negativeNumbersArray).replace("[", "").replace("]", "");
            throw new NegativesNotAllowedException("Negatives not allowed: " + negativeNumbers);
        }

        return Arrays.stream(numbersArray)
                .mapToInt(Integer::parseInt)
                .filter(number -> number <= 1000)
                .sum();
    }
}
