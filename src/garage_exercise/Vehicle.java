package garage_exercise;

import java.util.Objects;

public class Vehicle {
	
	//attributes
	
	private String movementType;
	private String manufacturer;
	private String name;
	private int maxSpeed;
	private boolean isWorking;
	private int numOfWheels;
	private String type;
	
	//constructor
	
	

	public Vehicle(String type, String movementType, String manufacturer, String name, int maxSpeed, boolean isWorking, int numOfWheels) {
		super();
		this.type = type;
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
	
	@Override
	public int hashCode() {
		return Objects.hash(isWorking, manufacturer, maxSpeed, movementType, name, numOfWheels);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return isWorking == other.isWorking && Objects.equals(manufacturer, other.manufacturer)
				&& maxSpeed == other.maxSpeed && Objects.equals(movementType, other.movementType)
				&& Objects.equals(name, other.name) && numOfWheels == other.numOfWheels;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
		return "Vehicle Type: " + getType() + "\nName: " + name + ", Manufacturer: " + manufacturer + 
				", Maximum Speed: " + maxSpeed + "km/h, Number of wheels: " + numOfWheels + ".\n";
	}
	
	
	
	
	
	
	

}
