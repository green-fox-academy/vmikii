public abstract class Plant {
  String color;
  double waterAmount;
  double waterLimit;

  Plant(String color, int waterAmount) {
    this.color = color;
    this.waterAmount = waterAmount;
  }

  public boolean needsWatering() {
    return waterAmount < waterLimit;
  }
  public String info() {
    return color +  " " + this.getClass().getName();
  }
}
