import java.io.File;
import java.nio.file.Files;

public class Fibonacci {
  public static void main(String[] args) {
    System.out.println(FibIdx(8));
  }
  public static int FibIdx(int n) {
    if (n == 0) {
      return 0;
    }
    else if (n == 1) {
      return 1;
    }
    else {
      return FibIdx(n - 1) + FibIdx(n -2);
    }
  }
}
