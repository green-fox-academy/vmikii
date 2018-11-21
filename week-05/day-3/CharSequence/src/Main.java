public class Main {
  public static void main(String[] args) {
    Gnirts g =new Gnirts("example");
    System.out.println(g.charAt(1));

    Shifter shifter = new Shifter("example", 2);
    System.out.println(shifter.charAt(0));
  }
}
