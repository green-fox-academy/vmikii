import packagefortasks.Reservationy;

import java.util.Random;

public class Reservation implements Reservationy {
  private Random rnd() {
    Random rnd = new Random();
    return rnd;
  }
  public String getCodeBooking() {
    String code = "";
    for (int i = 0; i < 8; i++) {
      if (rnd().nextInt(2) == 1) {
        code += rnd().nextInt(9);
      }
      else {
        code += (char)(rnd().nextInt(26) + 'a');
      }
    }
    return code.toUpperCase();
  }
  public String getDowBooking() {
    String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    return days[rnd().nextInt(days.length)];
  }

  public String toString() {
    return"Booking# " + getCodeBooking() + " for " + getDowBooking();
  }
}
