//assign element at specified position
package in.com.arrays;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {

	Scanner scanf=new Scanner(System.in);
    int n,l,i,j,ele,pos;
    System.out.println("Enter ArraySize ");
  	int arr01[]=new int[n=scanf.nextInt()];
	System.out.println("Enteer  Elements");
	for (i = 0; i <n; i++)
		arr01[i]=scanf.nextInt();
	
	//Coping element in new Doubled sized array
	int arr02[]=new int[n];
	for ( j = 0; j < n; j++) {
		arr02[j]=arr01[j];
	}
	System.out.println();
	//printing all values
	for (int k = 0; k < arr02.length; k++) {
		System.out.print(arr02[k]+" ");
	}
	System.out.println();
	System.out.println("Enter Element and Position");
	ele=scanf.nextInt();
	pos=scanf.nextInt();
	//swap elements to next occurrences position then assign specified element
	for ( l = arr02.length-1; l >=pos; l--) 
		arr02[l]=arr02[l-1];
	arr02[l]=ele;
	//printing final  all arrays elements
	for (int k = 0; k < arr02.length; k++) {
		System.out.print(arr02[k]+" ");
	}
	scanf.close();
	}
}
