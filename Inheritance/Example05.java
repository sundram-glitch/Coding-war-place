import java.util.Scanner;
class Example05 {
	public static void main(String[] args){
		Example04 e1=new Example04();
		System.out.println("e1 object is created and initialized");
		Example04 e2=new Example04(x,y);
		System.out.println("e2 Object is created and initialized");
//C00necting to keyword
Scanner scn=new Scanner(System.in);
//Reading x and y values dynamically
System.out.println("Enter x value");
int x=scn.nextInt();
System.out.println("Enter y value");
int y=scn.nextInt();
  // Example04 e3=new Example04(x,y);
   //Reading x and y value from keyboard
  // System.out.println("Enter x value");
  // x=scn.nextInt();
 //  System.out.println("Enter y value");
  // y=scn.nextInt();
		System.out.println("the end!");
	}
}
