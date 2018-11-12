import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {
        ReversedOrderDecrypt("reversedorder.txt");
    }

    public static void ReversedOrderDecrypt (String fileName) {
        Path filePath = Paths.get(fileName);
        List<String> newLines = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); i++) {
                newLines.add(lines.get(lines.size()-i-1));
            }
            Path filePath3 = Paths.get("new-file3.txt");
            Files.write(filePath3, newLines);
        } catch (Exception e) {
            System.out.println("off" + e.toString());
        }
    }
}
