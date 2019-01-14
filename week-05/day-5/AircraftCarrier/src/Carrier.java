import java.util.ArrayList;
import java.util.List;

public class Carrier {
  int ammoStorage;
  int hp;
  List<Aircraft> aircrafts;

  Carrier(int ammoStorage, int hp) {
    aircrafts = new ArrayList<>();
    this.hp = hp;
    this.ammoStorage = ammoStorage;
  }

  public void add(Aircraft aircraft) {
    aircrafts.add(aircraft);
  }

  public void fill( ) throws Exception {
    if (ammo == 0) {
      throw new Exception("0");
    }
    else {
      for (Aircraft aircraft : aircrafts) {
        aircraft.refill();
      }
    }
  }

}
