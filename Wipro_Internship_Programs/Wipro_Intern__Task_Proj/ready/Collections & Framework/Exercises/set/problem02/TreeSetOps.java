package com.wipro.org.exercise.set.problem02;
import java.util.*;
public class TreeSetOps {
		 /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
 	public static void main(String[] args) {
       TreeSet<String> ts  = new TreeSet<String>();
       //Operation 01: adding
	   ts.add("Sundram");
	   ts.add("Dubey");
	   ts.add("Wipro");
	   ts.add("763984");
	   System.out.println(ts);
	   //Operation 02: reversing
	   List<String> list = new ArrayList<>();
	   list.addAll(ts);
	   Collections.reverse(list);
	   //Operation 03: Iteration
	   Iterator<String> itr = list.iterator();
	   while(itr.hasNext())System.out.print(itr.next()+" ");
	   //Operation 04: Element Checking
	   System.out.println();
	   System.out.println("Sundram");
	   System.out.print(ts.contains("Internship"));
 	}
}
