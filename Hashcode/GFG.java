// Java program to illustrate 
// Java.util.HashMap 

import java.util.HashMap; 
import java.util.Map; 

public class GFG { 
	public static void main(String[] args) 
	{ 


		HashMap hc=new HashMap(); 
		hc.put("vishal", "a"); 
		hc.put("sachin", "b"); 
		hc.put("vaibhav", "ab"); 

		System.out.println("Size of map is:- "
						+hc.size()); 

		
		/*if (hc.containsKey("vishal")) { 
			//Integer a = hc.get("vishal"); 
			System.out.println("value for key"
							+ " \"vishal\" is:- "
							+ a); 
		} */

		//map.clear(); 
		//print(map); 
	} 

	/*public static void print(Map<String, Integer> map) 
	{ 
		if (map.isEmpty()) { 
			System.out.println("map is empty"); 
		} 

		else { 
			System.out.println(map); 
		} 
	} */
} 
