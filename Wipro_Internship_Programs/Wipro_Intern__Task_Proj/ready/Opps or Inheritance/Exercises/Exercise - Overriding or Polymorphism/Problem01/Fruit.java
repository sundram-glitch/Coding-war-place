package com.wipro.org.Inheritefuits;

public class Fruit {
	     /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
    String name, test, size;
    public void eat() {
    	System.out.println(name +" "+test);
    }
}
class Apple extends Fruit{
	public void eat() {
		System.out.println(name +" "+test);
	}	
}
class Orange extends Fruit{
	public void eat() {
		System.out.println(name +" "+test);
	}		
}
