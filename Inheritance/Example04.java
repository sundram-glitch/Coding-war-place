import java.util.Scanner;
class Example04{
	int x;
	int y;
	Example04(){
	//reading values dynamically either kb/file/db
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter x value");
	this.x=scn.nextInt();
	System.out.println("Enter y value");
	this.y=scn.nextInt();
	}
	Example04(int x,int y){
       this.x=x;
	   this.y=y;
	
	}
}
