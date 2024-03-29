package com.wipro.org.exercise;
import java.util.*;
public class Problem03 {
     public static	 void main(String[] args) {
	  //After java 5v AB & AUB, Generic Concept
      try(Scanner sc = new Scanner(System.in)){
    	 Vector<Integer> v = new Vector<>();
    	 System.out.println("Enter how many values you want to store?");
    	 int n = sc.nextInt();
    	 for (int i = 0; i < n; i++) 
            v.add(sc.nextInt());
    	 //Iterating over Enumeration 01:
    	 Enumeration<Integer> enumer = v.elements();
    	 while(enumer.hasMoreElements())System.out.println(enumer.nextElement());
         //iterating over iterator 02:
    	 Iterator<Integer> itr = v.iterator();
    	 while(itr.hasNext())System.out.println(itr.next());
    	 //Iterating over ListIterator 03:
    	 ListIterator<Integer> listitr = v.listIterator();
    	 while(listitr.hasNext())System.out.println(listitr.next());
      }catch(Exception e) {
    	  System.out.println(e.getMessage());
      }
     }
}
