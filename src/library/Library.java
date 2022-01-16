package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Item> libraryItems = new ArrayList<Item>();

	List<User> libraryUsers = new ArrayList<User>();

	private int idCount;
	private int userCount;

	public void addToLibrary(Item input) {
		++idCount;
		input.setId(idCount);
		libraryItems.add(input);
	}

	public void addUser(User input) {
		++userCount;
		input.setUserID(idCount);
		libraryUsers.add(input);
	}

}
