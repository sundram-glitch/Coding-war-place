import java.util.*;
class Division{

	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		try{
		System.out.println("Enter value of a: ");
		int a = scn.nextInt();
		System.out.println("Enter value of a: ");
		int b = scn.nextInt();
        int c = a/b;
	    System.out.println("Result!"+c);
		}
		catch(ArrayIndexOutOfBoundsException alob){
			System.out.println("Please pass Atleast two integer values ");
		}
		catch(InputMismatchException ime){
			System.out.println("please pass only integer values ");
		}
		catch(ArithmeticException ae){
			System.out.println("Please do'nt pass second value as Zero ");
        }
	}

}
