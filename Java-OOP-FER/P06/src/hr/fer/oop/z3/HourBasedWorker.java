package hr.fer.oop.z3;

public class HourBasedWorker extends Worker {
	public static final double MONTHLY_WORKING_HOURS=160;
	public static final double OVERTIME_FACTOR=1.2;
	private double workingHours;
	private double salaryPerHour;
	public HourBasedWorker(String name,String bankNumber,double salaryPerHour) {
		super(name,bankNumber);
		this.salaryPerHour=salaryPerHour;
	}
	
	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	@Override
	public void paySalary(BankManager bankManager) {
		double salary=0;
		if(workingHours>MONTHLY_WORKING_HOURS) {
			salary=salaryPerHour*(MONTHLY_WORKING_HOURS+1.2*(workingHours-MONTHLY_WORKING_HOURS));
		}else {
			salary=workingHours*salaryPerHour;
		}
		System.out.println(this.getName()+" "+salary);
	}

}
