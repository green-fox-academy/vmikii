public class Plant {
  String color;
  boolean needsWatering;
  double waterAmount;

  Plant(String color, int waterAmount) {
    this.color = color;
    this.waterAmount = waterAmount;
  }

  public void Water(int water) {
    waterAmount += water;
  }
}
