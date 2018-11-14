public class DiceSet {
  // You have a `DiceSet` class which has a list for 6 dices
// You can roll all of them with roll()
// Check the current rolled numbers with getCurrent()
// You can reroll with reroll()
// Your task is to roll the dices until all of the dices are 6
  int[] dices = new int[6];

  public int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }

  public void getCurrent() {
    for (int i = 0; i < dices.length; i++) {
      System.out.print(dices[i]);
    }
    System.out.println();
  }

  public int getCurrent(int i) {
    return dices[i];
  }

  public void reroll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
  }

  public void reroll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }

  public boolean all6() {
    int db = 0;
    for (int i = 0; i < dices.length; i++) {
      if (dices[i] == 6) {
        db ++;
      }
    }
    return (db == dices.length);
  }

  public static void main(String[] args) {
    DiceSet diceSet = new DiceSet();
    diceSet.getCurrent();
    diceSet.roll();
    diceSet.getCurrent();

    do {
      for (int i = 0; i < diceSet.dices.length; i++) {
        if (diceSet.dices[i] != 6) {
          diceSet.reroll(i);
          diceSet.getCurrent();
        }
      }
    } while (!diceSet.all6());
//      diceSet.getCurrent();
//    diceSet.getCurrent(5);
//    diceSet.reroll();
//    diceSet.getCurrent();
//    diceSet.reroll(4);
//    diceSet.getCurrent();
  }
}
