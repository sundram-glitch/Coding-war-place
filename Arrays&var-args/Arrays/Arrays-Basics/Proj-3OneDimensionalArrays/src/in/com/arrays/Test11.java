//Deletion Element
package in.com.arrays;

import java.util.Scanner;

public class Test11 {
       public static void main(String[] args) {
	   int i,j,k,n,l,m,ele,size,count=0;
	   boolean flag=false;
	   Scanner scanf=new Scanner(System.in);
	   System.out.println("Enter Arrays Size");
	   int arr01[]=new int[size=scanf.nextInt()];
       System.out.println("Enter "+arr01.length+" elements");
		for (i = 0; i <arr01.length; i++) arr01[i]=scanf.nextInt();
		System.out.print("Enter Specified Element to Delete : ");
        ele=scanf.nextInt();
        System.out.print("Element Deleted at   position :");
        for ( j = 0; j <size; j++) { 
		if(arr01[j]==ele) { 
		  flag=true;
		  for(k = j; k <size-1; k++)//swap util array.lenth-1 becoz array index occurs 0-4 only last 4(5) copied to 3(4) 
				  arr01[k]=arr01[k+1];
	      System.out.print("\t "+j);
		  count++;
		  j--;
		  size--;
		}
       }
       if(flag)System.out.println("\n"+count+" times");
       //take new arrays on deleted elements size element
       /*int[] arr02=new int[arr01.length-count];
       for ( l = 0; l < arr02.length; l++) arr02[l]=arr01[l];*/
       System.out.print("Elements are : ");
       for (m = 0; m < size; m++) 
    	   System.out.print(arr01[m]+" ");
       }
}