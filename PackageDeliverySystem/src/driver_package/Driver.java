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
package driver_package;
import java.io.IOException;
import java.util.Scanner;

import exception_package.InvalidInputChoiceException;
import exception_package.PackageException;
import truck_package.Truck;
/**
 * Driver class of the program 
 * Includes all user prompts
 * @author Zakary 40192181
 *
 */
public class Driver {

	public static void main(String[] args) {
		
		/**
		 * Reference variable of Scanner type
		 * Used to take user input from keyboard
		 */
		Scanner kbInput = new Scanner(System.in);
		
		/**
		 * Reference variable of Truck type
		 */
		Truck truck = new Truck();
		/**
		 * Conditional variable used as the condition in the while loop
		 */
		boolean inputChoiceIsNotZero = true;
		/**
		 * Displays a program welcome message
		 */
		welcomeMessage();
		
		/**
		 * Executes while conditional variable is true
		 * Displays the input choice menu
		 * Takes the user input
		 */
		
		do {
			
			displayMenu();
			inputChoiceIsNotZero = takeUserInput(kbInput, truck);	
		}while(inputChoiceIsNotZero);
		
		try {
			kbInput.close();
		}
		catch(Exception e) {
			System.out.println("Exception occured: Error closing the stream");
		}
	}
	
	/**
	 * To display the user input choice menu
	 */
	public static void displayMenu(){
		System.out.println("\nWhat would you like to do?\n");
		
		System.out.println("\t1. Start a cargo");
		System.out.println("\t\ta. Driver name");
		System.out.println("\t\tb. Unload weight(kg;lb)");
		System.out.println("\t\tc. Originating city");
		System.out.println("\t\td. Destination city\n");
		
		System.out.println("\t2. Load the truck with packages");
		System.out.println("\t\ta. Package tracking number");
		System.out.println("\t\tb. Package weight(oz;lb)");
		System.out.println("\t\tc. Package shipping cost\n");
		
		System.out.println("\t3. Unload a package\n");
		
		System.out.println("\t4. The number of packages loaded\n");
		
		System.out.println("\t5. The gross income earned by shipping of the cargo\n");
		
		System.out.println("\t6. Weight the truck(after it has been completely loaded)\n");
		
		System.out.println("\t7. Drive the truck to destination\n"); 
		
		System.out.println("\t0. To quit\n");
		
		System.out.print("Please enter your choice and press <Enter>: ");
	}
	/**
	 * Bridge between the other user prompts
	 * Takes user input and executes methods depending on user input
	 * @param keyboardInput Scanner taking keyboard input
	 * @param truck Truck object that is to be instantiated
	 * @return Whether user inputed char '0'
	 */
	public static boolean takeUserInput(Scanner keyboardInput,Truck truck){
		String userInput = keyboardInput.nextLine().toLowerCase();
		try{
			if (userInput.equals("1")){
				driverNamePrompt(keyboardInput, truck);
				unloadedWeightPrompt(keyboardInput, truck);
				originatingCityPrompt(keyboardInput, truck);
				destinationCityPrompt(keyboardInput, truck);
			}
			else if (userInput.equals("2")){
				option2Prompt(keyboardInput, truck);
			}
			else if (userInput.equals("3")){
				unloadPrompt(keyboardInput,truck);
			}
			else if (userInput.equals("4")){
				numberOfPackagesMessage(truck);
			}
			else if (userInput.equals("5")){
				grossIncomeMessage(truck);
			}
			else if (userInput.equals("6")){
				weightTruckMessage(truck);
			}
			else if (userInput.equals("7")){
				driveTruckToDestinationMessage(truck);
			}
			else if (userInput.equals("0")){
				toQuitMessage();
				return false;
			}
			else{
				throw new InvalidInputChoiceException(); //If input is not part of the switch statement case options
			}
		}
		catch (InvalidInputChoiceException e) {
			System.out.println("\n" + e.getMessage());
			System.out.println("Please enter a valid input");
		}
		return true;
	}
	
	/**
	 * To display a program welcome message
	 */
	public static void welcomeMessage(){
		System.out.println("--------------------------------------------");
		System.out.println("Welcome to Truck Activity Management Program");
		System.out.println("--------------------------------------------");
	}
	
	/**
	 * To display a prompt to enter a truck driver name
	 * Sets the truck driver name
	 * Re-prompts user if scanner is closed or input is null
	 * @param keyboardInput Scanner taking keyboard input
	 * @param truck Truck object to be instantiated 
	 */
	public static void driverNamePrompt(Scanner keyboardInput, Truck truck){
		System.out.println("\nThe truck driver name is: " + truck.getDriverName());
		
		while (true) {
			System.out.print("Please enter a new truck driver name: ");
			try {
				String driverName = keyboardInput.nextLine();
				truck.setDriverName(driverName);
				System.out.println("The truck driver name is now: " + truck.getDriverName());
				break;
			}
			catch(Exception e) {
				System.out.println("\nInvalid Input. Please enter a valid input.");
			}
		}
	}
	/**
	 * To display a prompt to enter a truck unloaded weight
	 * Sets the truck unloaded weight
	 * Re-prompts user if scanner is closed or input is null
	 * @param keyboardInput Scanner taking keyboard input
	 * @param truck Truck object to be instantiated
	 */
	public static void unloadedWeightPrompt(Scanner keyboardInput, Truck truck){
		
		System.out.println("\nThe truck unloaded weight is: " + truck.getUnloadedWeight());  
		
		while(true) {
			System.out.print("Please enter a new truck unloaded weight in pounds: ");
			try{
				double unloadedWeight = Double.parseDouble(keyboardInput.nextLine());
				truck.setUnloadedWeight(unloadedWeight);
				System.out.println("\nThe truck unloaded weight is now: " + truck.getUnloadedWeight() + " lb(s)");
				System.out.println("The truck unloaded weight is now: " + truck.toKilograms(truck.getUnloadedWeight()) + "kg(s)");
				break;
			}
			catch(Exception e){
				System.out.println("\nInvalid Input. Please enter a valid input.");
			}
		}
	}
	/**
	 * To display a prompt to enter a truck originating city
	 * Sets the truck originating city
	 * Re-prompts user if scanner is closed or input is null
	 * @param keyboardInput Scanner taking keyboard input
	 * @param truck Truck object to be instantiated
	 */
	public static void originatingCityPrompt(Scanner keyboardInput, Truck truck){
		
		System.out.println("\nThe truck originating city is: " + truck.getOriginatingCity());
			
		while (true) {
			System.out.print("Please enter a new truck originating city: ");
			try {
				String originatingCity = keyboardInput.nextLine();
				truck.setOriginatingCity(originatingCity);;
				System.out.println("The truck originating city is now: " + truck.getOriginatingCity());
				break;
			}
			catch(Exception e){
				System.out.println("\nInvalid Input. Please enter a valid input.");
			}
		}
	}
	/**
	 * To display a prompt to enter a truck destination city
	 * Sets the truck destination city
	 * Re-prompts user if scanner is closed or input is null
	 * @param keyboardInput Scanner taking keyboard input
	 * @param truck Truck object to be instantiated
	 */
	public static void destinationCityPrompt(Scanner keyboardInput, Truck truck){
		System.out.println("\nThe truck destination city is: " + truck.getDestinationCity());
		
		while (true) {
			System.out.print("Please enter a new truck destination city: ");
			try {
				String destinationCity = keyboardInput.nextLine();
				truck.setDestinationCity(destinationCity);;
				System.out.println("The truck destination city is now: " + truck.getDestinationCity());
				break;
			}
			catch(Exception e){
				System.out.println("\nInvalid Input. Please enter a valid input.");
			}
		}
	}
	
	/**
	 * To display a prompt to enter a package tracking number and weight
	 * Sets a package tracking number
	 * Sets a package weight
	 * Re-prompts user if tracking number is < 9 or > 9 characters
	 * Re-prompts user if weight is not of double type 
	 * Displays the shipping cost of the package if the package weight and tracking number is valid as determined in the load() method
	 * @param keyboardInput Scanner taking keyboard input
	 * @param truck Truck object to be instantiated
	 */
	public static void option2Prompt(Scanner keyboardInput, Truck truck){
		
		double packageWeightInput;
		String trackingNumberInput;
		
		while(true)	{
			System.out.print("\nPlease enter a 9-digit tracking number: ");
			try	{
				trackingNumberInput = keyboardInput.nextLine();
				if (trackingNumberInput.length() > 9 || trackingNumberInput.length() < 9) {
					throw new InvalidInputChoiceException();
				}
				break;
			}
			catch(InvalidInputChoiceException e){
				System.out.println("\n" + e.getMessage());
				System.out.println("\nPlease enter a valid input");
			}
		}
		while (true) {
			System.out.print("\nPlease enter a package weight in pounds: ");
			
			try {
				packageWeightInput = Double.parseDouble(keyboardInput.nextLine()); 
				break;
			}
			catch(Exception e){
			System.out.println("\nInvalid Input. Please enter a valid input.");
			}
		}
		if (truck.load(trackingNumberInput, packageWeightInput)) {
			System.out.println("\nThe shipping cost of package #" + (truck.getNumberOfPackage()) + " is " + truck.getPackageFromPackageList((truck.getNumberOfPackage()-1)).getShippingCost());
		}
	}
	/**
	 * To display a prompt to unload a package from the truck
	 * Displays the list of the package loaded in the truck
	 * Prompts user to enter a package # to be unloaded
	 * Re-prompts user if input is not of integer type
	 * Re-prompts user if package number is the index of a package is null 
	 * @param keyboardInput Scanner taking keyboard input
	 * @param truck Truck object to be instantiated
	 */
	public static void unloadPrompt(Scanner keyboardInput, Truck truck){ 
		System.out.println("\nPackage list:");
		
		truck.displayPackageList(); 
	
		while (true) 
		{
			System.out.print("Which package would you like to unload? Please enter the package #: "); 
			try
			{
				int packageNumberInput = Integer.parseInt(keyboardInput.nextLine());
				truck.unload(packageNumberInput-1); 
				System.out.println("\nUpdated Package list:");
				truck.displayPackageList();			
				break;
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("\nThe package # does not exist. Please enter a valid input\n");
			}
			catch(Exception e){
				System.out.println("\nInvalid Input. Please enter a valid input.");
			}
		}
	}
			

	/**
	 * To display the number of packages loaded into the truck
	 * @param truck Truck object that holds the loaded packages
	 */
	public static void numberOfPackagesMessage(Truck truck){
		System.out.println("\nThe truck is loaded with " + truck.getNumberOfPackage() + " packages");
	}
	
	/**
	 * To display the gross income generated by the truck
	 * @param truck Truck object that holds the gross income
	 */
	public static void grossIncomeMessage(Truck truck){
		System.out.println("\nThe gross income generated by the shipment is " + truck.getGrossIncome());
	}
	
	/**
	 * To display the gross weight of the truck
	 * @param truck Truck object that holds the gross weight
	 */
	public static void weightTruckMessage(Truck truck){
		System.out.println("\nThe gross weight of the truck is " + truck.getGrossWeight());
	}
	
	/**
	 * To display a message that the truck is being driven from the originating city to the destination city
	 * @param truck Truck object that holds the driver name, originating city, destination city
	 */
	public static void driveTruckToDestinationMessage(Truck truck){
		System.out.println("\nThe truck driven by " + truck.getDriverName() + " has left " + truck.getOriginatingCity() + " and is driving to " + truck.getDestinationCity());
	}
	
	/**
	 * To display a program closing message
	 */
	public static void toQuitMessage(){
		System.out.println("\n-----------------------------------------------------");
		System.out.println("Thank you for using Truck Activity Management Program");
		System.out.println("-----------------------------------------------------");
	}
}
