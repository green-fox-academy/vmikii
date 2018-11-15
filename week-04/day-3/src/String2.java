public class String2 {
  public static void main(String[] args) {
    System.out.println(removeX("xxsefcxewx"));
  }
  public static String removeX(String s ) {
    if (s.contains("x"))
      return removeX(s.replaceFirst("x", ""));
    return s;
  }
}
