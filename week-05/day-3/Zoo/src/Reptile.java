public class Reptile extends Animal {
  Reptile(String name) {
    this.name = name;
    this.numberOFLegs = 5;
    this.skin = "scale";
  }

  @Override
  public String breed() {
    return "laying eggs";
  }
}
