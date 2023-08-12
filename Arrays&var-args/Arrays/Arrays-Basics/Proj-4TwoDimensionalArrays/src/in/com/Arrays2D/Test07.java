package in.com.Arrays2D;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
	Scanner scanf=new Scanner(System.in);
    int arr01[][]=null, arr02[][]=null,r,c,nr=0,nc=0,k=1,t,l;
    boolean flag=true;
    while(k<=2) {
    		if(flag){
    	    	System.out.print("Enter Square Matrix :");
    	    	nr=scanf.nextInt();nc=scanf.nextInt();
    			arr01=new int[nr][nc];arr02=new int[nr][nc];
        	}//immediate if
            if(nr!=0 & nc!=0 & nr==nc) {    		
            	System.out.print("Enter "+(nr*nc)+" Elements");
            	for (int i = 0; i < arr02.length; i++) {
				for (int j = 0; j < arr02.length; j++) {
				if(k==1)arr01[i][j]=scanf.nextInt();
				else arr02[i][j]=scanf.nextInt();
				}//inner for loop
			    }//outer for
            	flag=false;
    		k++;
    	}//after if
    }//while
    for ( r = 0; r < arr02.length; r++) {
    	System.out.println();
		for ( c = 0; c < arr02.length; c++) {
			for ( t = 0,l=0; l < arr02.length; l++)
			t+=arr01[r][l]*arr02[l][c];
			System.out.print(" "+t+"  ");
		}
	}
	}
}
