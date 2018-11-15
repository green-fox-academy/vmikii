public class String1 {
  public static void main(String[] args) {
    System.out.println(lowerXtoY("asdxXexxxxxxxxxxx"));
  }
  public static String lowerXtoY(String s) {
    if (s.contains("x"))
      return lowerXtoY(s.replaceFirst("x", "y"));
    return s;
  }
}
