package hr.fer.oop;

public class DigitalItem extends LibraryItem implements ItemWithCashDeposit {
	private String type;
	private double cashDepositAmount=0;
	public DigitalItem(int id, String name,String type,double cashDepositAmount) {
		super(id, name);
		this.type=type;
		this.cashDepositAmount=cashDepositAmount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public int getLoanPeriod() {
		return 30;
	}
	public boolean hasCashDeposit() {
		return cashDepositAmount!=0;
	};
	public void setCashDepositAmount(double cashDepositAmount) {
		this.cashDepositAmount=cashDepositAmount;
	}
	
	public double getCashDepozitAmmount() {
		return cashDepositAmount;
	}
}
