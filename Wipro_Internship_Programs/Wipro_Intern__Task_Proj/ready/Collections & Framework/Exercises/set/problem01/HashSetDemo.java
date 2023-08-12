package com.wipro.org.exercise.set.problem01;
import java.util.*;
public class HashSetDemo {
		 /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
    HashSet set = new HashSet<>();
    public static void main(String[] args) {
    HashSetDemo hs = new HashSetDemo();
    //Add unique and duplicates value to observe the hashing operation
    	System.out.println(hs.addCountry("Sundram"));		
    	System.out.println(hs.addCountry("Dubey"));		
    	System.out.println(hs.addCountry("Sundram"));		
    	System.out.println(hs.addCountry("Dubey"));		
    //find value to observe the hashing operation
	System.out.println(hs.findCountry("Sundram"));
	System.out.println(hs.addCountry("Wipro"));
	//Iterate the cursor over HashSet
	hs.pirntAllCountries();
    }
    boolean addCountry(String countryName) {
    return	set.add(countryName);
    }
    String findCountry(String countryName) {
     return	set.contains(countryName)?countryName:"Country not found";
    }
    void pirntAllCountries() {
     Iterator   itr = set.iterator();
     while(itr.hasNext())System.out.print(itr.next()+" ");
    }
}
