//Selection Sorting -> asc/desc
package in.com.arrays;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
    Scanner scanf=new Scanner(System.in);
		int i,j,k,size,temp;
	System.out.print("Enter arrays size : ");
	int []arr=new int[size=scanf.nextInt()];
	System.out.println();
    System.out.print("Enter "+arr.length+" Elements : ");
	for ( i = 0; i <arr.length;i++) arr[i]=scanf.nextInt(); 
	System.out.println();
	for ( j = 0; j < size-1; j++) {//till last - 2 occurance -> 5-2 -> 0-3 last occur as it is
	for ( k = j+1; k <arr.length; k++) {
		if(arr[j]>arr[k]) {//if(arr[j]<arr[k]) { //for descending
			temp=arr[j];
			arr[j]=arr[k];
			arr[k]=temp;
	   }
	}
	}System.out.println();
	System.out.println("Elements are : ");
	for (int l = 0; l < arr.length; l++) System.out.print(arr[l]+" ");
	}
}