package SingletonPattern;

public class SingleObject {
	//create an object of Single Object
	private static  SingleObject instance = new SingleObject();
	private int a=0;
	//make the constructor private so that this class cannot be instantiated
	private SingleObject()  {
		
	}
	
   //Get the only object available
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello World!");
		
	}
}
