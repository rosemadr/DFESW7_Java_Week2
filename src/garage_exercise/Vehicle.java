package garage_exercise;

public class Vehicle {
	
	//attributes
	
	private String movementType;
	private String manufacturer;
	private String name;
	private int maxSpeed;
	private boolean isWorking;
	private int numOfWheels;
	
	//constructor
	
	public Vehicle(String movementType, String manufacturer, String name, int maxSpeed, boolean isWorking, int numOfWheels) {
		super();
		this.movementType = movementType;
		this.manufacturer = manufacturer;
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.isWorking = isWorking;
		this.numOfWheels = numOfWheels;
	}

	public void move() {
		
		if (isWorking == true) {		
		System.out.println("This " + getName() + " is " + getMovementType() + "ing.");
		
		} else { System.out.println("Sorry this " + getName() + " is broken.");
		
		}
	}
	
	public String getMovementType() {
		return movementType;
	}
	public void setMovementType(String movementType) {
		this.movementType = movementType;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public boolean isWorking() {
		return isWorking;
	}

	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numberOfWheels) {
		this.numOfWheels = numberOfWheels;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Movement Type: " + movementType + ", Manufacturer: " + manufacturer + 
				", Maximum Speed: " + maxSpeed + "km/h, Number of wheels: " + numOfWheels + ".";
	}
	
	
	
	
	
	
	

}
