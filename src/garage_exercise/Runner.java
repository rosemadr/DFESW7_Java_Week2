package garage_exercise;

public class Runner {

	public static void main(String[] args) {
		
	Plane plane1 = new Plane("", "","British Aircraft Corporation and Sud Aviation", "Concorde",2180,false,10,18000);
	
//	System.out.println(plane1.toString());
	
//	plane1.move();
	
	Motorbike bike1 = new Motorbike("", "", "Harley-Davidson", "Street Bob", 200, false, 2, false);
	
//	System.out.println(bike1.toString());
	
	Garage garage = new Garage();
	
	Car car1 = new Car("", "", "Ford", "R209GGX", 100, false, 4);
	Car car2 = new Car("", "", "VW", "EN62", 120, true, 4);
	garage.addToGarage(bike1);
	garage.addToGarage(car1);
	garage.addToGarage(car2);
	garage.addToGarage(plane1);
//	
	garage.printGarage();
	
	bike1.addSidecar();
	
	garage.fixVehicle("street bob");
//	
//	garage.fixVehicle("Concorde");
//	
//	System.out.println(plane1.isWorking());
//	
//	garage.removeAllType("car");
	
	garage.printGarage();
	
	
	
	
	}
	

}
