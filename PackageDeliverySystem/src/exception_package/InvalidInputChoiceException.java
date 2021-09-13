package exception_package;
/**
 * For input errors in the Driver class
 * Inherits from the class Exception
 * @author Zakary 40192181
 *
 */
public class InvalidInputChoiceException extends Exception {
	
	/**
	 * Default constructor 
	 * Invokes super to assign a default detail message
	 */
	public InvalidInputChoiceException()
	{
		super("InvalidInputChoiceException Occured: Invalid Input");
	}
	
	/**
	 * Parameterized constructor
	 * Invokes super to assign a custom detail message 
	 * @param message To assign a custom detail message
	 */
	public InvalidInputChoiceException(String message)
	{
		super(message);
	}
}
