public class F35 extends  Aircraft{
  F35() {
    super();
    dmg = 50;
  }
  public int refill(int amount) {
    ammo += 12;
    return amount - 12;
  }
}
