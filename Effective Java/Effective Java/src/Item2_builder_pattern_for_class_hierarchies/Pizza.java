package Item2_builder_pattern_for_class_hierarchies;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
	public static enum Topping { HAM, MUSHROOM, ONION,PEPPER, SAUSAGE }
	final Set<Topping> toppings;
	
	abstract static class Builder<T extends Builder<T>>{
		EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
		
		public T addTopping(Topping topping) {
			toppings.add(Objects.requireNonNull (topping));
			return self();
		}
		
		// use 
		//abstract <T extends Pizza> T build();
		//or
		abstract Pizza build();
		
		// Subclasses must override this method to return "this"
		protected abstract T self();

		

//		public NyPizza buid() {
//			// TODO Auto-generated method stub
//			return null;
//		}
	}
	
	Pizza(Builder<?> builder){
		toppings = builder.toppings.clone();
	}
}
