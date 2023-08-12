//protected native Object  clone()  throws  CloneNotSupportedException
//native method means we can'nt see the logic its belongs to jvm level
//Once the A class become cloneable thier modification does not effect each other
class B implements Cloneable{
	int y;
	int cCount = 1;
 public B(){
   System.out.println("B Construct called"+cCount);
   cCount++;
 }
 @Override
 public B clone() throws CloneNotSupportedException{
	 return (B)super.clone();
 }
}
class A implements Cloneable{
	int x;
	B b;

	A(){
		System.out.println("Constructor");
    }
 
 @Override
 public A clone() throws CloneNotSupportedException{
   A a1 =(A)super.clone();
   a1.b=this.b.clone();
   return a1;
  }
}
public class Test02{
	public static void main(String[]args)throws CloneNotSupportedException{
		A a1=new A();
		a1.x=15;
		a1.b=new B();
		a1.b.y=18;
		a1.b.y=14;
		A a2=a1.clone();
	System.out.println(a1==a2);
    System.out.println();
	System.out.println(a1+" "+a1.x+" "+a1.b+" "+a1.b.y);
	System.out.println(a2+" "+a2.x+" "+a2.b+" "+a2.b.y);
    System.out.println(a1.x);
	System.out.println(a2.x);
	a1.x=17;
	a1.b.y=24;a2.b.y=22;
	System.out.println(a1+" "+a1.x+" "+a1.b+" "+a1.b.y);
	System.out.println(a2+" "+a2.x+" "+a2.b+" "+a2.b.y);
 }
}