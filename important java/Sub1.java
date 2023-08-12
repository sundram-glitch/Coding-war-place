class Super {
   void Sample() {
      System.out.println("method of super class");
   }
}

public class Sub1 extends Super {
   void Sample() {
      System.out.println("method of sub class");
   }

   public static void main(String args[]) {
      Super obj = new Sub1();
      Sub1 sub = (Sub1)obj;
	  sub.Sample();
   }
}