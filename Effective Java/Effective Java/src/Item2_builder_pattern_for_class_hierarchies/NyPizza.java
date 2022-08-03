package Item2_builder_pattern_for_class_hierarchies;

import java.util.Objects;

//Newyork pizza
public class NyPizza extends Pizza{
	
	public static enum Size {SMALL, MEDIUM, LARGE}
	private final Size size;
	
	public static class Builder extends Pizza.Builder<Builder>{
		private final Size size;
		
		public Builder(Size size) {
			this.size = Objects.requireNonNull(size);
		}
		
		@Override
		public NyPizza build() {
			return new NyPizza(this);
		}
		
		@Override
		protected Builder self() { 
			return this;
		}


	}
	
	private  NyPizza(Builder builder) {
		super(builder);
		size = builder.size;
	}
}
