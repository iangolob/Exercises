package hr.fer.oop.rent;

public class Car extends Vehicle {
	private String carType;
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public Car(String regNo, String model,int year, double price,String carType,int randNumber) {
		super(regNo,model,year,price);
		this.carType=carType;
	}
}
