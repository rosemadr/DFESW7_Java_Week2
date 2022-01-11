package garage_exercise;

public class Motorbike extends Vehicle {
	
	private boolean hasSidecar;
	

	public Motorbike(String movementType, String manufacturer, String name, int maxSpeed, boolean isWorking, int numOfWheels, boolean hasSidecar) {
		super("driv", manufacturer, name, maxSpeed, isWorking, numOfWheels);
		this.hasSidecar = hasSidecar;
		
	}
	
	public void addSidecar() {
		
		if (hasSidecar == true) {
			System.out.println("This motorbike already has a sidecar.");
			} else { 
				hasSidecar = true;
				int numWheels = getNumOfWheels();
				numWheels +=1;
				setNumOfWheels(numWheels);
//		decrease max speed
	
				
				
			}
		
	}

	@Override
	public String toString() {
		return "VEHICLE TYPE: Motorbike;\nName: " + getName() + ", Manufacturer: " +getManufacturer() + 
				"\nMaximum Speed: " + getMaxSpeed() + "km/h, Number of wheels: " + getNumOfWheels() +  "\nCurrently has sidecar: " + hasSidecar + ".";
	}

}
