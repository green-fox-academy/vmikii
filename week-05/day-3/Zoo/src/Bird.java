public class Bird extends Animal {
  Bird(String name) {
    this.name = name;
    this.numberOFLegs = 2;
    this.skin = "feather";
  }

  @Override
  public String breed() {
    return "laying eggs";
  }
}
