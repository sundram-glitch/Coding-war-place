package com.wipro.org.map.problem01;
public class Test {
	public static void main(String[] args) {
			 /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
      Problem01 pro = new Problem01();
      //Operation 01:
      System.out.println(pro.saveCountryCapital("India", "Delhi"));
      System.out.println(pro.saveCountryCapital("Japan", "tokoyo"));
      System.out.println("=".repeat(25));
      System.out.println(pro.saveCountryCapital("India", "Delhi"));
      System.out.println("=".repeat(25));
      //Operation 02:
      System.out.println(pro.copyMapObj());
      System.out.println("=".repeat(25));
      //Operation 03:
      System.out.println(pro.copyCountry());
      System.out.println("=".repeat(25));
      //Operation 04:
      System.out.println(pro.copyCapital());
	}
}
