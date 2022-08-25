package BuilderPatterns;

import BuilderPatterns.Parking.Packing;

//Create an interface Item representing food item and packing.
public interface Item {
	public String name();
	public Packing packing();
	public float price();
}
