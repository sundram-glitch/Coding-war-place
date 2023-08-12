package com.automobile.FourWheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle{
    public int getSpeed() {
    	return 0;
    }
    public int tempControl() {
    	return 0;
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
