package week2_main;

import java.util.ArrayList;
import java.util.List;

public class People {

	private List<Person> listOfPeople = new ArrayList<>();

	public void addPerson(Person p) {
		this.listOfPeople.add(p);
	}

	public void printAllPeople() {

//		for (int i = 0; i < listOfPeople.size(); i++) {

		for (Person p : this.listOfPeople) {
			p.introduce();

		}
	}

	public Person findByName(String name) {
		
		Person foundPerson = null;

		for (int i = 0; i < listOfPeople.size(); i++) {

			if (listOfPeople.get(i).getName().equalsIgnoreCase(name)) {

			foundPerson =  listOfPeople.get(i);

			}

		} return foundPerson;

	}

}
