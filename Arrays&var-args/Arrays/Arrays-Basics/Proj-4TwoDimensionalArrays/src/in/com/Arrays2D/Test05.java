package in.com.Arrays2D;

import java.util.Scanner;

public class Test05 {

     public static void main(String[] args) {
	 Scanner scanf=new Scanner(System.in);
    	 int arr[][]=null,nr,nc,r,c;
	 System.out.print("Enter 2D Matrix :");
	 nr = scanf.nextInt();nc=scanf.nextInt();
	 if(nr!=0&nc!=0)
		 arr=new  int[nr][nc];
	 System.out.print("Enter "+(nr*nc)+" Elements : ");
	 for (int i= 0; i < arr.length; i++) {
		for (int j = 0; j < nc; j++) 
			arr[i][j]=scanf.nextInt();
	}
		 for (int i = 0; i < arr.length; i++) { 
			 System.out.print("\t");
			 for (int j = 0; j < nc; j++) 
			 System.out.print(arr[i][j]+"  ");
		 System.out.println();	
	 }
		 System.out.println();
		 System.out.println("Transpose Of Matrix (T') : ");
	 for (int j = 0; j < nc; j++) { 
		 System.out.print("\t");
		 for (int i = 0; i < arr.length; i++) 
			 System.out.print(arr[i][j]+"  ");
		 System.out.println();	
	 }
  }	
}