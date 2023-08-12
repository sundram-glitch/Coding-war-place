//Sum of arrays eg:{5,10,15,20,25}=75
package in.com.arrays;

import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
    Scanner scanf=new Scanner(System.in);
		int arr[],i,sum=0;
	System.out.println("Enter AArrays size");
	arr=new int[scanf.nextInt()];
	System.out.print("Enter Arr size elements :");
    for (i = 0; i < arr.length; i++) {
		arr[i]=scanf.nextInt();
	}
    System.out.println();
    System.out.print("sum :");
    for (int j = 0; j < arr.length; j++) {
		sum+=arr[j];
		System.out.print(sum+" ");
	}
    scanf.close();
	}
}
