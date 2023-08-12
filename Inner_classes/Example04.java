class Example04 
{
	static class A
	 {
	   static int a=10;
		int x=20;
	/* private*/ int y=30;
	 }
}
class Sample
	     {
		 public static void main(String []args){
			 System.out.println("a:"+Example04.A.a);

			 Example04.A a1=new Example04.A();

			 System.out.println("X:"+a1.x);
			 System.out.println("Y:"+a1.y);
			 
	 }
	
	}
