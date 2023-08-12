//protected native Object clone() throws CloneNotSupportedException

class A implements Cloneable{
 int x;
 A(){
		System.out.println("Constructor");
 }
 
 @Override
 public A clone() throws CloneNotSupportedException{
   return (A)super.clone();
  }
}
public class Test01{
	public static void main(String[]args)throws CloneNotSupportedException{
		A a1=new A();
		a1.x=15;
		A a2=a1.clone();
	System.out.println(a1==a2);
    System.out.println(a1.x);
	System.out.println(a2.x);
	a1.x=17;
	System.out.println(a1==a2);
    System.out.println(a1.x);
	System.out.println(a2.x);
	a2.x=18;
    System.out.println(a1.x);
	System.out.println(a2.x);

 }
}