package hr.fer.oop.sl2.z2;

class BankReceivingSystem implements ReceivingSystem {
	private int urgentListSize=0;
	private int nonUrgentListSize=0;
	private boolean employeeBusy=false;
	private int numberOfArrivedCustomers=0;
	public int getUrgentListSize() {
		return urgentListSize;
	}
	public int getNonUrgentListSize() {
		return nonUrgentListSize;
	}
	public void customerArrived(boolean urgent) {
		if(urgent) {
			urgentListSize++;
		}else {
			nonUrgentListSize++;
		}
		calculateEmployeeStatus();
		numberOfArrivedCustomers++;
	}
	public void customerLeft(boolean urgent) {
		if(urgent) {
			urgentListSize--;
		}else {
			nonUrgentListSize--;
		}
		calculateEmployeeStatus();
	}
	public void calculateEmployeeStatus() {
		employeeBusy=urgentListSize>0 || nonUrgentListSize>0;
	}
	public boolean isEmployeeOccupied() {
		return employeeBusy;
	}
	public int getNumberOfArrivedCustomers() {
		return numberOfArrivedCustomers;
	}
	
}
