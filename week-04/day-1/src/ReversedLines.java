import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        ReversedDecrypt("reversedlines.txt");
    }

    public static void ReversedDecrypt (String fileName) {
        Path filePath = Paths.get(fileName);
        List<String> newLines = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (String s : lines) {
                String[] line = s.split("");
                String newLine = "";
                for (int i = 0; i < line.length; i++) {
                    newLine += line[line.length-i-1];
                }
                newLines.add(newLine);
            }
            Path filePath3 = Paths.get("new-file2.txt");
            Files.write(filePath3, newLines);
        } catch (Exception e) {
            System.out.println("off" + e.toString());
        }
    }
}
