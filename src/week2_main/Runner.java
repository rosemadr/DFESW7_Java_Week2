package week2_main;

public class Runner {

	public static void main(String[] args) {
		
		Person person1 = new Person("Madi", 26, "Training to be a Software Dev");
		Person person2 = new Person("Sue", 26, "PhD student");
		Person person3 = new Person("Milli", 22, "Undergrad");
		Person person4 = new Person("Tim", 59, "Software Dev Team Lead");
		
		People people = new People();
		
		people.addPerson(person1);
		people.addPerson(person2);
		people.addPerson(person3);
		
////		person1.introduce();
//		
//		People.printAllPeople();
//		
//		System.out.println(People.listOfPeople);
		
		people.findByName("madi");

	}

}
