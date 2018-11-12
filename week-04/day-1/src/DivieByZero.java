public class DivieByZero {
    public static void main(String[] args) {
        Divider(0);
    }
    public static void Divider (int a) {
        try {
            int result = 10/a;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("cant divide by zero !");
        }
    }
}
