package hr.fer.oop;

public class Desktop extends Computer {
	private double caseHeight;
	public Desktop(String model,String manufacturer,String operatingSystem,double caseHeight) {
		super(model,manufacturer,operatingSystem);
		this.caseHeight=caseHeight;
	}
	public double getCaseHeight() {
		return caseHeight;
	}
	public void setCaseHeight(double caseHeight) {
		this.caseHeight = caseHeight;
	}
	
	@Override
	public String toString() {
		return super.toString()+", height: "+caseHeight;
	}
	@Override
	public String getComputerType() {
		return "desktop computer";
	}
	@Override
	public int calculatePortabilityScore() {
		return (int)(5+caseHeight/30);
	}
	
}
