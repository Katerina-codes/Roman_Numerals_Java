public class RomanNumerals {

  public static String convert(int number) {
    String roman = "";

    if (number == 10) {
      number -= 10;
      roman += "X";
    }
    else if (number >= 5) {
      number -= 5;
      roman += "V";
    }

    for (int i = 0; i < number; i++) {
      roman += "I";
    }
    return roman;
  }
}
