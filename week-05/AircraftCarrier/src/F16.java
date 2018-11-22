public class F16 extends  Aircraft {
  F16() {
    super();
    dmg = 30;
  }
  public int refill(int amount) {
    ammo += 8;
    return amount - 8;
  }
}
