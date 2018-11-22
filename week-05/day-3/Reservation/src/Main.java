import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Reservation> todaysReservations = new ArrayList<>();
    for (int i = 0; i < 8; i++) {
      todaysReservations.add(new Reservation());
      System.out.println(todaysReservations.get(0).toString());
    }

  }
}
