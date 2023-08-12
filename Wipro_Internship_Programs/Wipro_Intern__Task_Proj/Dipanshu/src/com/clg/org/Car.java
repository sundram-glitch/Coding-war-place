package com.clg.org;
public class Car {
  public Car(String carModel, String carType, double price, String insuranceType) {
    this.setCarModel(carModel);
    this.setCarType(carType);
    this.setPrice(price);
    this.setInsuranceType(insuranceType);
  }
    public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
  private String carModel, carType,insuranceType;
  private double price;
}
