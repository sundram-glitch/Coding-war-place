//Division of square matrix
package in.com.Arrays2D;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
	Scanner scanf=new Scanner(System.in);
		int arr01[][]=null,arr02[][]=null,arr03[][]=null,r,c,nr=0,nc=0,flag01=1;
		boolean flag02=true;
		while(flag01<=2) {
	if(flag02) {
		System.out.println("Enter Square Matrix :");
	nr=scanf.nextInt();nc=scanf.nextInt();
	}
	if(nr!=0 & nc!=0 & nr==nc) {
	    if(flag02) {
		arr01=new int[nr][nc]; arr02=new int[nr][nc]; arr03=new int[nr][nc];
		flag02=false;
	    }
		System.out.println("Enter "+(nr*nc)+" Elements");
	for (int i = 0; i < arr01.length; i++) {
		for (int j = 0; j < arr02.length; j++) {
			if(flag01==1)arr01[i][j]=scanf.nextInt();
			else arr02[i][j]=scanf.nextInt();
		}//inner for
	}//outer for
	flag01++;
	}//if
	}//while
	for ( r = 0; r < arr03.length; r++) {
		System.out.print("\t");
		for ( c = 0; c < arr03.length; c++) {
		    System.out.print((arr03[r][c]=arr01[r][c]/arr02[r][c])+"  ");
		}
		System.out.println();
	}
	}
}