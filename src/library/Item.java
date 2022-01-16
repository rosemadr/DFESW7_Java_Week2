package library;

public abstract class Item {
	private String type;
	private int id;
	private int borrowLength;
	private String title;
	private String publisher;
	private int availableStock;

	public Item(String type, int id, int borrowLength, String title, String publisher, int availableStock) {
		super();
		this.type = type;
		this.id = id;
		this.borrowLength = borrowLength;
		this.title = title;
		this.publisher = publisher;
		this.availableStock = availableStock;
	}

	public abstract boolean canBeBorrowed(Item item);

	public abstract void calcBorrowLen(Item item);

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBorrowLength() {
		return borrowLength;
	}

	public void setBorrowLength(int borrowLength) {
		this.borrowLength = borrowLength;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getAvailableStock() {
		return availableStock;
	}

	public void setAvailableStock(int availableStock) {
		this.availableStock = availableStock;
	}

	@Override
	public String toString() {
		return "Item [type=" + type + ", id=" + id + ", borrowLength=" + borrowLength + ", title=" + title
				+ ", publisher=" + publisher + ", availableStock=" + availableStock + "]";
	}

}
