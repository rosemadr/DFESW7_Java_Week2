package garage_exercise;

public class Motorbike extends Vehicle {

	private boolean hasSidecar;

	public Motorbike(String type, String movementType, String manufacturer, String name, int maxSpeed,
			boolean isWorking, int numOfWheels, boolean hasSidecar) {
		super("Motorbike", "driv", manufacturer, name, maxSpeed, isWorking, numOfWheels);
		this.hasSidecar = hasSidecar;

	}

	public void addSidecar() {

		if (hasSidecar == true) {
			System.out.println("This motorbike already has a sidecar.\n");
		} else {
			hasSidecar = true;
			int numWheels = getNumOfWheels();
			numWheels += 1;
			setNumOfWheels(numWheels);
			int maxSpeed = getMaxSpeed();
			maxSpeed -= 100;
			setMaxSpeed(maxSpeed);


		}

	}

	public boolean getSidecar() {
		return hasSidecar;
	}

	@Override
	public String toString() {
		return "VEHICLE TYPE: " + getType() + "\nName: " + getName() + ", Manufacturer: " + getManufacturer()
				+ "\nMaximum Speed: " + getMaxSpeed() + "km/h, Number of wheels: " + getNumOfWheels()
				+ "\nCurrently has sidecar: " + hasSidecar + ".\n";
	}

}
