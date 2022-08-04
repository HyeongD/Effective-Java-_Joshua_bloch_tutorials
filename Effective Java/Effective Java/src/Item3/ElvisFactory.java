package Item3;

//Singleton with static factory
public class ElvisFactory {
	
	private static final ElvisFactory INSTANCE = new ElvisFactory();
	
	private ElvisFactory() {
		System.out.println("Hello ElvisFactory");
	}
	
	public static ElvisFactory getInstance() {
		
		return INSTANCE;
	}
	
	///////////////////////////////////////////////////////
	//readRsolve method to preserve singleton property ///
	/////////////////////////////////////////////////////
	private Object readResolve() {
		// Return the one true Elvis and let the garbage collector
		// take care of the Elvis impersonator.
		return INSTANCE;
	}
}
