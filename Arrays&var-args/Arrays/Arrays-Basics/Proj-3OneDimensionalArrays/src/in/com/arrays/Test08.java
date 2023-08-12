//Reverse Integers
package in.com.arrays;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
    Scanner scanf=new Scanner(System.in);
    int temp,arrsize;
    System.out.println("Enter ArraySize");
    arrsize=scanf.nextInt();
    int []arr=new int[arrsize];
    System.out.println("Enter "+arr.length+" Integers");
    for (int i = 0; i < arr.length; i++) {
    arr[i]=scanf.nextInt();
    }
    for(int i = 0; i < arrsize/2; i++) {
    //for one time only-> temp=arr[0]; a[0]=a[n-1]; a[n-1]=temp; 
    	temp =arr[i];//assign real value to temp 
	arr[i]=arr[arrsize-i-1];//assign last reverser value to arr[i]
	arr[arrsize-i-1]=temp;//assign temp to arr[arrsize-i-1]
	}System.out.print("Reversed Elements: ");
    for (int i = 0; i <arrsize; i++) {
	System.out.print(arr[i]+"\t");
	}
	scanf.close();
	}
}
/*
 *int a=10,b=20;
 *a+=b; b=a-b;
 *    a=a-b;
/*/