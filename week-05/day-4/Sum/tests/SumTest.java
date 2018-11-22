import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
  int sum = 10;
  List<Integer> numbers = new ArrayList<>();

  @Test
  public void testSum() {
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    Sum s = new Sum();
    assertEquals(sum, s.sum(numbers));
  }

  @Test
  public void testEmptySum() {
    Sum s = new Sum();
    assertEquals(sum, s.sum(numbers));
  }
  @Test
  public void testOneElement() {
    Sum s = new Sum();
    numbers.add(10);
    assertEquals(sum, s.sum(numbers));
  }
  @Test
  public void testWith0() {
    Sum s = null;
    try {
      assertEquals(sum, s.sum(numbers));
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }
}
