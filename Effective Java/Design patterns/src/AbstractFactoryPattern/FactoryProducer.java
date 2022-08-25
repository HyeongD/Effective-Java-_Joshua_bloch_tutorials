/**
 * 
 */
package AbstractFactoryPattern;

/**
 * Create a Factory generator/producer class to get factories by passing an information such as Shape
 * @author Dhe yeong
 *
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(boolean rounded){   
	      if(rounded){
	         return new RoundedShapeFactory();         
	      }else{
	         return new ShapeFactory();
	      }
	   }
}
