public class RomanNumerals {
  public static String convert(int number) {
      String roman = "";
    if (number == 0) {
      return "";
    }
    else if (number == 5) {
      return "V";
    }
    for (int i = 0; i < number; i++) {
      roman += "I";
    }
      return roman;
  }
}
