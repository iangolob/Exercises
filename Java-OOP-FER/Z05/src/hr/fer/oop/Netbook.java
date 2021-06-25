package hr.fer.oop;

public final class Netbook extends Laptop {
	public Netbook(String model,String manufacturer,String operatingSystem,int batteryCapacity, double weight) {
		super(model,manufacturer,operatingSystem,batteryCapacity,weight);
	}
	
	@Override
	public int calculatePortabilityScore() {
		return 1;
	}
	@Override
	public String getComputerType() {
		return "netbook laptop computer";
	}
}
