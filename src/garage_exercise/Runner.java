package garage_exercise;

public class Runner {

	public static void main(String[] args) {
		
	Plane plane1 = new Plane("","British Aircraft Corporation and Sud Aviation", "Concorde",2180,false,10,18000);
	
//	System.out.println(plane1.toString());
	
//	plane1.move();
	
	Motorbike bike1 = new Motorbike("", "Harley-Davidson", "Street Bob", 200, true, 2, false);
	
//	System.out.println(bike1.toString());
	
	Garage garage = new Garage();
	
	
	garage.addToGarage(bike1);

	garage.addToGarage(plane1);
	
	garage.printGarage();
	}

}
