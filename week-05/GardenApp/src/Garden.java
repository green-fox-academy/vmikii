import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> plants;

  Garden() {
    plants = new ArrayList<>();
  }
  private int howManyNeedsWater() {
    int db = 0;
    for (Plant plant : plants) {
      if (plant.needsWatering) {
        db++;
      }
    }
    return db;
  }
  public void water(int water) {
    System.out.println("Watering with " + water);
    int waterPerPlant = water / howManyNeedsWater();
    for (Plant plant : plants) {
      if (plant.needsWatering) {
        plant.Water(waterPerPlant);
      }
    }
  }
  public void addPlant(Plant plant) {
    plants.add(plant);
  }
  public void info() {
    for (Plant plant : plants) {
      if (plant.needsWatering) {
        System.out.println(plant.color + " " + plant.getClass().getName() + " needs water (" + plant.waterAmount + ")");
      }
      else {
        System.out.println(plant.color + " " + plant.getClass().getName() + " doesnt need water (" + plant.waterAmount + ")");
      }
    }
  }
}
