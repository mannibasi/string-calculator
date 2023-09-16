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

        String[] numbersArray = numbers.split("[,\n]");
        int sum = 0;
        for (String number : numbersArray) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
