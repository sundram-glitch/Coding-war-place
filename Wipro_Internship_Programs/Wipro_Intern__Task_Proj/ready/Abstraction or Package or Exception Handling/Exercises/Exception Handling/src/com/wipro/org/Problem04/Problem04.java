package com.wipro.org.CourtryExceptionHandler;
import java.util.Scanner;
public class Problem04 {
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
    public static void main(String[] args) {
	  try(Scanner sc  = new Scanner(System.in)){
		  String name = sc.nextLine();
		  String country = sc.nextLine();
		  userRegistration(name, country);
	  } catch (InvalidCountryException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } 
	}
	 static void userRegistration(String name, String country) throws InvalidCountryException {
 		  Student st = new Student();
 		  st.setStudentName(name);
 		  if(country.equalsIgnoreCase("India"))st.setCountry(country);
 		  else throw new InvalidCountryException("User outside india can'nt be registered!!");
	 }
}
