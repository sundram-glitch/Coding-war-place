package com.wipro.org.InheriteShape;

public class TestShape {
	     /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
   public static void main(String[] args) {
	  Shape c = new Circle();
	  Shape t = new Triangle();
	  Shape s = new Square();
	   c.draw();
	   c.erase();
	   t.draw();
	   t.erase();
	   s.draw();
	   s.erase();
   }
} 
