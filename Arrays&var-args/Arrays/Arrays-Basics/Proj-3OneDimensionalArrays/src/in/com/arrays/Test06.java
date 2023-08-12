package in.com.arrays;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
    Scanner scanf=new Scanner(System.in);
    System.out.println("Enter an integer");
	int n=scanf.nextInt();
	int arr[]=new int[n];
	int count,j;
    System.out.println("Enter "+n+" Integers");
	for (int r = 0; r < arr.length; r++) 
	arr[r]=scanf.nextInt();
	for (int i = 0; i < arr.length; i++) {
	for (count =0, j = 1; j <=arr[i]; j++) {
			if(((arr[i]%j)==0)) {
				count++;
		    }
	}
	if(count==2)System.out.println(arr[i]+" is Prime No");
	}	
	}
}
