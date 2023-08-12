package com.tricky.problems;

import java.util.Scanner;

public class Test {

	 public static void main(String args[]) {

	        int i, s, j;
	        boolean flag=true;
	        int arr[] = new int[100];
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter size of an array:");
	        s = sc.nextInt();

	        System.out.print("Enter array elements:");
	        for (i = 0; i < s; i++) {
	            arr[i] = sc.nextInt();
	        }
            
	        System.out.println("");
	        for (i = 0; i < s; i++) {
	            j = 2;
	            flag=true;
	            while (j < arr[i]) {
	                if (arr[i] % j == 0) {
	                    flag=false;
	                   System.out.println("j "+j);
	                    break;
	                }
	                j++;
	                System.out.println("j "+j);
	            }
	            System.out.println("j "+j);
	            if (flag) 
	            	if(arr[i]<=1) 
	            		System.out.println();
	            	else
	                System.out.print(arr[i]+" prime number: \n" );
	            else 
	            	System.out.println(+arr[i]+" Not A prime no");
            }
            }
   }