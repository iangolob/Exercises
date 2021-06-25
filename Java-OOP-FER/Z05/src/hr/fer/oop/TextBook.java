package hr.fer.oop;

public class TextBook extends Book implements ItemWithCashDeposit{
	private String subject;
	private double cashDepositAmount=0;
	
	public TextBook(int id, String name, String author,String subject,double cashDepositAmount) {
		super(id, name, author);
		this.subject=subject;
		this.cashDepositAmount=cashDepositAmount;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public int getLoanPeriod() {
		return 120;
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
