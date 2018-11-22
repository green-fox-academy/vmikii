import java.util.Arrays;
public class Anagram {

  String input1;
  String input2;

  Anagram() {
    s1 = "cat";
    s2 = "act";
  }

  public boolean isAnagram(String input1, String input2) {
    String s1 = input1.replaceAll("\\s", "");
    String s2 = input1.replaceAll("\\s", "");

    boolean status = true;
    if (s1.length() != s2.length()) {
      status = false;
    } else {
      char[] s1Array = s1.toLowerCase().toCharArray();
      char[] s2Array = s2.toLowerCase().toCharArray();
      Arrays.sort(s1Array);
      Arrays.sort(s2Array);
      status = Arrays.equals(s1Array, s2Array);
    }
    if (status) {
      System.out.println("+");
    } else {
      System.out.println("-");
    }
    return status;
  }
}
