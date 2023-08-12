package com.wipro.org.inheritenceAnimal;
public class Animal {
	     /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
     public void eat() {
    	System.out.println(this.toString()+" is Eating"); 
     }
     public void sleep() {
    	 System.out.println(this.toString()+" is Sleeping");     	 
     }
}
class Bird extends Animal{
	public void eat() {
		System.out.println(this.toString()+" is Eating"); 		
	}
	public void sleep() {
		System.out.println(this.toString()+" is sleeping"); 				
	}
	public void fly() {
		System.out.println(this.toString()+" is flying"); 						
	}
	public static void main(String[] args) {
		Animal animal  = new Animal();
		animal.eat();
		animal.sleep();
		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();
	}	
}
