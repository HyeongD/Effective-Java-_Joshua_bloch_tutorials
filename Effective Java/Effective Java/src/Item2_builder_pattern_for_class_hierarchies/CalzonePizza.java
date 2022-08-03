package Item2_builder_pattern_for_class_hierarchies;

public class CalzonePizza extends Pizza{
	
	private final boolean sauceInside;
	
	public static class Builder extends Pizza.Builder<Builder>{
		
		private boolean sauceInside = false;
		 
		public Builder sauceInside() {
			sauceInside = true;
			return this;
		 }
		
		@Override
		public CalzonePizza build() {
			return new CalzonePizza(this);
		}
		
		@Override
		protected Builder self() {
			return this;
		}
	}
	
	private CalzonePizza(Builder builder) {
		super(builder);
		sauceInside = builder.sauceInside;
	}
	
	
}
