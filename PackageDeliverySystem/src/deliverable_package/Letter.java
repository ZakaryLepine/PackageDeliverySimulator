package deliverable_package;

/**
 * Class that represents a letter
 * Inherits from Package class
 * @author Zakary 40192181
 */
public class Letter extends Package {
	
	/**
	 * To create default Letter objects
	 * Assigns default values to each field of Letter objects
	 * Chains to the default constructor of Package class
	 */
	public Letter() {
		super();
	}
	
	/**
	 * To create parameterized Letter objects
	 * @param trackingNumber To set the tracking number of a Letter object
	 * @param weight To set the weight of a Letter object
	 */
	public Letter(String trackingNumber, double weight) {
		super(trackingNumber, weight, toOunces(weight) * 0.05);
	}
	
	
	/**
	 * To display a description of a Letter object with all the field values
	 * @return a description of the Letter object
	 */
	public String toString(){
		return getClass() + " has tracking number " + getTrackingNumber() + ", weighs " + toOunces(getWeight()) + " oz(s), and shipping cost of " + getShippingCost();
	}
	/**
	 *Converts weight in pounds of a letter to the weight in ounces 
	 * @param weightPounds To convert weight to ounces
	 * @return weight in ounces
	 */
	public static double toOunces(double weightPounds){
		return 16 * weightPounds;
	}
}
