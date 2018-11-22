import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        int a = rnd.nextInt(10);

        System.out.println("Guess the number");
        Rek(a);

    }

     public static void Rek(int a)
    {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if (b > a)
        {
            System.out.println("lower");
            Rek(a);
        }
        else if (b < a)
        {
            System.out.println("higher");
            Rek(a);
        }
        else
            System.out.println("You found: " + a);
    }
}
