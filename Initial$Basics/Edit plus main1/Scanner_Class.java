import java.util.Scanner;
class  Scanner_Class{
	public static void main(String[] args){
	System.out.println("start of main!");
	Scanner scn=new  Scanner(System.in);
	System.out.println("Enter a value!");
	int it=scn.nextInt();
	System.out.println(it);
	System.out.println("Enter a value!");
	String is=scn.nextLine();
	System.out.println(is);
	}
}
