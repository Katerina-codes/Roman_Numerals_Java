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
  public void convertsFour() {
    assertEquals("IV", RomanNumerals.convert(4));
  }

  @Test
  public void convertsFive() {
    assertEquals("V", RomanNumerals.convert(5));
  }

  @Test
  public void convertsSix() {
    assertEquals("VI", RomanNumerals.convert(6));
  }

  @Test
  public void convertsSeven() {
    assertEquals("VII", RomanNumerals.convert(7));
  }

  @Test
  public void convertsTen() {
    assertEquals("X", RomanNumerals.convert(10));
  }

  @Test
  public void convertsTwenty() {
    assertEquals("XX", RomanNumerals.convert(20));
  }
}
