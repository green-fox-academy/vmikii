public class Aircraft {
  int ammo;
  int dmg;

  Aircraft() {
    ammo = 0;
  }
  public int fight() {
    int ammoleft = ammo;
    ammo = 0;
    return ammoleft * dmg;
  }

  public String getType() {
    return this.getClass().getName();
  }
  public String getStatus() {
    return "Type " + getType() + ", Ammo: " + ammo + ", Base dmg: " + dmg + ", All dmg: " + ammo*dmg;
  }
  public boolean isPriority() {
    if (this.getType().equals("F16")) {
      return false;
    }
    return true;
  }
  public void refill() {

  }
}
