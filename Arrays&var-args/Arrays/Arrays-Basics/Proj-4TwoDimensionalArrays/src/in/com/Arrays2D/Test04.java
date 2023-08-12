package in.com.Arrays2D;

import java.util.Scanner;

public class Test04 {
    static	int nr,nc,Trace;
	public static void main(String[] args) {
		Scanner scanf=new Scanner(System.in);
		int arr[][] = null;
		while(true) {
			System.out.println("Enter Square Matrix");
			nr=scanf.nextInt();
			nc=scanf.nextInt();	
		if(nr==nc) {
	    arr= new int[nr][nc];
		break;
		}
   System.out.println("Please Enter only Sqaure Matrix eg: 2x2 3x3...........");
		}
		System.out.println("Enter "+(nr*nc)+" Numbers");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)
				arr[i][j]=scanf.nextInt();
		}
		if(nr==nc) {
			for (int i = 0; i < arr.length; i++) {
				System.out.println("\t");
				for (int j = 0; j < arr.length; j++) {
					if(i==j)
						Trace+=arr[i][j];
				System.out.print(arr[i][j]+" ");
				}
		}
			System.out.println("\n\n\t"+Trace);
		}
}
}
