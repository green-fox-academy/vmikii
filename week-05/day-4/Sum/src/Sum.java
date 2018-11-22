import java.util.ArrayList;
import java.util.List;

public class Sum {

  List<Integer> numbers;

  Sum() {
    numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
  }

  public int sum(List<Integer> numbers) {
    int sum = 0;
    for (Integer num : numbers) {
      sum += num;
    }
    return sum;
  }
}
