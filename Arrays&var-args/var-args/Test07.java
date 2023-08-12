import java.util.Scanner;
class Example07{
	static void add(int... a){
    if(a.length==0){
    System.out.println("Values are not passed");
	}
	else{
    int sum=0;
	for (int i=0;i<a.length ;i++ ){
		sum+=a[i];
	}
	System.out.println("Result:"+sum);
	}
    
	}
}
public class Test07{
	public static void main(String[] args){
		System.out.println("Hello World!");
		Scanner scn=new Scanner(System.in);
	System.out.println("How many values you want inputs:");
	int noOfValues=scn.nextInt();
	int[] inputValues=new  int[noOfValues];
	for (int i=0;i<noOfValues ;i++ ){
		System.out.println("Enter num"+(i+1)+":");
	 inputValues[i]=scn.nextInt();
	}
	Example07.add(inputValues);
	}
}
