//Linear Search
package in.com.arrays;

import java.util.Scanner;

public class Test09{

	public static void main(String[] args) {
    int searchele,j;
    boolean flag=false;
    Scanner scanf=new Scanner(System.in);
    System.out.print("Ente Arrays Size");
	int arrsize=scanf.nextInt();
	int []arr=new int[arrsize];
	System.out.println("Enter "+arr.length+" Integers");
	for (int i = 0; i < arr.length; i++) {
		arr[i]=scanf.nextInt();
	}
	System.out.print("Enter Searched Element : ");
	searchele=scanf.nextInt();
	for (j = 0; j < arr.length; j++,flag=false) {
		if(searchele==arr[j])flag=true;
		if(flag)System.out.println(searchele+" found at index no "+j);
	}
	scanf.close();
	}
}