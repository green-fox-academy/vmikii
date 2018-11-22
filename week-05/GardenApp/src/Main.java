public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden();
    garden.addPlant(new Flower("yellow", 0));
    garden.addPlant(new Flower("blue", 0));
    garden.addPlant(new Tree("orange", 0));
    garden.addPlant(new Tree("purple", 0));
    garden.info();
    garden.water(40);
    garden.info();
    garden.water(40);
    garden.info();
  }
}
