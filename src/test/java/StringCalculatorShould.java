import org.junit.jupiter.api.Test;
import org.katas.StringCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorShould {
    @Test
    public void return_0_when_input_is_empty() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }
}
