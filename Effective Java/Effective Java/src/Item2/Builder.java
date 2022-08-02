package Item2;

public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		//The builder’s setter methods return the builder itself so that invocations can be chained
		NutritionFacts cocaCola =  new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
		System.out.println(cocaCola.toString());
	}

}
