public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(numAdder(5));
  }
  public static int numAdder(int n) {
    if (n == 1) {
      return 1;
    }
    return n + numAdder(n - 1);
  }
}
