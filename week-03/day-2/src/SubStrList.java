import java.util.ArrayList;

public class SubStrList
{
    public static void main(String[] args)
    {
        ArrayList<String> searchArr = new ArrayList<>();
        searchArr.add("this");
        searchArr.add("is");
        searchArr.add("what");
        searchArr.add("I'm");
        searchArr.add("searching");
//        searchArr.add("");
        System.out.println(SubStrList("ching", searchArr));
        System.out.println(SubStrList("not", searchArr));

    }
    static int SubStrList(String s, ArrayList<String> arrList)
    {
        int foundindex = -1;
//        int i = 0;
        for (int i = 0; i < arrList.size(); i ++)
        {
            if (arrList.get(i).contains(s))
                return i;
        }
        return foundindex;
//        while (!arrList.get(i).contains(s) && arrList.get(i) != "")
//        {
//            i++;
//        }
//        if (arrList.get(i) != "")
//            return i;
//        else
//            return -1;
    }
}
