package com.wipro.org;
import java.util.Scanner;
public class Problem06{
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
   public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 String name = sc.nextLine().toLowerCase();
	 int age = sc.nextInt();
	 if(name.charAt(0)=='f' && age >0 && age<59)
     System.out.println("The percentage of interest is 8.2%");
	 if(name.charAt(0)=='f' && age >58 && age<100)
	 System.out.println("The percentage of interest is 9.2%");
	 if(name.charAt(0)=='m' && age >0 && age<59)
	 System.out.println("The percentage of interest is 8.4%");
	 if(name.charAt(0)=='m' && age >58 && age<100)
	 System.out.println("The percentage of interest is 10.5%");	 
   }
}
