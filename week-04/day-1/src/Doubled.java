import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        DoubledDecrypt("duplicated-chars.txt");
    }

    public static void DoubledDecrypt (String fileName) {
        Path filePath = Paths.get(fileName);
        List<String> newLines = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (String s : lines) {
                String[] line = s.split("");
                String newLine = "";
                for (int i = 0; i < line.length; i+=2) {
                    newLine += line[i];
                }
                newLines.add(newLine);
            }
            Path filePath2 = Paths.get("new-file.txt");
            Files.write(filePath2, newLines);
        } catch (Exception e) {
            System.out.println("off");
        }

    }
}
