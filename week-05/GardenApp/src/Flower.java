public class Flower extends Plant {
  Flower(String color, int waterAmount) {
    super(color, waterAmount);
    needsWatering = (waterAmount < 5);
  }
  public void Water(int water) {
    waterAmount += 0.75*water;
    needsWatering = (waterAmount < 5);
  }
}
