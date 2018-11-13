import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    List<Pirate> Pirates;
    Pirate captain;

    Ship () {
        Pirates = new ArrayList<>();
        fillShip();
    }

    private void fillShip() {
        Random rnd = new Random();
        int numOfPirates = rnd.nextInt(15);
        numOfPirates++;
        for (int i = 0; i < numOfPirates; i++) {
            Pirates.add(new Pirate());
        }
        captain = new Pirate();
    }

    public void currentState() {
        System.out.println("Captain rums: " + captain.numberOfDrinks + " / " + "State: " + captain.state);
        System.out.println("Alive pirates in crew: " + piratesAlive());
    }
    private int piratesAlive() {
        int db = 0;
        for (Pirate p : Pirates) {
            if (p.state.equals("alive")) {
                db++;
            }
        }
        return db;
    }

    public int currentScore() {

        return captain.numberOfDrinks * piratesAlive();
    }

    public boolean battle(Ship otherShip) {
        if (this.currentScore() > otherShip.currentScore()) {
            otherShip.randomDie();
            return true;
        }
        else {
            this.randomDie();
            return false;
        }
    }
    private void randomDie() {
        Random rnd = new Random();
        int c = rnd.nextInt(Pirates.size());
        for (int i = 0; i < c; i++) {
            Pirates.get(0).die();
        }
    }
}
