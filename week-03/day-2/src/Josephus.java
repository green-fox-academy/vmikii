import java.util.ArrayList;
import java.util.List;

public class Josephus {
    public static void main(String[] args) {
        System.out.println(Josephus(7, 2));

    }
    public static int Josephus(int n, int k){
        if (n == 1){
            return 1;
        }
        else{
            return (Josephus(n - 1, k) + k-1) % n + 1;
        }
    }
}
