package library;

import java.util.ArrayList;
import java.util.List;

public class User {

	private int userID;
	private String surname;
	private String forename;
	private List<Item> itemsBorrowed = new ArrayList<>();
	private boolean overdueItems;

	public User(int userID, String surname, String forename, List<Item> itemsBorrowed, boolean overdueItems) {
		super();
		this.userID = userID;
		this.surname = surname;
		this.forename = forename;
		this.itemsBorrowed = itemsBorrowed;
		this.overdueItems = overdueItems;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public List<Item> getItemsBorrowed() {
		return itemsBorrowed;
	}

	public void addItemsBorrowed(Item item) {
		this.itemsBorrowed.add(item);
	}

	public void removeItemsBorrowed(Item item) {
		this.itemsBorrowed.remove(item);
	}

	public boolean isOverdueItems() {
		return overdueItems;
	}

	public void setOverdueItems(boolean overdueItems) {
		this.overdueItems = overdueItems;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", surname=" + surname + ", forename=" + forename + ", itemsBorrowed="
				+ itemsBorrowed + ", overdueItems=" + overdueItems + "]";
	}

}
