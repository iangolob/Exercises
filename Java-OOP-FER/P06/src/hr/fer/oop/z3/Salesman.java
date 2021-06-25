package hr.fer.oop.z3;

public class Salesman extends Worker {
	private static final double SALARY_PERCENT=0.01;
	private double turnover=0;
	private double minSalary;
	public Salesman(String name, String bankNumber,double minSalary) {
		super(name,bankNumber);
		this.minSalary=minSalary;
	}
	
	
	public double getTurnover() {
		return turnover;
	}


	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}


	@Override
	public void paySalary(BankManager bankManager) {
		System.out.println(this.getName()+" "+(minSalary+turnover*SALARY_PERCENT));
	}

}
