public class RomanNumerals {

  public static String convert(int number) {
    String roman = "";
    int[] arabic_numbers = {10};
    String[] roman_numerals = {"X"};

    for (int i = 0; i < arabic_numbers.length; i++ ) {
      while (number >= arabic_numbers[i]) {
        number -= arabic_numbers[i];
        roman += roman_numerals[i];
      }
    }
    while (number >= 5) {
      number -= 5;
      roman += "V";
    }

    while (number < 4 && number > 0) {
      number -= 1;
      roman += "I";
    }
    return roman;
  }
}
