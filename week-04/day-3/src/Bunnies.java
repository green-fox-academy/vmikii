public class Bunnies {
  public static void main(String[] args) {
    System.out.println(ears(6));
  }
  public static int ears(int bunnies) {
    if (bunnies == 0) {
      return 0;
    }
    if (bunnies % 2 == 0) {
      return 2 + ears(bunnies - 1);
    }
    else {
      return 3 + ears(bunnies - 1);
    }
  }
}
