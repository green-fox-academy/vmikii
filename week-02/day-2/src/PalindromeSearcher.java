public class PalindromeSearcher
{
    public static void main(String[] args)
    {
        String str = new String("dog goat dad duck doodle never");
        String str2 = new String("apple");
        System.out.println(SearchPalindrome((str)));

    }

    static String SearchPalindrome(String s)
    {
        char[] sarr = s.toCharArray();
        int db = 0;
        String asd = new String("[");
        char temp;
        for (int i = 25;i < sarr.length - 3; i++)
        {
            temp = sarr[i];                          //eltárolom az akt elemet
            int j = i;
            while (sarr[j + 1] != temp && j < sarr.length - 2)   //adig megyek amig nem találok egy ugyanolyan char
            {
                j++;
            }

            if (j - i  >= 0)                          //akt elem és talált közti vizsgálat
            {
                int bal = i + 1;
                int jobb = j;
                while (sarr[bal] == sarr[jobb] && bal < jobb)    //"dog goat dad duck doodle never"
                {
                    jobb--;
                    bal++;
                }
                if (bal == jobb)
                {
                    asd += " ";
                    for (int k = i; k <= j + 1; k++)
                    {
                        asd += sarr[k];
                    }
                }
            }
        }
        return asd + "]";
    }
}
