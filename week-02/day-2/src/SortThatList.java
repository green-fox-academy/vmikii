import java.util.Arrays;

public class SortThatList
{
    public static void main(String[] args)
    {
        System.out.println(Bubble(new int[] {34, 12, 24, 9, 5}));

        System.out.println(AdancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        System.out.println(AdancedBubble(new int[] {34, 12, 24, 9, 5}, false));
    }

    static String Bubble(int[] arr)
    {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j < (n - i); j++)
            {
                if (arr[j - 1] > arr[j])
                {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return Arrays.toString(arr);
    }

    static String AdancedBubble(int[] arr, boolean desc)
    {
        if (desc)
        {
            int n = arr.length;
            int temp = 0;
            for (int i = 0; i < n; i++)
            {
                for (int j = 1; j < (n - i); j++)
                {
                    if (arr[j - 1] < arr[j])
                    {
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        else
        {
            int n = arr.length;
            int temp = 0;
            for (int i = 0; i < n; i++)
            {
                for (int j = 1; j < (n - i); j++)
                {
                    if (arr[j - 1] > arr[j])
                    {
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        return Arrays.toString(arr);
    }
}
