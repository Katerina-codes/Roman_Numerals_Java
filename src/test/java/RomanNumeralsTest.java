import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

  @Test
  public void convertsZero() {
    assertEquals("", RomanNumerals.convert(0));
  }

  @Test
  public void convertsOne() {
    assertEquals("I", RomanNumerals.convert(1));
  }

  @Test
  public void convertsTwo() {
    assertEquals("II", RomanNumerals.convert(2));
  }

  @Test
  public void convertsFive() {
    assertEquals("V", RomanNumerals.convert(5));
  }
}
