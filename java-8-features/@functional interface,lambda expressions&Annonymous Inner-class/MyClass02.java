@FunctionalInterface
interface StringFunction {
  String run(String str);
  //String run(String str);
}

public class MyClass02 {
  public static void main(String[] args) {
    StringFunction exclaim = s -> s + "!"; 
    StringFunction ask = (s) -> s + "-";
	StringFunction to= s -> s + "?"; 
    printFormatted("Hey",exclaim);
    printFormatted("Hello",ask);
	System.out.println(to.run("how are you"));
  }
  public static void printFormatted(String str, StringFunction format) {
    String result = format.run(str);
    System.out.println(result);
  }
}