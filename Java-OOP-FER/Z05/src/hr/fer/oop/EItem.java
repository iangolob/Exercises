package hr.fer.oop;
import java.net.URL;

public class EItem extends LibraryItem implements ItemWithCashDeposit{
	private URL url;
	private double cashDepositAmount=0;
	public EItem(int id, String name,URL url) {
		super(id, name);
		this.url=url;
	}
	public URL getUrl() {
		return url;
	}
	public void setUrl(URL url) {
		this.url = url;
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
