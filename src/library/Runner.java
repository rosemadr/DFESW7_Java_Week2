package library;

public class Runner {

	public static void main(String[] args) {

		User me = new User(0, "Simcock-Brown", "Madeleine", null, false);

		System.out.println(me.toString());

		Book b1 = new Book("Book", 0, 0, "Mona Lisa Overdrive", "Grafton", 1, "Gibson, William", "SF", false);

		b1.calcBorrowLen(b1);

		System.out.println(b1.toString());

		Library library = new Library();

		library.addToLibrary(b1);

		library.addUser(me);

		library.checkoutItem(b1, me);

	}

}
