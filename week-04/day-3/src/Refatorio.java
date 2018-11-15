public class Refatorio {
  public static void main(String[] args) {
    System.out.println(refactorio(5));
  }
  public static int refactorio(int n) {
    if (n == 1) {
      return 1;
    }
    else {
      return n * refactorio(n - 1);
    }
  }
}
