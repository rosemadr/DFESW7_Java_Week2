package garage_exercise;

public class Car extends Vehicle {
	

	public Car(String type, String movementType, String manufacturer, String name, int maxSpeed, boolean isWorking, int numOfWheels) {
		super("Car", "driv", manufacturer, name, maxSpeed, isWorking, numOfWheels);
		

	}
	
	@Override
	public String toString() {
		return "VEHICLE TYPE: " + getType() + "\nName: " + getName() + ", Manufacturer: " +getManufacturer() + 
				"\nMaximum Speed: " + getMaxSpeed() + "km/h, Number of wheels: " + getNumOfWheels() +  ".\n";
	}
}
