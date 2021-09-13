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
 * Class that represents a crate
 * Inherits from Box and Package class
 * @author Zakary 40192181
 */
public abstract class Crate extends Box {

	/**
	 * To create default Crate objects
	 * Assigns default values to each field of Crate objects
	 * Chains to the default constructor of Package class
	 */
	public Crate(){
		super();
	}
	/**
	 * To create parameterized Crate objects
	 * @param trackingNumber To set the tracking number of a Crate object
	 * @param weight To set the weight of a Crate object
	 * @param shippingCost To set the shipping cost of a Crate object
	 */
	public Crate(String trackingNumber, double weight, double shippingCost) {
		super(trackingNumber, weight, shippingCost);
	}
}
