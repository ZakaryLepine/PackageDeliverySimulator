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
 * Class that represents a metal crate
 * Inherits from Crate, Box, and Package classes
 * @author Zakary 40192181
 */
public class MetalCrate extends Crate {
	
	/**
	 * To create default MetalCrate objects
	 * Assigns default values to each field of MetalCrate objects
	 * Chains to the default constructor of Package class
	 */
	public MetalCrate() {
		super();
	}
	/**
	 * To create parameterized MetalCrate objects
	 * @param trackingNumber To set the tracking number of a MetalCrate object
	 * @param weight To set the weight of a MetalCrate object
	 */
	public MetalCrate(String trackingNumber, double weight) {
		super(trackingNumber, weight, weight * 3);
	}
	
}
