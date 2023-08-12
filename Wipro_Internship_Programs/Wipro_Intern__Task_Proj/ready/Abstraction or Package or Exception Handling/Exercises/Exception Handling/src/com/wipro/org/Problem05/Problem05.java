package com.wipro.org.AgeChecker;
import java.util.Scanner;
public class Problem05 {
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
      public static void main(String[] args) {
		 try(Scanner  sc = new Scanner(System.in)){
		 String name = sc.nextLine();
		 int age = sc.nextInt();
		 StoreValue(name,age);
		 } catch (InvalidAgeException e) {
 			System.out.println(e.getMessage());
 			System.exit(0);
		}	
	  }
	static void StoreValue(String name, int age) throws InvalidAgeException {
 	    if(age>=18 && age<60) 
		new Person(name,age);
 	    else throw new InvalidAgeException("Enter Age is Invalid");
    }
} 