package com.automobile.vehicle;

import com.automobile.Vehicle;

public class Honda extends Vehicle {
	public int getSpeed() {		  
		System.out.println(this.getClass().getName()+" getSpeed method is called");
		  return 0;
	}
	public void cdPlayer() {
		System.out.println(this.getClass().getName()+" cdPlayer method is called");
	}
	@Override
	public String getModelName() {
		return this.getClass().getName()+" getModelName method is called";
	}
	@Override
	public String getRegistractionNumner() {
		return this.getClass().getName()+" getRegistractionNumner method is called";
	}

	@Override
	public String getOwnerName() {
		return this.getClass().getName()+" getOwnerName method is called";
	}

}
