package library;

public class Map extends Item {

	private String location;

	public Map(String type, int id, int borrowLength, String title, String publisher, int availableStock,
			String location) {
		super("Map", id, borrowLength, title, publisher, availableStock);
		this.location = location;

	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Map [location=" + location + ", getType()=" + getType() + ", getId()=" + getId()
				+ ", getBorrowLength()=" + getBorrowLength() + ", getTitle()=" + getTitle() + ", getPublisher()="
				+ getPublisher() + ", getAvailableStock()=" + getAvailableStock() + "]";
	}

	@Override
	public boolean canBeBorrowed(Item item) {
		if (item instanceof Map) {
			return false;
		} else {
			return true;
		}

	}

	@Override
	public void calcBorrowLen(Item item) {
		if (item instanceof Map) {
			item.setBorrowLength(0);
		}
	}

}
