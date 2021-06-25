package hr.fer.oop.rent;

public class PassengerVan extends Van{
	private int noOfPassengers;
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public PassengerVan(String regNo, String model,int year, double price,double height, int noOfSeats,int noOfPassengers) {
		super(regNo,model,year,price,height,noOfSeats);
		this.noOfPassengers=noOfPassengers;
	}
	@Override
	public double getPricePerDay() {
		return super.getPricePerDay()*0.8;
	}
}
