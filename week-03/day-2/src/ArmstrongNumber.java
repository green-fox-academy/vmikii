import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int a = str.length();
        int db = 0;
        for (int i = 0; i < a; i++)
        {
            db += Math.pow(Character.getNumericValue(arr[i]),a);
        }
        String s = "";
        s += db;
        if (str.equals(s))
            System.out.println(str + " is armstrong");
        else
            System.out.println(str + " is not armstrong");


    }
}
