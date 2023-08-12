import java.util.Scanner.nextLine;
class  Example11
{
	int x;
	int y;
	String a;
	String b;

	Example11(){
		//read value dynamically either kb/file/db
		Scanner scn=new Scanner (System.in);
		System.out.println("\n Enter x value:");
		this.x=scn.nextInt();
		System.out.println("\n Enter y value:");
		this.y=scn.nextInt();
	}
	Example11(int x,int y){
		this.x=x;
		this.y=y;
	}
	Example11(String a,String b){
		this.a=a;
		this.b=b;
	}
}
