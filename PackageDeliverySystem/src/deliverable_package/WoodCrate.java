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
 * Class that represents a wooden crate
 * Inherits from Crate, Box, and Package classes
 * @author Zakary 40192181
 */
public class WoodCrate extends Crate {

	/**
	 * To create default WoodCrate objects
	 * Assigns default values to each field of WoodCrate objects
	 * Chains to the default constructor of Package class
	 */
	public WoodCrate() {
		super();
	}
	
	/**
	 * To create parameterized WoodCrate objects
	 * @param trackingNumber To set the tracking number of a WoodCrate object
	 * @param weight To set the weight of a WoodCrate object
	 */
	public WoodCrate(String trackingNumber, double weight) {
		super(trackingNumber, weight, weight * 2.5);
	}
	
}
