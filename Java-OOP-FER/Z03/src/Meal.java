
public class Meal {
	private Food[] ingredients;
	
	
	public Meal(Food... ingredients) {
		this.ingredients=ingredients.clone();
	}
	public Meal(Meal meal, int weight) {
		double ratio =((double) weight)/meal.getWeight();
		
		ingredients = new Food[meal.getNumberOfIngredients()];
		for(int i=0;i<meal.getNumberOfIngredients();i++) {
			ingredients[i] = new Food(meal.getIngredient(i).getFoodType(), (int)(meal.getIngredient(i).getWeight()*ratio));
		}
	}
	
	public int getNumberOfIngredients() {
		return ingredients.length;
	}
	public int getWeight() {
		int weight=0;
		for(Food ingredient:ingredients) {
			weight+=ingredient.getWeight();
		}
		return weight;
	}
	public Food getIngredient(int index) {
		if(index>=0 && index<ingredients.length) {
			return ingredients[index];
		}else {
			return null;
		}
	}
	public void printIngredients() {
		for(Food ingredient:ingredients) {
			System.out.println(ingredient.toStringInGrams());
		}
	}
	public double compare(Meal meal2) {
		double similarity=0;
		double weight1=this.getWeight();
		double weight2=meal2.getWeight();
		for(Food ingredient1:this.ingredients) {
			for(int i=0;i<meal2.getNumberOfIngredients();i++) {
				Food ingredient2=meal2.getIngredient(i);
				if(ingredient1.getName().equals(ingredient2.getName())) {
					double percentage1= (double)ingredient1.getWeight()/this.getWeight();
					double percentage2= (double)ingredient2.getWeight()/meal2.getWeight();
					similarity+=(percentage1<percentage2? percentage1:percentage2);
				}
			}
		}
		return similarity;
	}
	
	
}
