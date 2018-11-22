public class Tree extends Plant{
  Tree(String color, int waterAmount) {
    super(color, waterAmount);
    needsWatering = (waterAmount < 10);
  }
  public void Water(int water) {
    waterAmount += 0.4*water;
    needsWatering = (waterAmount < 10);
  }
}
