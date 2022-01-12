package garage_exercise;

import java.util.ArrayList;
import java.util.List;

//Using Vehicle as a base class, create three derived classes (Car, Motorbike, etc.). Each derived class should have its own attributes in addition to the normal Vehicle attributes.
//
//Using a List<> implementation, store all your Vehicles in a Garage class.
//
//Create a method in Garage that iterates through each Vehicle, calculating a bill for each type of Vehicle in a different way, depending on the type of Vehicle it is (this does not need to be complex).
//
//Garage should have methods that add a Vehicle, remove a Vehicle by its ID or its type, fix a Vehicle (which calculates the bill) and to empty the Garage.
//
//Garage should have a method to remove multiple Vehicles by their type.

public class Garage {

	private List<Vehicle> garageContents = new ArrayList<>();

	public void addToGarage(Vehicle v) {
		this.garageContents.add(v);
	}

	public void printGarage() {
		for (Vehicle v : this.garageContents) {
			System.out.println(v);
		}
	}

	public void fixVehicle(String vName) {

//		int bill = 100;

		for (int i = 0; i < garageContents.size(); i++) {
			if (garageContents.get(i).getName().equalsIgnoreCase(vName)) {
				Vehicle vehicle = garageContents.get(i);

				if (vehicle.isWorking() == true) {
					System.out.println("Your vehicle is already working.\n");
				} else {

					vehicle.setWorking(true);

					int bill = vehicle.calcBill();

//					bill = vehicle.getMaxSpeed() * vehicle.getNumOfWheels();
//
//					if (vehicle.getType().equals("Motorbike")) {
//						bill += 100;
//						Motorbike bike = (Motorbike) vehicle;
//						if (bike.getSidecar() == true) {
//							bill += 500;
//						}
//
//					} else if (vehicle.getType().equals("Plane")) {
//						bill += 1500;
//
//					}
//					if (vehicle.getType().equals("Car")) {
//						bill -= 75;

					String billStr = "Your vehicle has been fixed, your invoice for £" + bill
							+ " will be sent to you directly.\n";

					System.out.println(billStr);
				}
			}

		}

	}

	public void removeByName(String vName) {

		for (int i = 0; i < garageContents.size(); i++) {
			if (garageContents.get(i).getName().equalsIgnoreCase(vName)) {
				this.garageContents.remove(i);
				String removeString = "The " + vName + " has been removed from the garage.\n";
				System.out.println(removeString);
			}
		}
	}

	public void removeAllType(String type) {

		for (Vehicle v : new ArrayList<>(this.garageContents)) {
			if (v.getType().equalsIgnoreCase(type)) {
				String vName = v.getName();
				this.garageContents.remove(v);
				String removeString = "The " + vName + " has been removed from the garage.\n";
				System.out.println(removeString);
			}
		}

	}

	public void emptyGarage() {
		this.garageContents.clear();

	}

}