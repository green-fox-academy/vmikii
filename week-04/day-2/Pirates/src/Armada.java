import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Armada {
    String name;
    List<Ship> ships;

    Armada (String name) {
        this.name = name;
        ships = new ArrayList<>();
        fillArmada();
    }

    public boolean war(Armada otherArmada) {
        while (this.ships.size() != 0 && otherArmada.ships.size() != 0) {

            if (this.ships.get(0).battle(otherArmada.ships.get(0))) {
                otherArmada.ships.remove(0);
            }
            else {
                this.ships.remove(0);
            }
        }
        return (otherArmada.ships.size() == 0);
    }

    private void fillArmada() {
        Random rnd = new Random();
        int numOfShips = rnd.nextInt(4);
        numOfShips++;
        for (int i = 0; i < numOfShips; i++) {
            ships.add(new Ship());
        }
    }
}
