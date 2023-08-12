class Example03 
{
	static class A
	 {
	   static int a=10;
		int x=20;
	 private int y=30;
	 }
	/* static void m1(){
		 System.out.println("Inner clas SM m1")
			 ;
	 }
	 void m2(){
		 System.out.println("Inner class NSM m2");
	 }*/
	     class sample
	     {
		 public static void main(String []args){
			 System.out.println("a:"+Example03.A.a);

			 Example03.A a1=new Example03.A();

			 System.out.println("X:"+a1.x);
			// System.out.println("Y:"+a1.y);


	 }
	
	}
}
