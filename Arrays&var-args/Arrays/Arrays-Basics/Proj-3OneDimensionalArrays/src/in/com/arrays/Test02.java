package in.com.arrays;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		float  a[]=new float[100];float n,sub_sum=0.0f;
		int i=0;
		Scanner scanOf=new Scanner(System.in);
		 System.out.println("Enter integer between 1-100");
		 System.out.println((n=scanOf.nextFloat()));
		 System.out.println("Enter "+n+""+" integer");
		 for(i=0;i<n;i++) {
		 a[i]=scanOf.nextFloat();
		 sub_sum=sub_sum+a[i];
		 }
		 System.out.println(" Elememts sum: "+sub_sum+" Elements Mean: "+sub_sum/n);
         scanOf.close();
	}

}
