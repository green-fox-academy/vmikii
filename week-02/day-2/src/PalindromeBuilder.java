import java.util.Scanner;
public class PalindromeBuilder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(CreatePalindrome(sc.next()));

    }
    static String CreatePalindrome(String s)
    {
        String rev = new StringBuffer(s).reverse().toString();
        return s + rev;
    }
}
