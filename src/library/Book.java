package library;

public class Book extends Item {

	private String author;
	private String genre;
	private boolean isHardcover;

	public Book(String type, int id, int borrowLength, String title, String publisher, int availableStock,
			String author, String genre, boolean isHardcover) {
		super("Book", id, borrowLength, title, publisher, availableStock);
		this.author = author;
		this.genre = genre;
		this.isHardcover = isHardcover;
	}

	public boolean isHardcover() {
		return isHardcover;
	}

	public void setHardcover(boolean isHardcover) {
		this.isHardcover = isHardcover;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public boolean canBeBorrowed(Item item) {
		if (item.getAvailableStock() > 0) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public void calcBorrowLen(Item itemB) {
		Book book = (Book) itemB;
		if (book.isHardcover == true) {
			book.setBorrowLength(7);
		} else {
			book.setBorrowLength(14);
		}
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", genre=" + genre + ", getType()=" + getType() + ", getId()=" + getId()
				+ ", getBorrowLength()=" + getBorrowLength() + ", getTitle()=" + getTitle() + ", getPublisher()="
				+ getPublisher() + ", getAvailableStock()=" + getAvailableStock() + "]";

	}

}
