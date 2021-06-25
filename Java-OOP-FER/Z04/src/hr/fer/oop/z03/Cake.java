package hr.fer.oop.z03;

public class Cake extends Dessert {
	private boolean containsGluten;
	private String cakeType;
	
	
	public Cake(String name, double weight, int calories,boolean containsGluten, String cakeType) {
		super(name, weight, calories);
		this.containsGluten=containsGluten;
		this.cakeType=cakeType;
	}
	
	public boolean isContainsGluten() {
		return containsGluten;
	}
	public void setContainsGluten(boolean containsGluten) {
		this.containsGluten = containsGluten;
	}
	public String getCakeType() {
		return cakeType;
	}
	public void setCakeType(String cakeType) {
		this.cakeType = cakeType;
	}
	
	@Override
	public String toString() {
		return super.toString()+", has gluten: "+containsGluten+", type: "+cakeType;
	}
	
	@Override
	public String getDessertType() {
		return this.cakeType+"cake";
	}
	
	
	
}