import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class TicTacToe {
    public static void main(String[] args) {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }

    public static String ticTacResult(String fileName) {
        Path filePath = Paths.get(fileName);
        try {
            List<String> s = Files.readAllLines(filePath);
            for (String sor : s) {
                if (sor.contains("OOO")) {
                    return "O";
                }
                else if (sor.contains("XXX")) {
                    return "X";
                }
            }

        } catch (Exception e) {

        }

        return "";
    }

//    public static int XO (char[] s) {
//
//    }
}
