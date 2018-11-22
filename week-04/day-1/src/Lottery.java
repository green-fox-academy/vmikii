import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lottery {
    public static void main(String[] args) {
        LotteryNum("lottery.csv");

    }

    public static void LotteryNum(String fileName){
        Path filePath = Paths.get(fileName);
        try {
            List<String> source = Files.readAllLines(filePath);
            List<Integer> numbers = new ArrayList<>();
            for (String s : source) {
                String[] line = s.split("Ft;");
                System.out.println(line[4]);
                String[] l = line[4].split(";");
                for (int i = 0; i < l.length; i++) {
                    numbers.add(Integer.parseInt(l[i]));
                }
            }
            System.out.println(numbers);
        }
        catch (Exception e) {
            System.out.println("off");
        }
    }

}
