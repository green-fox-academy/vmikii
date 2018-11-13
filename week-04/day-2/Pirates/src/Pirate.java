import java.util.Random;

public class Pirate {
    int numberOfDrinks;
    String state;

    Pirate() {
        numberOfDrinks = 0;
        state = "alive";
    }

    public void drinkSomeRum() {

        if (state.equals("asleep")){
            System.out.println("already asleep");
        }
        else if (state.equals("dead")) {
            System.out.println("already dead");
        }
        else {
            numberOfDrinks++;
        }
    }

    public void howsItGoingMate() {
        if (state.equals("asleep")){
            System.out.println("already asleep");
        }
        else if (state.equals("dead")) {
            System.out.println("already dead");
        }
        else {
            if (numberOfDrinks < 4) {
                System.out.println("Pour me anudder");
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                state = "asleep";
            }
        }
    }

    public void die() {
        state = "dead";
    }

    public void brawl(Pirate pirate) {
        Random rnd = new Random();
        int c = rnd.nextInt(2);

        if (pirate.state.equals("alive")) {
            if (c == 0) {
                this.state = "dead";
            }
            else if (c == 1) {
                pirate.state = "dead";
            }
            else {
                this.state = "asleep";
                pirate.state = "asleep";
            }
        }
    }
}
