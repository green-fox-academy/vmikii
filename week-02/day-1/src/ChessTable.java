public class ChessTable
{
    public static void main(String[] args)
    {
        for (int i = 0; i <= 7; i++)
        {
            if (i % 2 != 0)
            {
                System.out.println();
                System.out.print(" ");
            }
            else
            {
                System.out.println();
            }
            for (int j = 0; j <= 4; j++)
            {
                System.out.print("% ");
            }

        }
    }
}
