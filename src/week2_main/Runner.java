package week2_main;

public class Runner {

	public static void main(String[] args) {
		
		Person person1 = new Person("Madi", 26, "Training to be a Software Dev");
		Person person2 = new Person("Sue", 26, "PhD student");
		Person person3 = new Person("Milli", 22, "Undergrad");
		
		People people = new People();
		
		people.listOfPeople.add(person1);
		people.listOfPeople.add(person2);
		people.listOfPeople.add(person3);
		
////		person1.introduce();
//		
//		People.printAllPeople();
//		
//		System.out.println(People.listOfPeople);
		
		people.findByName("Sue");

	}

}
