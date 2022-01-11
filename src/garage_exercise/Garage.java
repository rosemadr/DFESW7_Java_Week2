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
			v.toString();
		}
	}
	
	public void removeFromGarage(String vName) {
		
		for (Vehicle i: this.garageContents) {
			if (i.getName().equalsIgnoreCase(vName)) {
				garageContents.remove(i);
			}	
			
					
//					i.garageContents.getName().equals
//					
//					garageContents.get(i).getName.equalsIgnoreCase(vName)) {
//				

		}
	}

}
