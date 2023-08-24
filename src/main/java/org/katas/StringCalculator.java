package org.katas;

import java.lang.reflect.Array;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        }

        String[] numbersArray = numbers.split(",");
        return Integer.parseInt(numbersArray[0]) + Integer.parseInt(numbersArray[1]);
    }
}
