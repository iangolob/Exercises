
public class Food {
	private FoodType ft;
	private int weight;
	public Food(String name, int protein, int carbs, int fat, int weight) {
		ft = new FoodType(name,protein,carbs,fat);
		this.weight=weight;
	}
	public Food(FoodType ft, int weight) {
		this.ft=ft;
		this.weight=weight;
	}
	public FoodType getFoodType() {
		return ft;
	}
	public String getName() {
		return ft.getName();
	}
	public double getCarbs() {
		return ft.getCarbs()*weight/100.0;
	}
	public double getProtein() {
		return ft.getProtein()*weight/100.0;
	}
	public double getFat() {
		return ft.getFat()*weight/100.0;
	}
	public int getWeight() {
		return weight;
	}
	public String toString() {
		return String.format("%s: p - %d%%, c - %d%%, f - %d%%, w - %dg", this.getName(),ft.getProtein(),ft.getCarbs(),ft.getFat(),this.getWeight());
	}
	public String toStringInGrams() {
		return String.format("%s: p - %.1fg, c - %.1fg, f - %.1fg, w - %dg", this.getName(),this.getProtein(),this.getCarbs(),this.getFat(),this.getWeight());
	}
}
