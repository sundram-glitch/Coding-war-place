package com.automobile.main;

import com.automobile.Vehicle;
import com.automobile.twowheeler.Hero;
import com.automobile.vehicle.Honda;

public class TestVehicle {
/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
	public static void main(String[] args) {
    Vehicle obj;
    obj = new Hero();
		System.out.println(obj.getModelName());
		System.out.println(obj.getOwnerName());
		System.out.println(obj.getRegistractionNumner());
		System.out.println(new Hero().getSpeed());
	obj = new Honda();
		System.out.println(obj.getModelName());
		System.out.println(obj.getOwnerName());
		System.out.println(obj.getRegistractionNumner());
		System.out.println(new Hero().getSpeed());
	}

}
