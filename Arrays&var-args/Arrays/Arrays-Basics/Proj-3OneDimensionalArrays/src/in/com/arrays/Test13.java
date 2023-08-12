//Bubble Sort->asc/desc
package in.com.arrays;

import java.util.Scanner;
public class Test13 {
	public static void main(String[] args) {
    Scanner scanf=new Scanner(System.in);
    int i,j,k,size,temp;
    System.out.println("Enter Arrays Size");
    int arr01[]=new int[size=scanf.nextInt()];
    System.out.println("Enter "+arr01.length+" Elemenets");
	for ( i = 0; i < arr01.length; i++)
	arr01[i]=scanf.nextInt();//separate forloop
	for (j = 0; j < arr01.length-1; j++) {
		for ( k = 0; k <arr01.length-j-1; k++) {//Bubble Sort from 0 To n,0 To n-1,o To n-2,o To n-3,o To n-4........
			if (arr01[k]>arr01[k+1]) {
				temp=arr01[k];
				arr01[k]=arr01[k+1];
				arr01[k+1]=temp;
			}//if
		}//Inner fOrloop
	}//Outer For loop
	for (int l = 0; l < arr01.length; l++) {
		System.out.print(arr01[l]+" ");
	}//seprate forloop
	scanf.close();
	}
}