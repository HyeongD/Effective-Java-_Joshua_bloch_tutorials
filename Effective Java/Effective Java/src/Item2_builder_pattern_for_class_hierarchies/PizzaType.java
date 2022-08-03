package Item2_builder_pattern_for_class_hierarchies;

import Item2_builder_pattern_for_class_hierarchies.Pizza.Topping;

public class PizzaType {

	public static void main(String[] args) {
		NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL).addTopping(Topping.SAUSAGE).addTopping(Topping.ONION).build();
		
		CalzonePizza calzone = new CalzonePizza.Builder().addTopping(Topping.HAM).sauceInside().build();

	}

}
