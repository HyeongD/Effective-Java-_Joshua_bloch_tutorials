package SingletonPattern;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		
		//Get the only object available
		SingleObject object = SingleObject.getInstance();
		
		//show the message
		object.showMessage();
		
		for(int i=2;i<=10; i++) {
			 object = SingleObject.getInstance(); 
		}
		
		
	}
}
