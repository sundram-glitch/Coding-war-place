interface i1{
	public abstract void m1();
}
interface i2{
abstract void m1();
  
}
class C implements i1,i2{
public  void m1(){
		System.out.println("class C ");
 }

	public static void main(String[] args) 
	{
		i1 o=new C();
		o.m1();
		System.out.println("Hello World!");
	}
}
