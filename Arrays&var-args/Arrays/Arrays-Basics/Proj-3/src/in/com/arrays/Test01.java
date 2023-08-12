package in.com.arrays;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		int a[]=new int[100];int n,i;
		Scanner scanOf=new Scanner(System.in);
		System.out.println("Enter integer between 1-100");
		 System.out.println((n=scanOf.nextInt()));
		 System.out.println("Enter "+n+""+" integer");
		 for(i=0;i<n;i++)
		 a[i]=scanOf.nextInt();
		 System.out.println("Elements are");
		 for(i=0;i<n;i++)
		 System.out.println("a["+i+"]"+a[i]);
         scanOf.close();
	}

}
