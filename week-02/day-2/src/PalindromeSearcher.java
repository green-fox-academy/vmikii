import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import java.util.Arrays;

public class PalindromeSearcher
{
    public static void main(String[] args) {
        String str = new String("dog goat dad duck doodle never");                  //Bemenet
        String str3 = new String("tot dog goat dad duck doodle never toot");
        String str2 = new String("apple");
        String str4 = new String("racecar");

        System.out.println(SearchPalindrome((str)));                                    //Kiírás
        System.out.println(SearchPalindrome((str2)));
        System.out.println(SearchPalindrome((str3)));
        System.out.println(SearchPalindrome((str4)));

//        String[] string = SearchPalindrome(str).split("/");
//        String s = SearchPalindrome(str);
//        System.out.println(Arrays.toString(string));
//        String[] a = SearchPalindrome2(str);
//        for (int i = 0; i < a.length; i++)
//        {
//            System.out.println(a[i].toString());
//        }
    }

    static String SearchPalindrome(String s)
    {
        char[] sarr = s.toCharArray();                                 //input string into char array
        String result = new String("[/");
        for (int i = 0; i < sarr.length - 2; i++)                      //minden karakterre megnézem, hogy előfordul-e a tömbben mégegyszer
        {
            int j = i + 1;
            while (sarr[i] != sarr[j] && j <= sarr.length - 2)         //addig megyek amíg nem találok olyat, mint az aktuális karakter
            {
                j++;
            }
            if ((i + j) % 2 == 0)                                      //ha páratlan a betűk száma
            {
                int left = i;
                int right = j;
                while (sarr[left] == sarr[right] && left != right)     //kétoldalról bejárom amí megegyeznek a betűk, és a két index össze nem ér
                {
                    left++;
                    right--;
                }
                if (right - left == 0)                                 //ha az előző ciklus-ból azért lépek ki, mert a betűk megegyeztek
                {
                    for (int k = i; k <= j; k ++)                      //akkor hozzáfűzöm a stringhez
                    {
                        result += sarr[k];
                    }
                    result += "/";
                }
            }
            else                                                      //ha páros számú a betűk száma
            {
                if ((j - i) >= 2)                                     //és legalább 3 betűből áll
                {
                    int left = i;
                    int right = j;
                    while (sarr[left] == sarr[right] && left < right)         //kétoldalról bejárás a két középső betűig, addíg amíg a betűk megegyeznek
                    {
                        left++;
                        right--;
                    }
                    if (left - right == 1)                             //ha az előző ciklus-ból azért lépek ki, mert a betűk megegyeztek
                    {
                        for (int k = i; k <= j; k ++)
                        {
                            result += sarr[k];
                        }
                        result += "/";
                    }
                }
            }
        }
        return result + "]";                                              //visszaadom az összefűzött stringet

        /*char temp;
        for (int i = 25;i < sarr.length - 3; i++)
        {
            temp = sarr[i];                                           //eltárolom az akt elemet
            int j = i;
            while (sarr[j + 1] != temp && j < sarr.length - 2)        //adig megyek amig nem találok egy ugyanolyan char
            {
                j++;
            }

            if (j - i  >= 0)                                         //akt elem és talált közti vizsgálat
            {
                int bal = i + 1;
                int jobb = j;
                while (sarr[bal] == sarr[jobb] && bal < jobb)        //"dog goat dad duck doodle never"
                {
                    jobb--;
                    bal++;
                }
                if (bal == jobb)
                {
                    result += " ";
                    for (int k = i; k <= j + 1; k++)
                    {
                        result += sarr[k];
                    }
                }
            }
        }*/
    }

    static String[] SearchPalindrome2(String s) {
        char[] sarr = s.toCharArray();
        int db = 0;
        String asd[] = new String[15];
        for (int i = 0; i < sarr.length - 2; i++) {
            int j = i + 1;
            while (sarr[i] != sarr[j] && j <= sarr.length - 2) {
                j++;
            }
            int left = i;
            int right = j;
            while (sarr[left] == sarr[right] && left != right || sarr[left] == sarr[right] && left < right)
            {
                left++;
                right--;
            }
            if (right - left == 0)
            {
                int y = 0;
                for (int k = i; k <= j; k++)
                {
                    asd[db] += sarr[k];
                }
                db++;
            }
            else if (left - right == 1)
            {
                int y = 0;
                for (int k = i; k <= j; k++)
                {
                    asd[db] += sarr[k];
                }
                db++;
            }
//            if ((i + j) % 2 == 0)      //ha páratlan számú a betűk száma
//            {
//                int left = i;
//                int right = j;
//                while (sarr[left] == sarr[right] && left != right) {
//                    left++;
//                    right--;
//                }
//                if (right - left == 0) {
//                    int y = 0;
//                    for (int k = i; k <= j; k++) {
//                        asd[y] += sarr[k];
//                    }
//                    asd[y] += "/";
//                    y++;
//                }
//            } else                      //ha paros számú a betűk száma
//            {
//                if ((j - i) >= 2) {
//                    int left = i;
//                    int right = j;
//                    while (sarr[left] == sarr[right] && left < right) {
//                        left++;
//                        right--;
//                    }
//                    if (left - right == 1) {
//                        int y = 0;
//                        for (int k = i; k <= j; k++) {
//                            asd[y] += sarr[k];
//                        }
//                        y++;
//                        asd[y] += "/";
//                    }
//                }
//            }
        }
        return asd;
    }
}
