package BuilderPatterns;

import BuilderPatterns.Burger.ChickenBurger;
import BuilderPatterns.Burger.VegBurger;
import BuilderPatterns.ColdDrink.Coke;
import BuilderPatterns.ColdDrink.Pepsi;

public class MealBuilder {
	
	public Meal prepareVegMeal() {
		Meal meal= new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	public Meal prepareNonVegMeal() {
		Meal meal= new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
