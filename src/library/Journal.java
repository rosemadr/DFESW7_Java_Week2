package library;

public class Journal extends Item {

	private int volumeNum;
	private String subject;
	private boolean isDigital;

	public Journal(String type, int id, int borrowLength, String title, String publisher, int availableStock,
			int volumeNum, String subject, boolean isDigital) {
		super("Journal", id, borrowLength, title, publisher, availableStock);
		this.volumeNum = volumeNum;
		this.subject = subject;
		this.isDigital = isDigital;
	}

	@Override
	public boolean canBeBorrowed(Item itemJ) {
		Journal journal = (Journal) itemJ;
		if (journal.isDigital == true) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void calcBorrowLen(Item item) {
		if (canBeBorrowed(item) == true) {
			item.setBorrowLength(14);
		} else {
			item.setBorrowLength(0);
		}
	}

	@Override
	public String toString() {
		return "Item type: " + getType() + ", title: " + getTitle() + ", publisher: " + getPublisher()
				+ ",\nsubject(s): " + getSubject() + ", digital copy: " + isDigital() + ", library id no.: " + getId()
				+ ", borrow length: " + getBorrowLength() + " days, available stock: " + getAvailableStock()
				+ " copies.";
	}

	public int getVolumeNum() {
		return volumeNum;
	}

	public void setVolumeNum(int volumeNum) {
		this.volumeNum = volumeNum;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public boolean isDigital() {
		return isDigital;
	}

	public void setDigital(boolean isDigital) {
		this.isDigital = isDigital;
	}

}
