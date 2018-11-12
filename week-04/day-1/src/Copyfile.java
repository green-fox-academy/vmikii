import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Copyfile {
    public static void main(String[] args) {
        Path source = Paths.get("source.txt");
        System.out.println(CopyFile(source));
    }
    public static boolean CopyFile (Path fileName){
        Path dest = Paths.get("dest.txt");
        try {
            List<String> s = Files.readAllLines(fileName);
            Files.write(dest, s);
        } catch (Exception e) {
            System.out.println("-" + e.toString());
            return false;
        }

        return true;
    }
}
