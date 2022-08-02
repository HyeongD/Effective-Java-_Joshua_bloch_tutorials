/**
 * 
 */
package Item1;

/**
 * @author Dhe yeong
 *
 */
public class Factory {
	
	protected String type; //type can be meat or seafood
	protected int size;
	
	// static factory method
	protected static Object makeProduct(String type, int size) {
		
		return new Factory(type, size);
	}
	
	// Initialization constructor
	protected Factory(String type, int size) {
		this.size = size;
		this.type = type;
		System.out.println(this.getClass().getName()+" initialization complete\n------------------------"
				+ "\nvalues: Type = "+ type + " size = "+size+"\n" );
		}
	//default constructor
	public Factory() {
		
	}

}
