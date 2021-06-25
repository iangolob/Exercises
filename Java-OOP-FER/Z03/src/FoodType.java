
public class FoodType {
	private String name="Masna jabuka";
	private int protein=5;
	private int fat=55;
	private int carbs=40;
	private static int counter=0;
	public static int getNumberOfCreatedInstances() {
		return counter;
	}
	public FoodType() {
		counter++;
	}
	public FoodType(String name, int protein, int carbs, int fat) {
		this();
		this.name=name;
		this.protein=protein;
		this.fat=fat;
		this.carbs=carbs;
	}
	
	public int getProtein() {
		return protein;
	}
	public int getFat() {
		return fat;
	}
	public int getCarbs() {
		return carbs;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return String.format("%s: p - %d%%, c - %d%%, f - %d%%", name,protein,carbs,fat);
	}
	
	
	
}
