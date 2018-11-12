import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {
    public static void main(String[] args) {
        EncodedDecrypt("encoded-lines.txt");
    }

    public static void EncodedDecrypt (String fileName) {
        Path filePath = Paths.get(fileName);
        List<String> newLines = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (String s : lines) {
                char[] line = s.toCharArray();
                String newLine = "";
                for (int i = 0; i < line.length; i++) {
                    if (line[i] != ' ') {
                        char value = line[i];
                        int nextValue = (int) value - 1;
                        newLine += (char) nextValue;
                    }
                    else {
                        newLine += line[i];
                    }

                }
                newLines.add(newLine);
            }
            Path filePath3 = Paths.get("new-file4.txt");
            Files.write(filePath3, newLines);
        } catch (Exception e) {
            System.out.println("off" + e.toString());
        }
    }
}
