package week2_main;

import java.util.ArrayList;
import java.util.List;

public class People {
	
	public List<Person> listOfPeople = new ArrayList<>();
	
	public void printAllPeople() {
		
		for (int i = 0; i < listOfPeople.size(); i++) {
			
			System.out.println(listOfPeople.get(i));
		}
	}
	
	public void findByName(String name) {
		
		for (int i = 0; i < listOfPeople.size(); i++) {
			
			if (listOfPeople.get(i).getName().equalsIgnoreCase(name)) {
				
			listOfPeople.get(i).introduce();
				
			}
		
	}
	
}	

}
