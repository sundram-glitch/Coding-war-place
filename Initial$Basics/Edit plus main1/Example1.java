class Example1 
{
	  static int a =m1();

	  static int m1(){
		  System.out.print("sv :a");
		  return 10;
	  }
	  static {
		  System.out.print("sb");
	  }
public static void main(String []args){
	System.out.print("MAIN");
	System.out.print("sb"+a);
}
}