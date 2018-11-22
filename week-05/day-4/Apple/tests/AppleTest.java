import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
  String string = "apple";
  Apple apple = new Apple();

  @Test
  public void testApple() {
    assertEquals(string, apple.getApple());
  }
}
