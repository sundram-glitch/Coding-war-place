class Super {
   void Sample() {
      System.out.println("method of super class");
   }
}

public class Sub extends Super {
   void Sample() {
      System.out.println("method of sub class");
   }
   
   public static void main(String args[]) {
      Super obj =(Super) new Sub(); obj.Sample();
   }
}

