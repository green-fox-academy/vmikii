import java.util.Scanner;
public class Diamond
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a - 1;
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                System.out.print("  ");
            }

            for (int k = a; k > b; k--)
            {
                System.out.print("%   ");
            }
            b--;
            System.out.println();
        }
        b = a - 1;
        for (int i = 0; i < a; i++)
        {
            for (int j = a; j > b; j--)
                System.out.print("  ");
            for (int j = 0; j < b;j++)
                System.out.print("%   ");
            b--;
            System.out.println();
        }
    }
}
