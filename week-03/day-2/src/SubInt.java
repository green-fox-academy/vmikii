import java.util.ArrayList;

public class SubInt
{
    public static void main(String[] args)
    {

        System.out.println(SubInt(1, new int[] {1, 11, 34, 52, 61}));
        System.out.println(SubInt(9, new int[] {1, 11, 34, 52, 61}));
    }

    static ArrayList<Integer> SubInt(int a, int[] b)
    {
        String[] arr = new String[b.length];
        ArrayList<Integer> resultList = new ArrayList();
        String s = "";
        s += a;
        for (int i = 0; i < b.length; i++)
        {
            arr[i] += b[i];
            if (arr[i].contains(s))
            {
                resultList.add(i);
            }
        }
        return resultList;
    }
}
