class Example14 
{
	 static{
		 System.out.println("Outer class is loaded");
	 }
	 Example14(){
		 System.out.println("Outer class constructor");
	 }
	  class W
	 {
		/* static {
			 System.out.println("Inner class is loaded");
		 }*/
		 
		W(){
			 System.out.println("Inner class constructor");
		 }
		/* static */void m1(){
			 System.out.println("Inner class SM");
		 }
		 void m2(){
			 System.out.println("Inner class NSM");
		 }
	 }

     static void m3(){
		 System.out.println("Outer static method");
	 }
	 void m4(){
		 System.out.println("Outer NSM method");
	 }

    public static void main(String[]args){
		System.out.println("Inner class main");
		    Example14.m3();
		Example14 e=new Example14();
			e.m4();
		
		Example14.W w=new Example14().new W();
		w.m2();
	}
}