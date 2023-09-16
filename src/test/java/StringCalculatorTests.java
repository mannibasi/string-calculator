import org.junit.jupiter.api.Test;
import org.katas.StringCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTests {
    @Test
    public void return_0_when_input_is_empty() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void return_4_when_input_is_4() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(4, stringCalculator.add("4"));
    }

    @Test
    public void return_3_when_input_is_1_2() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    public void return_3_when_input_is_1_2_with_new_line_separator() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1\n2"));
    }

    @Test
    public void return_45_when_input_is_1_2_3_4_5_6_7_8_9() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(45, stringCalculator.add("1,2,3,4,5,6,7,8,9"));
    }

    @Test
    public void return_6_when_input_is_1_2_3_with_mixed_delimiters() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.add("1\n2,3"));
    }
}