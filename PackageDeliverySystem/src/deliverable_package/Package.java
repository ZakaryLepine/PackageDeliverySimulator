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

import deliverable_package.Letter;

/**
 * Superclass of the classes Box, Crate, Letter, MetalCrate, and WoodCrate
 * Abstract class that defines common fields and behaviors of its subclasses
 * @author zakary 40192181
 *
 */
public abstract class Package {
	
	/**
	 * Tracking number of the package
	 */
	private String trackingNumber;
	/**
	 * Weight of each package
	 */
	private double weight;
	/**
	 * Shipping cost of the package
	 * Cost is based on the weight and type of the package
	 */
	private double shippingCost;
	/**
	 * Default constructor of the class Package
	 */
	public Package(){
		trackingNumber = "Default tracking number";
		weight = 0.0;
		shippingCost = 0.0;
	}
	
	/**
	 * Parameterized constructor 
	 * To create objects of Package subclasses
	 * @param trackingNumber To set the tracking number
	 * @param weight To set the weight
	 * @param shippingCost To set the shipping cost
	 */
	public Package(String trackingNumber, double weight, double shippingCost) {
		this.trackingNumber = trackingNumber;
		this.weight = weight;
		this.shippingCost = shippingCost;
	}
	//----Accessors----
	/**
	 * To set the tracking number of the package in other classes
	 * @param trackingNumber To set the tracking number of package
	 */
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	/**
	 * To set the weight of the package in other classes
	 * @param weight To set the weight of the package
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * To set the shipping cost of the package in other classes
	 * @param shippingCost To set the weight of the package
	 */
	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}
	//----Mutators----
	/**
	 * To retrieve the tracking number of the package in other classes
	 * @return the tracking number of the package
	 */
	public String getTrackingNumber() {
		return trackingNumber;
	}
	/**
	 * To retrieve the weight of the package in other classes
	 * @return the weight of the package
	 */
	public double getWeight() {
		return weight;
	}
	
	/**
	 * To retrieve the shipping of the package in other classes
	 * @return the shipping cost of the package
	 */
	public double getShippingCost() {
		return shippingCost;
	}
		
	/**
	 * Converts weight in ounces of a package to the weight in pounds 
	 * @param weightOunces To convert weight to pounds
	 * @return weight in pounds
	 */
	protected double toPounds(double weightOunces){
		return 0.0625 * weightOunces;
	}
	/**
	 * To display a description of a Package object with all the field values
	 * @return a description of the Package Object
	 */
	public String toString(){
		return getClass() + " has tracking number " + trackingNumber + ", weighs " + weight + " lb(s), and shipping cost of " + shippingCost;
	}
}
