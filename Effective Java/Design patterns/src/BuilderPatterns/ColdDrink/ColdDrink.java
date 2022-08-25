package BuilderPatterns.ColdDrink;

import BuilderPatterns.Item;
import BuilderPatterns.Parking.Bottle;
import BuilderPatterns.Parking.Packing;

public abstract class ColdDrink implements Item{
	
	@Override
	public Packing packing() {
		
		return new Bottle();
	}
	
	@Override
	public abstract float price();
}
