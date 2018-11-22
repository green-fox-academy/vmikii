import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        System.out.println(dominoes);
        System.out.println(Sort(dominoes));
        Collections.sort(dominoes);
        System.out.println(dominoes);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }

    static List<Domino> Sort(List<Domino> asd) {
        List<Domino> sorted = new ArrayList<>();
        sorted.add(asd.get(0));
        Domino temp = asd.get(0);
        for (int j = 0; j < asd.size(); j++) {
//            for (int i = 0; i < asd.size(); i++) {
//                if (temp.getRightSide() == asd.get(i).getLeftSide()) {
//                    temp = asd.get(i);
//                    sorted.add(temp);
//                }
//            }
            int i = 0;
            while (temp.getRightSide() != asd.get(i).getLeftSide() && sorted.size() != asd.size()) {
                i++;
            }
            if (sorted.size() == asd.size()) {
                break;
            }
            temp = asd.get(i);
            sorted.add(temp);
        }

        return sorted;
    }
}
