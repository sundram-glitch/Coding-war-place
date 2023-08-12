import java.util.ArrayList;

public class MyClass{
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    int n = numbers.stream().mapToInt(Integer::intValue).sum();
	System.out.println(n);
  }
}