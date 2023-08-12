package in.com.arrays;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
    //Scanner scanf=new Scanner(System.in);
		System.out.println("Enter no 1-n");
    //int n=scanf.nextInt();
		//int p[]=new int[n];
    int p[]= {9,8,7,6,5,4,3,2,};
    //System.out.println("Enter "+n+" integers");
    /*for (int i = 0; i < p.length; i++) {
	p[i]=scanf.nextInt();
    }*/
    for (int i = 0,count=0; i <p.length; i++) {
    	System.out.println(p[i]);
		for (int  j = 1; j <=p[i]; j++) {
		if(((p[i]%j)==0)) {
			count++;
		}
	   }
		if(count==2) {
			System.out.println(p[i]+" prime no");
		}
	}
    //scanf.close();
	}
}
