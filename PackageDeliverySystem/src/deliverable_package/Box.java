// -----------------------------------------------------
// Assignment 2
// Part: 1
// Written by: Zakary Lepine 40192181
//-----------------------------------------------------
/** Zakary Lepine 40192181
 *  COMP 249
 *  Assignment 2 Part 1
 *  August 2
 */	
package deliverable_package;

/**
 * Class that represents a box
 * Inherits from Package class
 * @author Zakary 40192181
 */
public class Box extends Package {
	
	/**
	 * To create default Box objects
	 * Assigns default values to each field of Box objects
	 * Chains to the default constructor of Package class
	 */
	public Box(){
		super();
	}
	/**
	 * To create parameterized Box objects
	 * @param trackingNumber To set the tracking number of a Box object
	 * @param weight To set the weight of a Box object
	 */
	public Box(String trackingNumber, double weight) {
		super(trackingNumber, weight, weight * 2);
	}
	/**
	 * Used in constructor chaining of its subclasses
	 * @param trackingNumber To set the tracking number of a Box object
	 * @param weight To set the weight of a Box object
	 * @param shippingCost To set the shipping cost of a Box object
	 */
	public Box(String trackingNumber, double weight, double shippingCost) {
		super(trackingNumber, weight, shippingCost);
	}
}
