package com.clg.main;
import java.util.*;
import com.clg.org.Car;
public class Test {
	public static void main(String[] args) {
    Map<String, Integer> map = new LinkedHashMap<>();
    map.put("hatchback", 5);map.put("sedan", 8);map.put("suv", 10);
	try(Scanner sc = new Scanner(System.in)){
	char ch;Car obj;
	do {System.out.print("model : ");
		String carModel = sc.nextLine();
		System.out.print("type : ");
		String carType = sc.nextLine();
		System.out.print("price : ");
		double price = sc.nextDouble();sc.nextLine();
		System.out.print("Insurance type : ");
		String insuranceType = sc.nextLine();
		obj = new Car(carModel, carType, price, insuranceType);
		double totalInsurance = (obj.getPrice()*(map.get(obj.getCarType().toLowerCase())))/100;
		if(obj.getInsuranceType().equalsIgnoreCase("Premium")) 
			System.out.println("Car Model : "+obj.getCarModel()+"\nCar Price : "+obj.getPrice()+"\nTotal Insurance to be paid : "+(((totalInsurance*20)/100)+totalInsurance));
		else 
			System.out.println("Car Model : "+obj.getCarModel()+"\nCar Price : "+obj.getPrice()+"\nTotal Insurance to be paid : "+totalInsurance);
	    System.out.println("Do you want to enter details of any other cars(y/n):");	
		ch = sc.next().charAt(0); sc.nextLine();
	}while(ch =='y' || ch=='Y') ;
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	System.out.println("Progarm Terminated");
  } 
}