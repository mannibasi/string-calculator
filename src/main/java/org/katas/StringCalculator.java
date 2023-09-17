package org.katas;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        }

        String[] numbersArray = numbers.split("[," + System.lineSeparator() + "]");
        return Arrays.stream(numbersArray)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
