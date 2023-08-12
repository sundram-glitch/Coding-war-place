package in.com.Arrays2D;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
	Scanner scanf=new Scanner(System.in);
	int r=0,c=0;
	System.out.println("Enter no of rowxcol matrix");
	int arr[][]= new int[r=scanf.nextInt()][c=scanf.nextInt()];
	System.out.println();
	System.out.println("Enter "+r*c+" Elements");
	
	for (int i = 0; i < arr.length; i++) {
	for (int j = 0; j < c; j++)
	arr[i][j]=scanf.nextInt();
	}
	
    for (int k = 0; k < arr.length; k++) {
		for (int l = 0; l < c; l++) 
			System.out.print(arr[k][l]+" ");
	
		System.out.println();
	}
  }
}
