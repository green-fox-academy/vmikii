public class SumDigit {
  public static void main(String[] args) {
    System.out.println(sumOfDigit(12639));
  }

  public static int sumOfDigit(int n) {
    if (n > 10) {
      return (n % 10) + sumOfDigit(n / 10);
    }
    return n;
  }
}
