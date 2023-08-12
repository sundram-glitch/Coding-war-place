package com.wipro.org.InheriteShape;
public class Shape {
    void draw(){
    	System.out.println("Drawing shape");
    }
    void erase() {
    	System.out.println("erasing shape");    	
    }
}
class Circle extends Shape{
	void draw(){
    	System.out.println("Drawing circle");
    }
    void erase() {
    	System.out.println("erasing circle");    	
    }
}
class Triangle extends Shape{
	void draw(){
    	System.out.println("Drawing triangle");
    }
    void erase() {
    	System.out.println("erasing triangle");    	
    }	
}
class Square extends Shape{
	void draw(){
    	System.out.println("Drawing square");
    }
    void erase() {
    	System.out.println("Erasing square");
    }	
}
