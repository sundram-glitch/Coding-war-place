package com.wipro.org.map.problem02;
import java.util.Map.Entry;
import java.util.*;
public class Problem02 {
		 /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
	TreeMap<String, Long> mapObj = new TreeMap<>();
	Long saveCountryCapital(String name, Long Number) {
		  return mapObj.put(name, Number);
	  }
	  Long getCapital(String name) {
		  return  mapObj.get(name)==null?null:mapObj.get(name);	  
	  }
	  String getCountry(Long Number) {
		  for (Entry<String, Long> itr : mapObj.entrySet()) 
			  if(itr.getValue()==Number)return itr.getKey();
		  return "No Country Found";	  
	  }
		public static void main(String[] args) {
		      Problem02 pro = new Problem02();
		      //Operation 01:
		      System.out.println(pro.saveCountryCapital("Sundram,", 7054702937l));
		      System.out.println(pro.saveCountryCapital("Shivam", 7318475321l));
		      System.out.println("=".repeat(25));
		      System.out.println(pro.saveCountryCapital("Sundram", 8874303466l));  
        }
}