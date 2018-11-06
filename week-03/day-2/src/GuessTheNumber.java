import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber
{
    public static void main(String[] args)
    {
        System.out.println("range:");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        System.out.println("lives:");
        Scanner sc2 = new Scanner(System.in);
        int lives = sc2.nextInt();

        Random rnd = new Random();
        int a = rnd.nextInt(range);

        System.out.println("Guess the number between 1-" + range + ". U have " + lives + " lives.");
        Guess(a, lives - 1);

    }
    static void  Guess(int number, int lives)
    {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if (lives > 0)
        {
            if (b > number)
            {
                System.out.println("lower, lives: " + lives + "(" + number + ")");
                Guess(number, --lives);
            }
            else if (b < number)
            {
                System.out.println("higher, lives: " + lives + "(" + number + ")");
                Guess(number, --lives);
            }
            else
                System.out.println("u won, the number was: " + number);
        }
        else if (number == b)
            System.out.println("u won, the number was: " + number);
        else
            System.out.println("u lost, the number was: " + number);
    }
}
