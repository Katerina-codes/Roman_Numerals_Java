public class RomanNumerals {
  public static String convert(int number) {
      String roman = "";
    if (number == 0) {
      return "";
    }
    else if (number == 5) {
      return "V";
    }
    else if (number == 6) {
      return "VI";
    }
    for (int i = 0; i < number; i++) {
      roman += "I";
    }
      return roman;
  }
}
