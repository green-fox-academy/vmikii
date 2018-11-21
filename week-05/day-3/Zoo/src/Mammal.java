public class Mammal extends Animal{
  Mammal(String name) {
    this.name = name;
    this.numberOFLegs = 4;
    this.skin = "fur";
  }

  @Override
  public String breed() {
    return "pushing miniature versions out";
  }
}
