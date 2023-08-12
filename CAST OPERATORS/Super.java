class Super{
 void m1() {
      System.out.println("method of super class");
   }
    public static void main(String args[]) {
    //Super obj = new Super(); cls cc
	Super obj= new Sub();
      Sub sub = (Sub) obj;
	   sub.m1();
	   obj.m2();
   }
    void m2() {
      System.out.println("method of super class");
      m1();
   }
}
class Sub extends Super {
 void m1() {
      System.out.println("method of sub class");
 }
}