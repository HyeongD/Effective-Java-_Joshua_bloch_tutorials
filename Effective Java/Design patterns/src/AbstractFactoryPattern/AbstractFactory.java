/**
 * 
 */
package AbstractFactoryPattern;

/**
 * Create an Abstract class to get factories for Normal and Rounded Shape Objects.
 * @author Dhe yeong
 *
 */
public abstract class AbstractFactory {
	abstract Shape getShape(String shapeType) ;

}
