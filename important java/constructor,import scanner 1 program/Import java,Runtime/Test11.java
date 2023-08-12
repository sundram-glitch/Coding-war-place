import java.util.Scanner;
class Example10
{  
	 int x;
	 int y;

	 Example10(){
//Read value dynamically either kb/file/db

Scanner scn=new Scanner (System.in);
     
	System.out.println("\n Enter x value:");
    this.x=scn.nextInt();
	System.out.println("\n Enter y value:");
	this.y=scn.nextInt();

	 }
	 Example10(int x,int y){
		 this.x=x;
		 this.y=y;
	 }
}
    class Test11
    {
	public static void main(String[] args) 
	{
		Example10 e1=new Example10();
		System.out.println("e1 object is created and initialized");

		Example10 e2=new Example10();
		System.out.println("e2 object is created and initialized");
		
		//connecting to keyboard
		Scanner scn=new Scanner(System.in);
         
		//reading x and y values
		System.out.println("\nEnter x value:");
		int x=scn.nextInt();//Declare variable value

		System.out.println("Enter y value:");
		int y=scn.nextInt();//Declare variable value

		Example10 e3 =new Example10(x,y);
		System.out.println("e3 object is created and initialized:");
		//reading x and y value for another object 
		System.out.println("\n Enter X value :");
		x=scn.nextInt();

		System.out.println("Enter y value :");
        y=scn.nextInt();

		Example10 e4=new Example10(x,y);
		System.out.println("e4 object is created and initialized");
        x=scn.nextInt();
        y=scn.nextInt();
		System.out.println("\ne1 object values");
		System.out.println(" "+e1.x+"   "+e1.y);

	}
}
