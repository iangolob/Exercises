package collections2;

public class Bicycle {
	private String brand;
	private int price;
	private Person owner;
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public Person getOwner() {
		return owner;
	}
	public Bicycle(String brand, int price, Person owner) {
		this.brand = brand;
		this.price = price;
		this.owner = owner;
	}
	@Override
	public String toString() {
		return String.format("(%s, %d) owned by %s %s",brand,price,owner.getFirstName(),owner.getLastName());
	}
}
