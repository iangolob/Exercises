package z6;

public class Items<T> extends Artikl<T> {
	private double quantity=0;
	 public Items(T tag, double pricing, Type type) {
	        super(tag,pricing,type);
	    }
	    
	public void setQuantity(double quantity) {
		if (this.getType() == Type.ITEM && quantity % 1 != 0)
			throw new IllegalArgumentException("For pricing per item, the quantity cannot have decimals");
		if (quantity < 0)
			throw new IllegalArgumentException("Negative values forbidden");
		this.quantity=quantity;
	}
	@Override
	public double getPrice() {
		if(this.getType()==Type.ITEM) {
			return this.getPricing()*quantity;
		}else {
			return this.getPricing()*quantity/1000;
		}
		
	}
}
