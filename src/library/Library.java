package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Item> libraryItems = new ArrayList<Item>();

	List<User> libraryUsers = new ArrayList<User>();

	private int idCount;
	private int userCount;

	public void addToLibrary(Item item) {
		++idCount;
		item.setId(idCount);
		libraryItems.add(item);
	}

	public void addUser(User input) {
		++userCount;
		input.setUserID(userCount);
		libraryUsers.add(input);

	}

	private boolean validateItem(Item item) {
		for (Item i : libraryItems) {
			if (i.equals(item)) {
				return true;
			}
		}
		return false;
	}

	private boolean validateUser(User user) {
		for (User i : libraryUsers) {
			if (i.equals(user)) {
				return true;
			}
		}
		return false;
	}

	public void removeFromLibrary(Item item) {
		if (validateItem(item) == true) {
			libraryItems.remove(item);
		} else {
			System.out.println("Invalid item. Cannot remove that item as item not found.");
		}
	}

	public void removeUser(User user) {
		if (validateUser(user) == true) {
			libraryUsers.remove(user);
		} else {
			System.out.println("Invalid user. Cannot remove that user as user not found.");
		}
	}

	public void setupItem(Item item) {
		if (validateItem(item) == true) {

		} else {
			System.out.println("Invalid item. Cannot remove that item as item not found.");
		}

	}

	public void checkoutItem(Item item, User user) {
		if (validateItem(item) == true & validateUser(user) == true) {
			if (item.canBeBorrowed(item) == true) {
				if (item.getAvailableStock() > 0) {
					user.addItemsBorrowed(item);
					item.setAvailableStock(item.getAvailableStock() - 1);
					System.out.println("User " + user.getForename() + " " + user.getSurname() + " has now borrowed the "
							+ item.getType().toLowerCase() + " " + item.getTitle() + " this item is due back in "
							+ item.getBorrowLength() + " days.");
// look up time Java imports and add time info to this method
				} else {
					System.out.println("This item can be borrowed, however it is not available at this current time.");
//				later add a place on hold method
				}
			} else {
				System.out.println(
						"Unfortunately this item cannot be borrowed, it is only available for on premises reading.");
			}
		} else {
			System.out.println("Invalid item or user, please try again.");
		}
	}

	public void returnItem(Item item, User user) {
		if (validateItem(item) == true & validateUser(user) == true) {
			for (Item i : user.getItemsBorrowed()) {
				if (i.equals(item)) {
					user.removeItemsBorrowed(item);
					item.setAvailableStock(item.getAvailableStock() + 1);
					System.out.println(item + " has sucessfull been returned, thank you.");
//					give item overdue boolean attribute? 
				}
			}
		} else {
			System.out.println("Invalid item or user, please try again.");
		}
	}

}
