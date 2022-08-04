package Item3;

public class ElvisMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elvis.INSTANCE.toString();
		Elvis.INSTANCE.leavetheBuilding();
		
		//Elvis with factory method
		ElvisFactory.getInstance();
	}

}
