package exception_package;
/**
 * Used in the load method of the Truck class for invalid packages
 * Inherits from the class Exception
 * @author Zakary 40192181
 *
 */
public class PackageException extends Exception {
	
	/**
	 * Default constructor 
	 * Invokes super to assign a default detail message
	 */
	public PackageException()
	{
		super("PackageException occured: Could not add the package to the truck");
	}
	
	/**
	 * Parameterized constructor
	 * Invokes super to assign a custom detail message 
	 * @param message To assign a custom detail message
	 */
	public PackageException(String message)
	{
		super(message);
	}
}
