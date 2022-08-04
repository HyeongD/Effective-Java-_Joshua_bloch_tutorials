package Item3;

//Enum singleton - the preferred approach
public enum ElvisEnum {
	INSTANCE;
	
	public void leaveTheBuilding() {
		System.out.println("Living the building");
	}
}
