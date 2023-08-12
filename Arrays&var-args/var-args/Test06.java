// for '...' we can pass values either in direct values format or array like: new int[]{1,2...} format 
//but in '[]' symbol we can not pass normal values like m1(3,4....) like this we have to pass m1(new int[]{9,34,......});
import java.util.Scanner;
class Example06{
	static void add(int... a){
		if(a.length==0){
          System.out.println("Values are not  passed");
		}
		else {
			int sum=0;
		for (int i=0;i<a.length ;i++ ){
			sum=sum+a[i];
		}
		System.out.println("Result:"+sum);
       }
	}
}
public class Test06{
	public static void main(String[] args){
		System.out.println("Hello World!");
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter num1:");
	int n1=scn.nextInt();
    System.out.println("Enter num2:");
	int n2=scn.nextInt();
	System.out.println("Enter num3:");
	int n3=scn.nextInt();
	Example06.add(n1,n2,n3);
	}
}
