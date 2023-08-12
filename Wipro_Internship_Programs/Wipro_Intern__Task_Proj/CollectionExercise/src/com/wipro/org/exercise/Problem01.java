package com.wipro.org.exercise;
import java.util.*;
public class Problem01 {
   public static void main(String[] args) {
	 try(Scanner sc = new Scanner(System.in)){
		 ArrayList<String> list = new ArrayList<String>();
		 list.add("Roll no 1");
		 list.add("Roll no 2");
		 list.add("Roll no 3");
		 list.add("Roll no 4");
		 list.add("Roll no 5");
       Iterator<String> itr = list.iterator();
       while(itr.hasNext())
    	   System.out.println(itr.next());
	 }
	 catch(Exception e) {
		 System.out.println(e.getMessage());
	 }
   }
}
