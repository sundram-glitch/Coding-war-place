import java.util.Scanner.nextLine;
class Test12
{
	public static void main(String[] args) 
	{
		 Example11 e1=new Example11();
		 System.out.println("e1 object is created and initialized\t");

		 Example11 e2=new Example11();
         System.out.println("e2 object is created and initialized\t");
         //connecting to keyboard
		 Scanner scn=new Scanner(System.in);
		 //Reading value x and y value 
		 System.out.println("\nEnter x value");
		 int x=scn.nextInt();
		 System.out.println("Enter y value");
		 int y=scn.nextInt();
         //Reading value a and b value 
		 Scanner scn=new Scanner(System.in);
		 //Connecting to keyboard
		 System.out.println("\nEnter a value");
		 String a=scn.nextLine();
		 System.out.println("Enter b value");
		 String b=scn.nextLine();

		 Example11 e3=new Example11(x,y);
		 System.out.println("e3 object is created and initialized");
		 //reading x and y from new object or another object
		 System.out.println("\nEnter x value:");
		 x=scn.nextInt();
		 System.out.println("Enter y value");
		 y=scn.nextInt();
		
		 Example11 e4=new Example11(x,y);
		  //reading a and b from new object or another object
		 System.out.println("\nEnter a value:");
		 a=scn.nextLine();
		 System.out.println("Enter b value");
		 b=scn.nextLine();
		 /* System.out.println("\n e1 object value");
		 System.out.println("e1 object values ");
		 System.out.println("e1.x\t:-"+e1.x);*/

	}
}

