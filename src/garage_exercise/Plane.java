package garage_exercise;

public class Plane extends Vehicle {

	private int maxAltitude;

	public Plane(String type, String movementType, String manufacturer, String name, int maxSpeed, boolean isWorking,
			int numOfWheels, int maxAltitude) {
		super("Plane", "fly", manufacturer, name, maxSpeed, isWorking, numOfWheels);
		this.maxAltitude = maxAltitude;

	}

	public int getMaxAltitude() {
		return maxAltitude;
	}

	public void setMaxAltitude(int maxAltitude) {
		this.maxAltitude = maxAltitude;
	}

	public String initiateTakeoff() {
		String takeoffStr = "This " + getName() + " is taking off!";

		return takeoffStr;
	}

	@Override
	public String toString() {
		return "VEHICLE TYPE: " + getType() + "\nName: " + getName() + ", Manufacturer: " + getManufacturer()
				+ "\nMaximum Speed: " + getMaxSpeed() + "km/h, Number of wheels: " + getNumOfWheels()
				+ ", Maximum alitiude: " + getMaxAltitude() + "m.\n";
	}

}