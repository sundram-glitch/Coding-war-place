package com.automobile.twowheeler;
import com.automobile.Vehicle;
public class Hero extends Vehicle{
  public int getSpeed() {
	  System.out.println(this.getClass().getName()+" getSpeed method called");
	  return 0;
  }
  public void radio() {
	  	
  }
@Override
public String getModelName() {
	return this.getClass().getName()+" getModelName method is called";
}
@Override
public String getRegistractionNumner() {
	return this.getClass().getName()+" getRegistractionNumner method callled";
}
@Override
public String getOwnerName() {
	return  this.getClass().getName()+" getOwerName method is called";
}
} 
