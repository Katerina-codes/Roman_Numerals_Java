public class RomanNumerals {

  public static String convert(int number) {
    String roman = "";
    int[] arabic_numbers = {10, 5, 4, 1};
    String[] roman_numerals = {"X", "V", "IV", "I"};

    for (int i = 0; i < arabic_numbers.length; i++ ) {
      while (number >= arabic_numbers[i]) {
        number -= arabic_numbers[i];
        roman += roman_numerals[i];
      }
    }
    return roman;
  }
}
