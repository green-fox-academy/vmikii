public class String3 {
  public static void main(String[] args) {
    System.out.println(separate("whjwbek"));
  }
  public static String separate(String s) {
    if (s.charAt(s.length() - 2) != '*')
      return separate(s.replaceFirst("" , "*"));
    return s;
  }
}
