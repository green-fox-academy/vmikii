import java.util.Scanner;
public class Square
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        for (int i = 0; i < a; i++)
        {
            if (i == 0 || i == (a - 1))
            {
                for (int k = 0; k < a; k++)
                    System.out.print("%");
                System.out.println();
            }
            else
            {
                System.out.print("%");
                for (int j = 0; j < (a - 2); j ++)
                    System.out.print(" ");
                System.out.println("%");
            }
        }
    }
}
