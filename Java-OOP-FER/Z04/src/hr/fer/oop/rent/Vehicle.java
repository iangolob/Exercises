package hr.fer.oop.rent;

public abstract class Vehicle {
	private String regNo;
	private String model;
	private int year;
	private double price;
	
	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public double getPricePerDay() {
		return price*24;
	}
	final public double getPricePerMonth() {
		return this.getPricePerDay()*30;
	}
	
	
	public Vehicle(String regNo, String model,int year, double price) {
		this.regNo=regNo;
		this.model=model;
		this.year=year;
		this.price=price;
	}
	public static Vehicle getNewestVehicle(Vehicle... vehicles) {
		if(vehicles.length==0) {
			return null;
		}
		int newestYear=vehicles[0].getYear();
		Vehicle newestVehicle=vehicles[0];
		for(Vehicle vehicle:vehicles) {
			if(vehicle.getYear()>newestYear) {
				newestYear=vehicle.getYear();
				newestVehicle=vehicle;
			}
		}
		return newestVehicle;
		
	}
	public static void printAllVehiclesWithCargoSpaceGreaterThan(double limit, Vehicle... vehicles) {
		for(Vehicle vehicle:vehicles) {
			if(vehicle instanceof Van){
				if(((Van) vehicle).getHeight()>=limit) {
					System.out.println((Van) vehicle);
				}
			}
			if(vehicle instanceof Limo){
				if(((Limo) vehicle).getLength()>=limit) {
					System.out.println((Limo) vehicle);
				}
			}
		}
	}
	@Override
	public String toString() {
		return regNo+", model: "+model+", year: "+year+", price: "+price;
	}
	
}
