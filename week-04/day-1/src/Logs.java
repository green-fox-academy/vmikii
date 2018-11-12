import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class Logs {
    public static void main(String[] args) {
        Path log = Paths.get("log.txt");
        List<String> logs = new ArrayList<>();
        try {
            logs = Files.readAllLines(log);
        } catch (Exception e) {
            System.out.println("off");
        }
        System.out.println(IpAdresses(logs));
        System.out.println(GetPost(logs));
    }

    public static List<String> IpAdresses (List<String> logs) {
        List<String> ips = new ArrayList<>();
        for (String s : logs) {
            ips.add(s.substring(27,39));
//            ips.add(s.split(" ")[8]);
        }
        return ips;
    }
    public static List<String> GetPost (List<String> logs) {
        List<String> ips = new ArrayList<>();
        for (String s : logs) {
            ips.add(s.split(" ")[11]);
        }
        return ips;
    }
}
