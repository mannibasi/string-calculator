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

        if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        }

        if (numbers.startsWith(CUSTOM_DELIMITER_MARKER)) {
            setDelimiters(numbers.substring(CUSTOM_DELIMITER_MARKER.length(), numbers.indexOf("\n")));
            return add(numbers.substring(numbers.indexOf("\n") + 1));
        }

        String[] numbersArray = numbers.split(this.delimiters);
        return Arrays.stream(numbersArray)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
