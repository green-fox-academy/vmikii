import java.util.Scanner;
public class ParametrikAverage
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Hány db számnak kell az összege és átlaga?");
        int a = reader.nextInt();

        int[] b = new int[a];
        for (int i = 0; i < a;i++)
        {
            System.out.print((i + 1) + ": ");
            b[i] = reader.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < b.length; i++)
        {
            sum+=b[i];
        }
        System.out.println("sum: " + sum);

        double avg = sum / b.length;
        System.out.println("average " + avg);
    }
}
