package org.katas;

import java.util.Arrays;

public class StringCalculator {
    private String delimiters = "[,\n]";

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        }

        String[] numbersArray = numbers.split(this.delimiters);
        return Arrays.stream(numbersArray)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
