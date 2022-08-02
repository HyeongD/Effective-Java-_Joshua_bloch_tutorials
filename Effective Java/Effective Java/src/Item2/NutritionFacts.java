/**
 * Consider using a builder when faced with multiple constructors
 */
package Item2;

/**
 * @author Dhe yeong
 *
 */
public class NutritionFacts {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;
	
	public static class Builder{
		//Required params
		private final int serverSize;
		private final int servings;
		
		//Optional params - initialized to default values
		private int calories = 0;
		private int fat      = 0;
		private int sodium   = 0;
		private int carbohydrate = 0;
		
		public Builder(int servingSize, int servings) {
			this.serverSize = servings;
			this.servings = servings;
		}
		
		public Builder calories(int val) {
			calories = val;
			return this;
		}
		
		public Builder fat(int val) {
			fat = val;
			return this;
		}
		
		public Builder sodium(int val) {
			sodium = val;
			return this;
		}
		
		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}
		
		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}
	
	private NutritionFacts(Builder builder) {
		this.servingSize = builder.serverSize;
		this.servings    = builder.servings;
		this.calories    = builder.calories;
		this.fat         = builder.fat;
		this.sodium      = builder.sodium;
		this.carbohydrate = builder.carbohydrate;
		
	}
	
	@Override
	//returning a string to print out the values stored in the variable
	public String toString() {
		
		return "servingSize = "+ this.servingSize + "\t servings = " + this.servings +
				"\t calories = "+ this.calories + "\t fat = " + this.fat + "\t sodium = " + this.sodium +
				"\t carbohydrate = " + this.carbohydrate;
	}
}
