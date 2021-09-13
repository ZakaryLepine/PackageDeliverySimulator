package testing_package;
import exception_package.PackageException;
import truck_package.Truck;
public class TruckTesting {

	public static void main(String[] args) {
		
		Truck testTruck = new Truck();
		 
		 System.out.println("Testing truck instantiation: \n");

		 testTruck.setDriverName("Test driver name");
		 System.out.println(testTruck.getDriverName());
		 
		 testTruck.setUnloadedWeight(25);
		 System.out.println(testTruck.getUnloadedWeight());
		 System.out.println(testTruck.toKilograms(testTruck.getUnloadedWeight()));

		 testTruck.setOriginatingCity("Test originating city");
		 System.out.println(testTruck.getOriginatingCity());
		 
		 testTruck.setDestinationCity("Test destination city");
		 System.out.println(testTruck.getDestinationCity());
		 
		 System.out.println("\nTesting load method: \n");
		 System.out.println("Testing for letter tracking number:");
		 testTruck.load("000000000", 1);
		 System.out.println("\n\nTesting for box tracking number: ");
		 testTruck.load("111111111", 1);
		 System.out.println("\n\nTesting for wood crate tracking number: ");
		 testTruck.load("222222222", 1);
		 System.out.println("\n\nTesting for metal crate tracking number: ");
		 testTruck.load("333333333", 1);
		 System.out.println("\n\nTesting for invalid tracking number: ");
		 testTruck.load("999999999", 1);
		 
		 System.out.println("\nTesting for letter invalid weight:");
		 testTruck.load("000000000", 2.1);
		 System.out.println("\nTesting for box invalid weight:");
		 testTruck.load("111111111", 40.1);
		 System.out.println("\nTesting for wood crate invalid weight:");
		 testTruck.load("222222222", 80.1);
		 System.out.println("\nTesting for metal crate invalid weight:");
		 testTruck.load("333333333", 100.1);
		 
		 System.out.println("\nTesting for too many packages:\n");
		 Truck packageLimitTruck = new Truck(1);
		 packageLimitTruck.load("111111111", 0);
		 packageLimitTruck.load("111111111", 0);
		 
		 System.out.println("\nTesting unloading a valid method: \n");
		 System.out.println("Package list before removing letter package:");
		 testTruck.displayPackageList();
		 System.out.println("\nUnloading the letter package and displaying package list: ");
		 try {
			 testTruck.unload(0);
			 testTruck.displayPackageList();
		 }
		 catch(PackageException e) {
			 System.out.println("The package # does not exist. Please enter a valid input");
		 }
		 System.out.println("\nTesting unloading an invalid method: \n");
		 try {
			 testTruck.unload(57);
		 }
		 catch(PackageException e) {
			 System.out.println("The package # does not exist. Please enter a valid input");
		 }
		 
		 System.out.println("\n\nTesting conversion to Kilogram: \n");
		 System.out.println("Truck weight in pounds: " + testTruck.getUnloadedWeight() + " Truck weight in kilograms: " + testTruck.toKilograms(testTruck.getUnloadedWeight()) + "\n");

		 System.out.println("\nTesting conversion to Pounds: \n");
		 System.out.println("Truck weight in kilograms: " + testTruck.toKilograms(testTruck.getUnloadedWeight()) + " Truck weight in pounds: " + testTruck.toPounds(testTruck.toKilograms(testTruck.getUnloadedWeight())) + "\n");
		 
		 System.out.println("\nTesting gross income: \n"); //GROSS INCOME NOT WOKRING
		 System.out.println("Package list:");
		 testTruck.displayPackageList();
		 System.out.println("Gross income: " + testTruck.getGrossIncome() + "\n");
		 
		 System.out.println("\nTesting number of packages loaded: " + testTruck.getNumberOfPackage() + "\n");

		 System.out.println("\nTesting gross weight: \n"); //GROSS WEIGHT NOT WORKING
		 System.out.println("Package list:");
		 testTruck.displayPackageList();
		 System.out.println("Truck unloaded weight:" + testTruck.getUnloadedWeight());
		 System.out.println("Gross weight: " + testTruck.getGrossWeight());
		 
	}
}
