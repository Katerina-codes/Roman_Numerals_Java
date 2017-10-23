import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void convertsZero() {
        assertEquals("", RomanNumerals.convert(0));
    }
}
