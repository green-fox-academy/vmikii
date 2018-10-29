import java.util.Scanner;
public class MultipTable
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number!");
        int a = sc.nextInt();
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i + " * " + a + " = " + (i*a));
        }

    }
}
