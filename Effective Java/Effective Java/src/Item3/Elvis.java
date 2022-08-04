package Item3;


//Singleton with public final field
public class Elvis {

	public static final Elvis INSTANCE = new Elvis();
	
	private Elvis() {
		System.out.println("Hello Elvis");
	}
	public void leavetheBuilding() {
		System.out.println("Living the building");
		
	}
}
