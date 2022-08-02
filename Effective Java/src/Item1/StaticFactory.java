package Item1;

public class StaticFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		//parent class
		Factory.makeProduct("meat", 5);
		// Working with the subtype class
		SausageFactory.makeProduct("chicken", 10);
	}

}
