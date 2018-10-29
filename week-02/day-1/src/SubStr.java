public class SubStr
{
    public static void main(String[] args)
    {
        System.out.println(SubString("This is what I'm searching in","searching"));
        System.out.println(SubString("this is what I'm searching in","asd"));
    }

    public static int SubString(String input, String q)
    {
        if (!input.contains(q))
            return -1;
        else
        {
            char[] Input = input.toCharArray();
            char[] Q = q.toCharArray();
            int j = 0;
            int i = 0;
            while (Input[i] != Q[j] || Input[i + Q.length - 1] != Q[Q.length - 1])
            {
                i++;
            }
            return i;

        }
    }
}
