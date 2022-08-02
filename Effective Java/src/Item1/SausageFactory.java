/**
 * Sausage factory where only Sausages and made
 * 
 */
package Item1;

/**
 * @author Dhe yeong
 *
 */
public class SausageFactory extends Factory {
	
	//String name;
	String meatType;
	int length;
	
	

	public static SausageFactory makeProduct(String meatType, int length) {
		// TODO Auto-generated method stub
		return new  SausageFactory(meatType, length);
	}
	
	public SausageFactory(String meatType, int length) {
		super(meatType, length);
	}
}
