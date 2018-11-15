public class Counter {
  public static void main(String[] args) {
    counter(7);
  }
  public static int counter(int n) {
    if (n >= 1) {
      System.out.println(n);
      return counter(n - 1);
    }
    System.out.println(0);
    return 0;
  }
}
